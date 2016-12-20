package net.niuniubao.ant.amac.model;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.model.OOSpider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/16.
 */
public class FundTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(FundTest.class);

    @Test
    public void parseTest() {

        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), Fund.class);
        Fund fund = ooSpider.get("http://gs.amac.org.cn/amac-infodisc/res/pof/fund/133588.html");
        LOGGER.info(fund.toString());
        ooSpider.close();

    }
}