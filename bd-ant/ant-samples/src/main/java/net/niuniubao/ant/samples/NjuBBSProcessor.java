package net.niuniubao.ant.samples;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.Page;
import net.niuniubao.ant.processor.PageProcessor;

import java.util.List;

/**
 * @author dev@niuniubao.net <br>
 * Date: 13-4-21
 * Time: 下午8:08
 */
public class NjuBBSProcessor implements PageProcessor {
    @Override
    public void process(Page page) {
        List<String> requests = page.getHtml().regex("<a[^<>]*href=(bbstcon\\?board=Pictures&file=[^>]*)").all();
        page.addTargetRequests(requests);
        page.putField("title",page.getHtml().xpath("//div[@id='content']//h2/a"));
        page.putField("content",page.getHtml().smartContent());
    }

    @Override
    public Site getSite() {
        return Site.me().setDomain("bbs.nju.edu.cn").addStartUrl("http://bbs.nju.edu.cn/board?board=Pictures");
    }
}
