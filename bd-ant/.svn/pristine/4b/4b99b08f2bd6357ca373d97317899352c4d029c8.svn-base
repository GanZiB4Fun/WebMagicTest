package net.niuniubao.ant.samples.model.samples;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.Spider;
import net.niuniubao.ant.Task;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.monitor.SpiderMonitor;
import net.niuniubao.ant.pipeline.PageModelPipeline;
import net.niuniubao.ant.model.annotation.ExtractBy;
import net.niuniubao.ant.model.annotation.ExtractByUrl;
import net.niuniubao.ant.model.annotation.HelpUrl;
import net.niuniubao.ant.model.annotation.TargetUrl;

import javax.management.JMException;
import java.io.IOException;

/**
 * @author dev@niuniubao.net <br>
 */
@TargetUrl("http://www.36kr.com/p/\\d+.html")
@HelpUrl("http://www.36kr.com/#/page/\\d+")
public class Kr36NewsModel {

    @ExtractBy("//h1[@class='entry-title sep10']")
    private String title;

    @ExtractBy("//div[@class='mainContent sep-10']/tidyText()")
    private String content;

    @ExtractByUrl
    private String url;

    public static void main(String[] args) throws IOException, JMException {
        //Just for benchmark
        Spider thread = OOSpider.create(Site.me().addStartUrl("http://www.36kr.com/").setSleepTime(0), new PageModelPipeline() {
            @Override
            public void process(Object o, Task task) {

            }
        }, Kr36NewsModel.class).thread(20);
        thread.start();
        SpiderMonitor spiderMonitor = SpiderMonitor.instance();
        spiderMonitor.register(thread);
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUrl() {
        return url;
    }
}
