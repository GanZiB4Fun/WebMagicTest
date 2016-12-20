package net.niuniubao.ant.simuwang.main;

import net.niuniubao.ant.simuwang.crawl.PageCrawl;
import net.niuniubao.ant.simuwang.mapper.SimuWangMapper;
import net.niuniubao.ant.simuwang.model.JsonCompanyData;
import net.niuniubao.ant.simuwang.model.Company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/19.
 * 私募排排网基金公司详情页面抓取
 */
public class CompanyCrawl extends PageCrawl<Company,JsonCompanyData> {

    private static long counter = 0;

    public CompanyCrawl(Class<Company> aClass) {
        super(aClass);
    }

    @Override
    protected List<JsonCompanyData> list(SimuWangMapper mapper) {
        List<JsonCompanyData> list = mapper.selectCompanyIdNotProc(0);
        return list;
    }

    @Override
    protected int listen() {
        return JsonCompanyCrawl.getTaskCount();
    }

    @Override
    protected List<String> getUrls(List<JsonCompanyData> list) {
        List<String> urls = new ArrayList<String>();
        for (JsonCompanyData data : list) {
            urls.add("http://dc.simuwang.com/company/" + data.getCompany_id() + ".html");
        }
        return urls;
    }

    @Override
    protected void insert(Company entity, SimuWangMapper mapper) {
        entity.setDataVersion(CrawlMain.version);
        mapper.insertCompany(entity);
        JsonCompanyData jsonData = new JsonCompanyData();
        jsonData.setCompany_id(entity.getCompanyId());
        jsonData.setProcStatus(1);
        mapper.updateCompanyListStatus(jsonData);
    }

    @Override
    protected synchronized void addCounter() {
          counter++;
    }

    public static long getCounter(){
        return counter;
    }
}
