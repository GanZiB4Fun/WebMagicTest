package net.niuniubao.ant.processor;

import org.testng.annotations.Test;
import net.niuniubao.ant.Spider;
import net.niuniubao.ant.pipeline.FilePipeline;
import net.niuniubao.ant.pipeline.JsonFilePipeline;
import net.niuniubao.ant.samples.SinaBlogProcessor;
import net.niuniubao.ant.scheduler.FileCacheQueueScheduler;

import java.io.IOException;

/**
 * @author dev@niuniubao.net <br>
 *         Date: 13-6-9
 *         Time: 上午8:02
 */
public class SinablogProcessorTest {

    @Test(enabled = false)
    public void test() throws IOException {
        SinaBlogProcessor sinaBlogProcessor = new SinaBlogProcessor();
        //pipeline是抓取结束后的处理
        //默认放到/data/webmagic/ftl/[domain]目录下
        JsonFilePipeline pipeline = new JsonFilePipeline("/data/webmagic/");
        //Spider.me()是简化写法，其实就是new一个啦
        //Spider.pipeline()设定一个pipeline，支持链式调用
        //ConsolePipeline输出结果到控制台
        //FileCacheQueueSchedular保存url，支持断点续传，临时文件输出到/data/temp/webmagic/cache目录
        //Spider.run()执行
        Spider.create(sinaBlogProcessor).pipeline(new FilePipeline()).pipeline(pipeline).scheduler(new FileCacheQueueScheduler("/data/temp/webmagic/cache/")).
                run();
    }
}
