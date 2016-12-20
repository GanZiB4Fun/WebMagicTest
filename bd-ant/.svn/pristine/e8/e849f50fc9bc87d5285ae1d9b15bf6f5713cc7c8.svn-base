package net.niuniubao.ant.downloader;

import net.niuniubao.ant.Task;
import org.apache.commons.io.IOUtils;
import net.niuniubao.ant.Page;
import net.niuniubao.ant.Request;
import net.niuniubao.ant.selector.PlainText;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author dev@niuniubao.net
 */
public class MockGithubDownloader implements Downloader {

    @Override
    public Page download(Request request, Task task) {
        Page page = new Page();
        InputStream resourceAsStream = this.getClass().getResourceAsStream("/html/mock-github.html");
        try {
            page.setRawText(IOUtils.toString(resourceAsStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
        page.setRequest(new Request("https://github.com/code4craft/webmagic"));
        page.setUrl(new PlainText("https://github.com/code4craft/webmagic"));
        return page;
    }

    @Override
    public void setThread(int threadNum) {
    }
}
