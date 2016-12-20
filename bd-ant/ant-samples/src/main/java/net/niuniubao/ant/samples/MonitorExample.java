package net.niuniubao.ant.samples;

import net.niuniubao.ant.monitor.SpiderMonitor;
import net.niuniubao.ant.Spider;
import net.niuniubao.ant.samples.processor.OschinaBlogPageProcessor;

/**
 * @author dev@niuniubao.net
 * @since 1.0.0
 */
public class MonitorExample {

    public static void main(String[] args) throws Exception {

        Spider oschinaSpider = Spider.create(new OschinaBlogPageProcessor())
                .addUrl("http://my.oschina.net/flashsword/blog");
        Spider githubSpider = Spider.create(new GithubRepoPageProcessor())
                .addUrl("https://github.com/code4craft");

        SpiderMonitor.instance().register(oschinaSpider);
        SpiderMonitor.instance().register(githubSpider);
        oschinaSpider.start();
        githubSpider.start();
    }
}
