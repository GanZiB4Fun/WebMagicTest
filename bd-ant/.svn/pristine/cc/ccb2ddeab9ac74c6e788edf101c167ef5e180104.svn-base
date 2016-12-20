package net.niuniubao.ant.simuquan.main;

import net.niuniubao.ant.simuquan.crawl.JsonCrawl;
import net.niuniubao.ant.simuquan.mapper.SimuquanMapper;
import net.niuniubao.ant.simuquan.model.CompanyList;
import net.niuniubao.ant.simuquan.model.CompanyListData;

import java.util.Map;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/25.
 * 基金公司列表抓取程序
 */
public class CompanyListCrawl extends JsonCrawl<CompanyListData> {

    private static int page = 1;
    private static int task = 0;
    private static long counter = 0;//列表数据计数器


    public CompanyListCrawl(Map<String, Class> map) {
        super("http://api.quchaogu.com/fund/company/list?page=%s", map);
    }

    @Override
    protected void process(SimuquanMapper mapper, CompanyListData data) {
             for (CompanyList company:data.getCompany_list()){
                 company.setDataVersion(SimuquanCrawlMain.VERSION);
                 company.setProcStatus(0);
                 mapper.insertCompanyList(company);
                 addCounter();
             }
    }

    @Override
    protected synchronized int getPage() {
        return page++;
    }

    @Override
    protected synchronized void deleteTask() {
        task--;
    }

    @Override
    protected synchronized void addTask() {
        task++;
    }

    public static int getTask(){
        return task;
    }

    @Override
    protected boolean hasMore(CompanyListData data) {

        if (data == null || data.getCompany_list().size() == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 数据处理计数器增加
     */
    protected synchronized void addCounter() {
        counter++;
    }

    public static long getCounter(){
        return counter;
    }


}
