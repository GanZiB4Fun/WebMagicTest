package net.niuniubao.ant.simuwang.main;

import net.niuniubao.ant.mybatis.MybatisSession;
import net.niuniubao.ant.simuwang.model.Company;
import net.niuniubao.ant.simuwang.model.Fund;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/19.
 */
public class CrawlMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrawlMain.class);

    //数据版本
    public static String version;

    public static void main(String[] args) {

        version = "v1.0.0";

        Date startTime = new Date();

        ExecutorService exec = Executors.newFixedThreadPool(30);

        MybatisSession session = MybatisSession.mybatisSession();

        for (int i = 0; i < 10; i++) {
            exec.execute(new JsonFundCrawl());
        }
        for (int i = 0; i < 10; i++) {
            exec.execute(new JsonCompanyCrawl());
        }
        for (int i = 0; i < 10; i++) {
            exec.execute(new JsonManagerCrawl());
        }
        exec.shutdown();

        FundCrawl fundCrawl = new FundCrawl(Fund.class);
        fundCrawl.start();

        CompanyCrawl companyCrawl = new CompanyCrawl(Company.class);
        companyCrawl.start();

        ManagerCrawl managerCrawl = new ManagerCrawl();
        managerCrawl.start();

        while (fundCrawl.getState() != Thread.State.TERMINATED
                || companyCrawl.getState() != Thread.State.TERMINATED
                || managerCrawl.getState() != Thread.State.TERMINATED) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            LOGGER.info("基金产品列表抓取线程数量[{}],已抓取数据[{}]条", JsonFundCrawl.activeCount(), JsonFundCrawl.getCounter());
            LOGGER.info("基金公司列表抓取线程数量[{}],已抓取数据[{}]条", JsonCompanyCrawl.activeCount(), JsonCompanyCrawl.getCounter());
            LOGGER.info("基金经理数据抓取线程数量[{}],,已抓取数据[{}]条", JsonManagerCrawl.activeCount(), JsonManagerCrawl.getCounter());
            LOGGER.info("基金详情数据抓取线程数量[{}],,已抓取数据[{}]条", fundCrawl.getState(), fundCrawl.getCounter());
            LOGGER.info("基金公司数据抓取线程数量[{}],,已抓取数据[{}]条", companyCrawl.getState(), companyCrawl.getCounter());
            LOGGER.info("基金经理详情数据抓取线程数量[{}],,已抓取数据[{}]条", managerCrawl.getState(), managerCrawl.getCounter());

        }
        session.close();
        LOGGER.info("抓取程序执行完成,程序退出,总耗时[{}]毫秒",new Date().getTime()-startTime.getTime());
        System.exit(0);
    }
}
