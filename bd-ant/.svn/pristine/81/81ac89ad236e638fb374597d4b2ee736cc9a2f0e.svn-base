package net.niuniubao.ant.amac.main;

import net.niuniubao.ant.mybatis.MybatisSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/19.
 */
public class AmacCrawlMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(AmacCrawlMain.class);

    //数据版本
    public static String version;

    public static void main(String[] args) {

        version = "v1.0.1";

        Date startTime = new Date();

        ExecutorService exec = Executors.newFixedThreadPool(30);

        MybatisSession session = MybatisSession.mybatisSession();

        for (int i = 0; i < 10; i++) {
            exec.execute(new JsonManagerCrawl());
        }

        exec.shutdown();

        CompanyCrawl companyCrawl = new CompanyCrawl();
        companyCrawl.start();

        FundCrawl fundCrawl = new FundCrawl(companyCrawl);
        fundCrawl.start();

        while (fundCrawl.getState() != Thread.State.TERMINATED){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            LOGGER.info("基金公司列表抓取线程数量[{}],已抓取数据[{}]条", JsonManagerCrawl.activeCount(), JsonManagerCrawl.getCounter());
            LOGGER.info("基金详情数据抓取线程数量[{}],,已抓取数据[{}]条", fundCrawl.getState(), fundCrawl.getCounter());
            LOGGER.info("基金公司数据抓取线程数量[{}],,已抓取数据[{}]条", companyCrawl.getState(), companyCrawl.getCounter());

        }
        session.close();
        LOGGER.info("抓取程序执行完成,程序退出,总耗时[{}]毫秒",new Date().getTime()-startTime.getTime());
        System.exit(0);
    }
}
