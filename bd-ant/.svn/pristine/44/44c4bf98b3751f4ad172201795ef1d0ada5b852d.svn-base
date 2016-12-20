package net.niuniubao.ant.samples;

import net.niuniubao.ant.model.HasKey;
import net.niuniubao.ant.model.annotation.ExtractBy;
import net.niuniubao.ant.model.annotation.ExtractByUrl;
import net.niuniubao.ant.Site;
import net.niuniubao.ant.model.ConsolePageModelPipeline;
import net.niuniubao.ant.model.OOSpider;

import java.util.List;

/**
 * @author dev@niuniubao.net <br>
 * @since 1.0.0
 */
public class GithubRepoApi implements HasKey {

    @ExtractBy(type = ExtractBy.Type.JsonPath, value = "$.name")
    private String name;

    @ExtractBy(type = ExtractBy.Type.JsonPath, value = "$..owner.login")
    private String author;

    @ExtractBy(type = ExtractBy.Type.JsonPath, value = "$.language",multi = true)
    private List<String> language;

    @ExtractBy(type = ExtractBy.Type.JsonPath, value = "$.stargazers_count")
    private int star;

    @ExtractBy(type = ExtractBy.Type.JsonPath, value = "$.homepage")
    private int fork;

    @ExtractByUrl
    private String url;

    public static void main(String[] args) {
        OOSpider.create(Site.me().setSleepTime(100)
                , new ConsolePageModelPipeline(), GithubRepoApi.class)
                .addUrl("https://api.github.com/repos/code4craft/webmagic").run();
    }

    @Override
    public String key() {
        return author + ":" + name;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getLanguage() {
        return language;
    }

    public String getUrl() {
        return url;
    }

    public int getStar() {
        return star;
    }

    public int getFork() {
        return fork;
    }
}
