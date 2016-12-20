package net.niuniubao.ant.simuwang;

import net.niuniubao.ant.Page;
import net.niuniubao.ant.Request;
import net.niuniubao.ant.Site;
import net.niuniubao.ant.Task;
import net.niuniubao.ant.downloader.Downloader;
import net.niuniubao.ant.downloader.HttpClientDownloader;
import net.niuniubao.ant.model.ModelPageProcessor;
import net.niuniubao.ant.processor.PageProcessor;
import net.niuniubao.ant.simuwang.model.Fund;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.UUID;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/19.
 * 轻量级的爬取解决方案
 * 使用Downloader和PageProccess处理
 */
public class SimpleAntTest implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleAntTest.class);

    private Site site;

    private String uuid;

    public static void main(String[] args) {

        for (int i = 0; i<10; i++){

//            long start2 = new Date().getTime();
//
//            OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), SimuWangFundObj.class);
//            SimuWangFundObj obj2 = ooSpider.get("http://dc.simuwang.com/product/HF0000115X.html");
//            long stop2 = new Date().getTime();
//            LOGGER.info("step2 stop[" + (stop2 - start2) + "]");

        long start1 = new Date().getTime();

        SimpleAntTest simpleAntTest = new SimpleAntTest();

        PageProcessor pageProcessor = ModelPageProcessor.create(simpleAntTest.getSite(), Fund.class);

        Request request = new Request("http://dc.simuwang.com/product/HF0000115X.html");

        Downloader downloader = new HttpClientDownloader();

        Page page = downloader.download(request, simpleAntTest);

        pageProcessor.process(page);

        Fund obj1 = page.getResultItems().get(Fund.class.getCanonicalName());
        long stop1 = new Date().getTime();
        LOGGER.info("step1 stop["+(stop1-start1)+"]"+obj1);
//
//
//
//        if (obj1.equals(obj2)){
//            LOGGER.info("对象完全相同[obj1]["+obj1+"]obj2["+obj2+"]");
//        }else {
//            LOGGER.info("对象存在差异[obj1]["+obj1+"]obj2["+obj2+"]");
//        }
        }



    }

    public static void main2(String[] args){

    }

    @Override
    public String getUUID() {
        if (uuid == null)
            uuid = UUID.randomUUID().toString();
        return uuid;
    }

    @Override
    public Site getSite() {
        if (site == null)
            site = Site.me();
        return site;
    }
}
