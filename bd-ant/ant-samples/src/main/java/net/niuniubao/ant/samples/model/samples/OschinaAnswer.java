package net.niuniubao.ant.samples.model.samples;

import net.niuniubao.ant.Page;
import net.niuniubao.ant.Site;
import net.niuniubao.ant.model.AfterExtractor;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.model.annotation.ExtractBy;
import net.niuniubao.ant.model.annotation.HelpUrl;
import net.niuniubao.ant.model.annotation.TargetUrl;

/**
 * @author dev@niuniubao.net <br>
 */
@TargetUrl("http://www.oschina.net/question/\\d+_\\d+*")
@HelpUrl("http://www.oschina.net/question/*")
@ExtractBy(value = "//ul[@class='list']/li[@class='Answer']", multi = true)
public class OschinaAnswer implements AfterExtractor {

    @ExtractBy("//img/@title")
    private String user;

    @ExtractBy("//div[@class='detail']")
    private String content;

    public static void main(String[] args) {
        OOSpider.create(Site.me().addStartUrl("http://www.oschina.net/question/567527_120597"), OschinaAnswer.class).run();
    }

    @Override
    public void afterProcess(Page page) {

    }
}
