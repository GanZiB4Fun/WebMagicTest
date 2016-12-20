package net.niuniubao.ant.samples;

import net.niuniubao.ant.Page;
import net.niuniubao.ant.Site;
import net.niuniubao.ant.Spider;
import net.niuniubao.ant.downloader.selenium.SeleniumDownloader;
import net.niuniubao.ant.pipeline.FilePipeline;
import net.niuniubao.ant.processor.PageProcessor;

/**
 *
 * Using Selenium with PhantomJS to fetch web-page with JS<br>
 * 
 * @author bob.li.0718@gmail.com <br>
 *         Date: 15-7-11 <br>
 */
public class GooglePlayProcessor implements PageProcessor {

	private Site site;

	@Override
	public void process(Page page) {

		page.putField("whole-html", page.getHtml().toString());

	}

	@Override
	public Site getSite() {
		if (null == site) {
			site = Site.me().setDomain("play.google.com").setSleepTime(300);
		}
		return site;
	}

	public static void main(String[] args) {
		Spider.create(new GooglePlayProcessor())
				.thread(5)
				.addPipeline(
						new FilePipeline(
								"/Users/Bingo/Documents/workspace/webmagic/webmagic-selenium/data/"))
				.setDownloader(new SeleniumDownloader())
				.addUrl("https://play.google.com/store/apps/details?id=com.tencent.mm")
				.runAsync();
	}
}
