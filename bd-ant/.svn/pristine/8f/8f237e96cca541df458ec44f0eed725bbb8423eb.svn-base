package net.niuniubao.ant.simuwang.main;

import net.niuniubao.ant.simuwang.crawl.JsonCrawl;
import net.niuniubao.ant.simuwang.mapper.SimuWangMapper;
import net.niuniubao.ant.simuwang.model.JsonFundData;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/18.
 * 私募排排网基金列表数据爬取程序
 */
public class JsonFundCrawl extends JsonCrawl<JsonFundData> {

    private static long counter = 0;//列表数据计数器

    private static int page = 1;//分页计数器

    private static int taskCount = 0;//任务计数器,一个线程代表一个任务

    public JsonFundCrawl() {
        super(JsonFundData.class,
                "http://dc.simuwang.com/Screen/getData.html?page=%s&size=100&condition=fund_type:1,6,4,3,8,2,7,5;sort_name:ret_ytd;sort_asc:desc;keyword:;ret:ret_ytd");
    }

    /**
     * 数据处理计数器增加
     */
    @Override
    protected synchronized void addCounter() {
        counter++;
    }


    /**
     * 一个任务处理完成时,当前线程退出,任务计数器减少
     */
    @Override
    protected synchronized void deleteTask() {
        taskCount--;
    }

    protected synchronized void addTask() {
        taskCount++;
    }

    /**
     * 获取一个当前未处理分页,并将分页数下翻
     *
     * @return
     */
    @Override
    protected synchronized int getPage() {
        return page++;
    }

    /**
     * 处理并插入需要插入的数据
     *
     * @param mapper
     * @param entity
     */
    @Override
    protected void insert(SimuWangMapper mapper, JsonFundData entity) {
        entity.setDataVersion(CrawlMain.version);
        entity.setProcStatus(0);
        mapper.insertFundListData(entity);
    }

    public static long getCounter(){
        return counter;
    }

    public static int getTaskCount(){
        return taskCount;
    }
}
