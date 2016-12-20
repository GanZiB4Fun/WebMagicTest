package net.niuniubao.ant.simuquan.main;

import net.niuniubao.ant.mybatis.MybatisSession;
import net.niuniubao.ant.simuquan.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/25.
 */
public class SimuquanCrawlMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimuquanCrawlMain.class);

    public static final String VERSION = "v1.0.1";

    public static void main(String[] args){


        Date startTime = new Date();

        ExecutorService exec = Executors.newFixedThreadPool(20);


//      公司列表
        for (int i = 0; i < 10; i++) {
            Map<String, Class> map = new HashMap<String, Class>();
            map.put("data", CompanyListData.class);
            map.put("company_list", CompanyList.class);
            exec.execute(new CompanyListCrawl(map));
        }
//       基金列表
        for (int i = 0 ;i < 10 ;i++){
            Map<String ,Class> map = new HashMap<String, Class>();
            map.put("data", FundListData.class);
            map.put("fund_list",FundList.class);
            exec.execute(new FundListCrawl(map));
        }
        //基金详情
//        for (int i = 0 ;i < 10 ;i++){
        FundInfoCrawl fundInfoCrawl = new FundInfoCrawl(FundInfoData.class);
        exec.execute(fundInfoCrawl);
//        }
//        基金公司详情
        CompanyPageCrawl companyPageCrawl = new CompanyPageCrawl(CompanyData.class);
        exec.execute(companyPageCrawl);
        //基金经理列表
        for (int i = 0 ;i < 10 ;i++){
            Map<String ,Class> map = new HashMap<String, Class>();
            map.put("data", ManagerListData.class);
            map.put("manager_list",ManagerList.class);
            exec.execute(new ManagerListCrawl(map));
        }

        //基金经理详情
        ManagerPageCrawl managerPageCrawl = new ManagerPageCrawl(ManagerData.class);
        exec.execute(managerPageCrawl);
        exec.shutdown();


        while (ManagerListCrawl.getTask() != 0||ManagerPageCrawl.getTaskCount()!=0||
                FundListCrawl.getTask() != 0 || FundInfoCrawl.getTask() != 0 || CompanyPageCrawl.getTaskCount() != 0
                ){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            LOGGER.info("1基金产品列表线程数量[{}],已抓取数据[{}]条", FundListCrawl.activeCount(), FundListCrawl.getCounter());
            LOGGER.info("2基金产品详情线程数量[{}],已抓取数据[{}]条", FundInfoCrawl.activeCount(), FundInfoCrawl.getCounter());
            LOGGER.info("3基金公司列表线程[{}],已抓取数据[{}]条", CompanyListCrawl.activeCount(), CompanyListCrawl.getCounter());
            LOGGER.info("4基金公司详情线程[{}],已抓取数据[{}]条", CompanyPageCrawl.activeCount(), CompanyPageCrawl.getCounter());
            LOGGER.info("5基金经理列表线程[{}],已抓取数据[{}]条", ManagerListCrawl.activeCount(), ManagerListCrawl.getCounter());
            LOGGER.info("6基金经理详情线程[{}],已抓取数据[{}]条", ManagerPageCrawl.activeCount(), ManagerPageCrawl.getCounter());

        }

        LOGGER.info("抓取程序执行完成,程序退出,总耗时[{}]毫秒",new Date().getTime()-startTime.getTime());
        System.exit(0);

    }
}
