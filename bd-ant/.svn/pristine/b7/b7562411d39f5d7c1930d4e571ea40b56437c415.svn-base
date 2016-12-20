package net.niuniubao.ant.processor;

import org.testng.Assert;
import org.testng.annotations.Test;
import net.niuniubao.ant.*;
import net.niuniubao.ant.downloader.MockGithubDownloader;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.pipeline.Pipeline;

/**
 * @author dev@niuniubao.net
 */
public class GithubRepoProcessor implements PageProcessor {
    @Override
    public void process(Page page) {
        page.putField("star",page.getHtml().xpath("//ul[@class='pagehead-actions']/li[2]//a[@class='social-count js-social-count']/text()").toString());
        page.putField("fork",page.getHtml().xpath("//ul[@class='pagehead-actions']/li[3]//a[@class='social-count']/text()").toString());
    }

    @Override
    public Site getSite() {
        return Site.me().addStartUrl("https://github.com/code4craft/webmagic");
    }

    @Test
    public void test() {
        OOSpider.create(new GithubRepoProcessor()).addPipeline(new Pipeline() {
            @Override
            public void process(ResultItems resultItems, Task task) {
                Assert.assertEquals("78",((String)resultItems.get("star")).trim());
                Assert.assertEquals("65",((String)resultItems.get("fork")).trim());
            }
        }).setDownloader(new MockGithubDownloader()).test("https://github.com/code4craft/webmagic");
    }

}
