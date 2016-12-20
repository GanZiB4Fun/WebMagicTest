package net.niuniubao.ant.simuwang.main;


import net.niuniubao.ant.simuwang.crawl.PageCrawl;
import net.niuniubao.ant.simuwang.mapper.SimuWangMapper;
import net.niuniubao.ant.simuwang.model.JsonFundData;
import net.niuniubao.ant.simuwang.model.Fund;

import java.util.ArrayList;
import java.util.List;

/**
 * add by xiaoming@niuniubao.net
 * 私募排排网 基金主要信息抓取程序
 */
public class FundCrawl extends PageCrawl<Fund,JsonFundData> {

    private static long counter = 0;

    public FundCrawl(Class<Fund> aClass) {
        super(aClass);
    }

    @Override
    protected List<JsonFundData> list(SimuWangMapper mapper) {
        List<JsonFundData> list = mapper.selectFundIdNotProc(0);
        return list;
    }

    @Override
    protected int listen() {
        return JsonFundCrawl.getTaskCount();
    }

    @Override
    protected List<String> getUrls(List<JsonFundData> list) {
        List<String> urls = new ArrayList<String>();
        for (JsonFundData data : list) {
            urls.add("http://dc.simuwang.com/product/" + data.getFund_id() + ".html");
        }
        return urls;
    }

    @Override
    protected void insert(Fund entity,SimuWangMapper mapper) {
        entity.setDataVersion(CrawlMain.version);
        mapper.insertFund(entity);

        JsonFundData jsonData = new JsonFundData();
        jsonData.setFund_id(entity.getFundId());
        jsonData.setProcStatus(1);
        mapper.updateFundListStatus(jsonData);
    }

    @Override
    protected synchronized void addCounter() {
          counter++;
    }

    public static long getCounter(){
        return counter;
    }
}
