package net.niuniubao.ant.samples.monitor;

import net.niuniubao.ant.Spider;
import net.niuniubao.ant.monitor.SpiderMonitor;
import net.niuniubao.ant.monitor.SpiderStatusMXBean;
import net.niuniubao.ant.samples.processor.GithubRepoPageProcessor;
import net.niuniubao.ant.samples.processor.OschinaBlogPageProcessor;
import org.testng.annotations.Test;

/**
 * @author dev@niuniubao.net
 * @since 1.0.0
 */
public class SpiderMonitorTest {

    @Test
    public void testInherit() throws Exception {
        SpiderMonitor spiderMonitor = new SpiderMonitor(){
            @Override
            protected SpiderStatusMXBean getSpiderStatusMBean(Spider spider, MonitorSpiderListener monitorSpiderListener) {
                return new CustomSpiderStatus(spider, monitorSpiderListener);
            }
        };

        Spider oschinaSpider = Spider.create(new OschinaBlogPageProcessor())
                .addUrl("http://my.oschina.net/flashsword/blog").thread(2);
        Spider githubSpider = Spider.create(new GithubRepoPageProcessor())
                .addUrl("https://github.com/code4craft");

        spiderMonitor.register(oschinaSpider, githubSpider);

    }
}
