package net.niuniubao.ant.amac.main;

import net.niuniubao.ant.amac.crawl.JsonCrawl;
import net.niuniubao.ant.amac.mapper.AmacMapper;
import net.niuniubao.ant.amac.model.JsonCompanyData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/16.
 */
public class JsonManagerCrawl extends JsonCrawl<JsonCompanyData> {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonManagerCrawl.class);

    private static long counter = 0;//列表数据计数器

    private static int page = 1;//分页计数器

    private static int taskCount = 0;//任务计数器,一个线程代表一个任务


    public JsonManagerCrawl() {
        super(JsonCompanyData.class,
                "http://gs.amac.org.cn/amac-infodisc/api/pof/manager?rand=0.6105541929136962&page=%s&size=100");
    }

    @Override
    protected synchronized int getPage() {
        return page++;
    }

    @Override
    protected void insert(AmacMapper mapper, JsonCompanyData entity) {
        entity.setProcStatus(0);
        entity.setDataVersion(AmacCrawlMain.version);
        mapper.insertCompanyJson(entity);
    }

    @Override
    protected synchronized void addCounter() {
        counter++;
    }

    @Override
    protected synchronized void deleteTask() {
        taskCount--;
    }

    @Override
    protected synchronized void addTask() {
        taskCount++;
    }

    public static long getCounter() {
        return counter;
    }

    public static int getTaskCount() {
        return taskCount;
    }
}
