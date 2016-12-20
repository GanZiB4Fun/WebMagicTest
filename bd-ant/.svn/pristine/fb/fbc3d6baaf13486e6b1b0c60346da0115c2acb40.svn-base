package net.niuniubao.ant.samples;

import net.niuniubao.ant.Page;
import net.niuniubao.ant.Site;
import net.niuniubao.ant.Spider;
import net.niuniubao.ant.model.PageMapper;
import net.niuniubao.ant.processor.PageProcessor;

/**
 * @author dev@niuniubao.net <br>
 * @since 1.0.0
 */
public class GithubRepoPageMapper implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(0);

    private PageMapper<GithubRepo1> githubRepoPageMapper = new PageMapper<GithubRepo1>(GithubRepo1.class);

    @Override
    public void process(Page page) {
        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/\\w+/\\w+)").all());
        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/\\w+)").all());
        GithubRepo1 githubRepo = githubRepoPageMapper.get(page);
        if (githubRepo == null) {
            page.setSkip(true);
        } else {
            page.putField("repo", githubRepo);
        }

    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new GithubRepoPageMapper()).addUrl("https://github.com/code4craft").thread(5).run();
    }
}