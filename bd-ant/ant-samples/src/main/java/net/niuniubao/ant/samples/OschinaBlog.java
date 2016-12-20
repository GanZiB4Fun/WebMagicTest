package net.niuniubao.ant.samples;

import net.niuniubao.ant.model.annotation.TargetUrl;
import net.niuniubao.ant.pipeline.JsonFilePageModelPipeline;
import net.niuniubao.ant.Site;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.model.annotation.ExtractBy;

import java.util.Date;
import java.util.List;

/**
 * @author dev@niuniubao.net <br>
 * @since 1.0.0
 */
@TargetUrl("http://my.oschina.net/flashsword/blog/\\d+")
public class OschinaBlog {

    @ExtractBy("//title/text()")
    private String title;

    @ExtractBy(value = "div.BlogContent", type = ExtractBy.Type.Css)
    private String content;

    @ExtractBy(value = "//div[@class='BlogTags']/a/text()", multi = true)
    private List<String> tags;

    @ExtractBy("//div[@class='BlogStat']/regex('\\d+-\\d+-\\d+\\s+\\d+:\\d+')")
    private Date date;

    public static void main(String[] args) {
        //results will be saved to "/data/webmagic/" in json format
        OOSpider.create(Site.me(), new JsonFilePageModelPipeline("/data/webmagic/"), OschinaBlog.class)
                .addUrl("http://my.oschina.net/flashsword/blog").run();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public List<String> getTags() {
        return tags;
    }

    public Date getDate() {
        return date;
    }

}
