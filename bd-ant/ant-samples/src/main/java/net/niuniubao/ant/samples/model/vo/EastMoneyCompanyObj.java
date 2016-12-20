package net.niuniubao.ant.samples.model.vo;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.model.annotation.ExtractBy;


public class EastMoneyCompanyObj {


    @ExtractBy("//div[@class=pageside]")// FIXME: 16/4/14 天天基金网打不开,这是单个页面,这个页面的左侧可以获得所有基金公司ID
    private String content;

    public String toString() {
        return "{" +
                "全部内容:" + content +
                "}";
    }

public static void main(String[] args) {

    OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), EastMoneyCompanyObj.class);

    EastMoneyCompanyObj obj = ooSpider.<EastMoneyCompanyObj>get("http://fund.eastmoney.com/company/80000226.html");

    System.out.println(obj);

    ooSpider.close();


}





}

