package net.niuniubao.ant.amac.util;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.amac.model.FundList;
import net.niuniubao.ant.amac.model.Company;
import net.niuniubao.ant.model.OOSpider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by cuiyingjia on 16/4/16.
 */
public class XmlUtilTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(XmlUtilTest.class);

    @Test
    public void htmlParseToFundInfo() {
            String html =
                    "<td class=\"td-content\" colspan=\"3\"> <p><a href=\"http://gs.amac.org.cn/amac-infodisc/res/pof/fund/227027.html\">平安道远金锁1号资产管理计划</a></p> </td>";
            XmlUtil.htmlParseToFundInfo(html, FundList.FundType.BEFORE_MEASURES);

    }
    @Test
    private void htmlParse(){
        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), Company.class);
        Company company = ooSpider.get("http://gs.amac.org.cn/amac-infodisc/res/pof/manager/166.html");
//        AmacManager amacManager = ooSpider.get("http://gs.amac.org.cn/amac-infodisc/res/pof/manager/294.html");
        ooSpider.close();
//        String html = amacManager.getRepresentativesHtml();
//        XmlUtil.htmlParseToResume(html);

//        String html = amacManager.getExecutivesHtml();
//        XmlUtil.htmlParseToManagerInfo(html);

        String html = company.getImproperLiquidationsHtml();
        XmlUtil.htmlParseToFundInfo(html, FundList.FundType.IMPROPER_LIQUIDATION);

    }

}
