package net.niuniubao.ant.simuquan.model;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.model.OOSpider;

/**
 * Created by GanJianWei on 2016/4/27.
 */
public class CompanyFilingTest {

    public static void main(String[] args) {
        String url = "http://api.quchaogu.com/fund/filing/detail?filing_id=1149";
        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), CompanyFiling.class);
        CompanyFiling companyFiling = ooSpider.get(url);
        System.out.println(companyFiling);
    }


}
