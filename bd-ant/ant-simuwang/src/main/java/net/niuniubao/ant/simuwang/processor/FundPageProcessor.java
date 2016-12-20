package net.niuniubao.ant.simuwang.processor;

import net.niuniubao.ant.Page;
import net.niuniubao.ant.Site;
import net.niuniubao.ant.processor.PageProcessor;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/19.
 */
public class FundPageProcessor implements PageProcessor {

    private Site site;

    @Override
    public void process(Page page) {
        page.putField("fundId", page.getUrl().regex("product/*.html"));
    }

    @Override
    public Site getSite() {
        if (site == null) {
            site = Site.me().setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");
        }
        return site;
    }
}
