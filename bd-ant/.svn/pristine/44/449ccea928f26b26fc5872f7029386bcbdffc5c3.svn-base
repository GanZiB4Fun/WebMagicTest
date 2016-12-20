package net.niuniubao.ant.downloader;

import org.testng.annotations.Test;
import net.niuniubao.ant.Spider;

/**
 * @author dev@niuniubao.net <br>
 */
public class FileCacheTest {

    @Test(enabled = false)
    public void test() {
        FileCache fileCache = new FileCache("http://my.oschina.net/flashsword/blog", "http://my.oschina.net/flashsword/blog/*");
        Spider.create(fileCache).downloader(fileCache).pipeline(fileCache).run();
    }
}
