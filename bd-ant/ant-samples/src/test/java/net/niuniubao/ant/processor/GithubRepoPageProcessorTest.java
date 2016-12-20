package net.niuniubao.ant.processor;

import net.niuniubao.ant.Task;
import net.niuniubao.ant.ResultItems;
import net.niuniubao.ant.Spider;
import net.niuniubao.ant.pipeline.Pipeline;
import net.niuniubao.ant.samples.mock.MockGithubDownloader;
import net.niuniubao.ant.samples.processor.GithubRepoPageProcessor;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author dev@niuniubao.net
 *         Date: 16/1/19
 *         Time: 上午7:27
 */
public class GithubRepoPageProcessorTest {

    @Test
    public void test_github() throws Exception {
        Spider.create(new GithubRepoPageProcessor()).addPipeline(new Pipeline() {
            @Override
            public void process(ResultItems resultItems, Task task) {
                assertThat(((String) resultItems.get("name")).trim()).isEqualTo("webmagic");
                assertThat(((String) resultItems.get("author")).trim()).isEqualTo("code4craft");
            }
        }).setDownloader(new MockGithubDownloader()).test("https://github.com/code4craft/webmagic");
    }
}
