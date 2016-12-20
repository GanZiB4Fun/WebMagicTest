package net.niuniubao.ant.simuwang.main;

import net.niuniubao.ant.simuwang.crawl.JsonCrawl;
import net.niuniubao.ant.simuwang.mapper.SimuWangMapper;
import net.niuniubao.ant.simuwang.model.JsonCompanyData;

/**
 * Created by ganjianwei on 2016/4/18.
 * 私募排排网基金公司列表数据爬取程序
 */
public class JsonCompanyCrawl extends JsonCrawl<JsonCompanyData> {

    private static long counter = 0;//列表数据计数器

    private static int page = 1;//分页计数器

    private static int taskCount = 0;//任务计数器,一个线程代表一个任务

    public JsonCompanyCrawl() {
        super(JsonCompanyData.class,
                "http://dc.simuwang.com/Company/get.html?page=%s&fund_type:1,6,4,3,8,2,7,5;sort_name:ret_incep;sort_asc:desc");
    }

    @Override
    protected synchronized int getPage(){
        return page++;
    }

    @Override
    protected void insert(SimuWangMapper mapper, JsonCompanyData entity) {
        entity.setDataVersion(CrawlMain.version);
        entity.setProcStatus(0);
        mapper.insertCompanyListData(entity);
    }

    @Override
    protected void addCounter() {
        counter++;
    }

    @Override
    protected void deleteTask() {
        taskCount--;
    }

    @Override
    protected void addTask() {
        taskCount++;
    }

    public static long getCounter(){
        return counter;
    }

    public static int getTaskCount() {
        return taskCount;
    }
}
