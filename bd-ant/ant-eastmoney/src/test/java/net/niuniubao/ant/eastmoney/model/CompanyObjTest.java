package net.niuniubao.ant.eastmoney.model;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.model.OOSpider;

public class CompanyObjTest {

    public static void main(String[] args) {
        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), CompanyObj.class);
        CompanyObj companyObj = ooSpider.get("http://fund.eastmoney.com/company/80163340.html");
        System.out.println(companyObj);
        ooSpider.close();
    }
}