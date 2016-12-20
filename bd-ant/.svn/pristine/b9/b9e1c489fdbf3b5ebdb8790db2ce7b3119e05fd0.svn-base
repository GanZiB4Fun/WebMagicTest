package net.niuniubao.ant.eastmoney.main;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.eastmoney.model.FundJbgkObj;
import net.niuniubao.ant.model.OOSpider;


public class FundJbgkMainTest {

    public static void main(String[] args) {

        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), FundJbgkObj.class);
        FundJbgkObj fundJbgkObj = ooSpider.get("http://fund.eastmoney.com/f10/jbgk_000218.html");
        fundJbgkObj.setCompanyUrlId(fundJbgkObj.getCompanyUrlId().replaceAll("[a-z|\\.|\\:|\\/]",""));
        fundJbgkObj.setFundManagerUrlId(fundJbgkObj.getFundManagerUrlId().replaceAll("[a-z|\\.|\\:|\\/]",""));
        System.out.println(fundJbgkObj);
        ooSpider.close();
    }

}