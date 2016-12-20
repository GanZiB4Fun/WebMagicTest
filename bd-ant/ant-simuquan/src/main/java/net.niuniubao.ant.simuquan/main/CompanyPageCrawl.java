package net.niuniubao.ant.simuquan.main;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.simuquan.crawl.PageCrawl;
import net.niuniubao.ant.simuquan.mapper.SimuquanMapper;
import net.niuniubao.ant.simuquan.model.*;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cuiyingjia on 16/4/26.
 */
public class CompanyPageCrawl extends PageCrawl<CompanyData,CompanyList> {
    private static long counter = 0;

    private static int page = 1;//分页计数器

    private static int taskCount = 0;//任务计数器,一个线程代表一个任务


    public CompanyPageCrawl(Class<CompanyData> aClass) {
        super(aClass);
    }

    /**
     * 处理返回的json数据
     *
     * @param jsonObject
     * @return
     */
    @Override
    protected int proccess(SimuquanMapper mapper,JSONObject jsonObject) {
        Map map = new HashMap();
        map.put("data",CompanyData.class);
        map.put("filing_list",FilingList.class);
        map.put("fund_list",FundList.class);
        map.put("news_list",NewsList.class);
        map.put("manager_list",CompanyManagerList.class);
        Json content = (Json) JSONObject.toBean(jsonObject, Json.class, map);
        CompanyData data = (CompanyData)content.getData();

        List<FundList> fundlists = data.getFund_list();
        List<CompanyManagerList> managerlists = data.getManager_list();
        List<NewsList> newsLists = data.getNews_list();
        List<FilingList> filingLists= data.getFiling_list();

        //插入公司详情信息
        CompanyInfo companyInfo = data.getCompany_info();
        companyInfo.setData_version(SimuquanCrawlMain.VERSION);
        companyInfo.setProc_status(0);
        mapper.insertCompanyInfo(companyInfo);

        //插入news_list
        for (NewsList newsList : newsLists){
            newsList.setData_version(SimuquanCrawlMain.VERSION);
            newsList.setProc_status(0);
            newsList.setCompany_id(data.getCompany_info().getCompany_id());
            mapper.insertNewsList(newsList);
        }
        //插入manager_list
        for (CompanyManagerList managerList : managerlists){
            managerList.setData_version(SimuquanCrawlMain.VERSION);
            managerList.setProc_status(0);
            managerList.setCompany_id(data.getCompany_info().getCompany_id());
            mapper.insertCompanyManagerList(managerList);
        }
        //插入filingList
        for (FilingList filingList : filingLists){
            filingList.setDataVersion(SimuquanCrawlMain.VERSION);
            filingList.setProcStatus(0);
            filingList.setCompany_id(data.getCompany_info().getCompany_id());
            filing(filingList, mapper);
            mapper.insertCompanyFilingList(filingList);
        }


        //TODO 有更加齐全的数据来源 所以在此暂不添加
//        //插入fund_list
//        List<FundList> fundlists = data.getFund_list();
//        for (FundList fundList : fundlists){
//            fundList.setData_version(SimuquanCrawlMain.VERSION);
//            fundList.setProc_status(0);
//            fundList.setCompany_id(data.getCompany_info().getCompany_id());
//            mapper.insertFundList(fundList);
//        }
        return 0;
    }

    @Override
    protected synchronized List<CompanyList> list(SimuquanMapper mapper) {

        List<CompanyList> list = mapper.selectCompanyIdNotProc(0);

        for (CompanyList companyList:list){
            mapper.updateCompanyListStatus(-1,companyList.getCompany_id(),companyList.getDataVersion());
        }

        return list;
    }

    @Override
    protected int listen() {
        return CompanyListCrawl.getTask();
    }

    @Override
    protected List<String> getUrls(List<CompanyList> list) {
        List<String> urls = new ArrayList<String>();
        for (CompanyList data : list) {
            urls.add("http://api.quchaogu.com/fund/company/detail?company_id=" + data.getCompany_id());
        }
        return urls;
    }

    @Override
    protected void insert(Json entity, SimuquanMapper mapper) {}


    @Override
    protected synchronized void addCounter() {
        counter++;
    }

    /**
     * 根据插入的FilingList抓取基金公司档案页面数据
     * @param filingList
     * @param mapper
     */
    protected  void filing(FilingList filingList,SimuquanMapper mapper) {
        String url = "http://api.quchaogu.com/fund/filing/detail?filing_id="+filingList.getFiling_id();
        filingList.setProcStatus(1);
        mapper.updateFilingListStatus(1, filingList.getId(), SimuquanCrawlMain.VERSION);
        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), CompanyFiling.class);
        CompanyFiling companyFiling = ooSpider.get(url);
        companyFiling.setDataVersion(SimuquanCrawlMain.VERSION);
        companyFiling.setProcStatus(0);
        mapper.insertFiling(companyFiling);
    }

    public static long getCounter(){
        return counter;
    }

    public static int getPage() {
        return page++;
    }

    public static int getTaskCount() {
        return taskCount;
    }

    @Override
    protected synchronized void deleteTask() {
        taskCount--;
    }

    @Override
    protected synchronized void addTask() {
        taskCount++;
    }

}
