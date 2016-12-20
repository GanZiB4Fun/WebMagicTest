package net.niuniubao.ant.samples;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.Page;
import net.niuniubao.ant.Spider;
import net.niuniubao.ant.processor.PageProcessor;

import java.util.List;

/**
 * @author dev@niuniubao.net <br>
 */
public class HuxiuProcessor implements PageProcessor {
    @Override
    public void process(Page page) {
        List<String> requests = page.getHtml().links().regex(".*article.*").all();
        page.addTargetRequests(requests);
        page.putField("title",page.getHtml().xpath("//div[@class='clearfix neirong']//h1/text()"));
        page.putField("content",page.getHtml().xpath("//div[@id='neirong_box']/tidyText()"));
    }

    @Override
    public Site getSite() {
        return Site.me().setDomain("www.huxiu.com").addStartUrl("http://www.huxiu.com/");
    }

    public static void main(String[] args) {
        Spider.create(new HuxiuProcessor()).run();
    }

}
