package net.niuniubao.ant.model;

import net.niuniubao.ant.pipeline.PageModelPipeline;
import org.testng.annotations.Test;
import net.niuniubao.ant.Site;
import net.niuniubao.ant.Task;
import net.niuniubao.ant.downloader.MockGithubDownloader;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author dev@niuniubao.net <br>
 */
public class GithubRepoTest {

    @Test
    public void test() {
        OOSpider.create(Site.me().setSleepTime(0)
                , new PageModelPipeline<GithubRepo>() {
            @Override
            public void process(GithubRepo o, Task task) {
                assertThat(o.getStar()).isEqualTo(86);
                assertThat(o.getFork()).isEqualTo(70);
            }
        }, GithubRepo.class).addUrl("https://github.com/code4craft/webmagic").setDownloader(new MockGithubDownloader()).test("https://github.com/code4craft/webmagic");
    }
}
