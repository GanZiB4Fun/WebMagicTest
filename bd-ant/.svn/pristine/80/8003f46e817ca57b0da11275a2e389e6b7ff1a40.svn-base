package net.niuniubao.ant.eastmoney.model;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.model.OOSpider;

import static org.testng.Assert.*;

public class FundJbgkObjTest {
    public static void main(String[] args) {
        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), FundJbgkObj.class);
        FundJbgkObj fundJbgkObj = ooSpider.get("http://fund.eastmoney.com/f10/jbgk_000001.html");
        System.out.println(fundJbgkObj);
    }
}