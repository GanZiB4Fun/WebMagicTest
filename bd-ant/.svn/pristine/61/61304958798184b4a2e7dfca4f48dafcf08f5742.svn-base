package net.niuniubao.ant.samples.model.samples;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.model.annotation.ExtractBy;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.model.annotation.TargetUrl;

/**
 * @author dev@niuniubao.net <br>
 * Date: 13-8-2 <br>
 * Time: 上午7:52 <br>
 */
@TargetUrl("http://*.iteye.com/blog/*")
public class IteyeBlog implements Blog{

    @ExtractBy("//title")
    private String title;

    @ExtractBy(value = "div#blog_content",type = ExtractBy.Type.Css)
    private String content;

    @Override
    public String toString() {
        return "IteyeBlog{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public static void main(String[] args) {
        OOSpider.create(Site.me().addStartUrl("http://flashsword20.iteye.com/blog"), IteyeBlog.class).run();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
