package net.niuniubao.ant.simuwang.main;

import net.niuniubao.ant.simuwang.crawl.PageCrawl;
import net.niuniubao.ant.simuwang.mapper.SimuWangMapper;
import net.niuniubao.ant.simuwang.model.JsonManagerData;
import net.niuniubao.ant.simuwang.model.Manager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/19.
 */
public class ManagerCrawl extends PageCrawl<Manager,JsonManagerData> {

    private static long counter = 0;

    public ManagerCrawl() {
        super(Manager.class);
    }

    @Override
    protected List<JsonManagerData> list(SimuWangMapper mapper) {
        List<JsonManagerData> list = mapper.selectManagerIdNotProc(0);
        return list;
    }

    @Override
    protected int listen() {
        return JsonManagerCrawl.getTaskCount();
    }

    @Override
    protected List<String> getUrls(List<JsonManagerData> list) {
        List<String> urls = new ArrayList<String>();
        for (JsonManagerData data : list) {
            urls.add("http://dc.simuwang.com/manager/" + data.getFund_manager_id() + ".html");
        }
        return urls;
    }

    @Override
    protected void insert(Manager entity, SimuWangMapper mapper) {
        entity.setDataVersion(CrawlMain.version);
        mapper.insertManager(entity);
        JsonManagerData jsonData = new JsonManagerData();
        jsonData.setFund_manager_id(entity.getManagerId());
        jsonData.setProcStatus(1);
        mapper.updateManagerListStatus(jsonData);
    }

    @Override
    protected void addCounter() {
            counter++;
    }

    public static long getCounter(){
        return counter;
    }
}

