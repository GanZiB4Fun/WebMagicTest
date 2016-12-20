package net.niuniubao.ant.downloader.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * @author dev@niuniubao.net <br>
 * Date: 13-7-26 <br>
 * Time: 下午2:12 <br>
 */
public class WebDriverPoolTest {

    private String chromeDriverPath = "/Users/yihua/Downloads/chromedriver";

    @Test(enabled = false)
    public void test() {
        System.getProperties().setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriverPool webDriverPool = new WebDriverPool(5);
        for (int i = 0; i < 5; i++) {
            try {
                WebDriver webDriver = webDriverPool.get();
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        webDriverPool.closeAll();
    }
}
