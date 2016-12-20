package net.niuniubao.ant.scheduler;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import net.niuniubao.ant.Request;
import net.niuniubao.ant.Site;
import net.niuniubao.ant.Task;

/**
 * @author dev@niuniubao.net <br>
 */
public class RedisSchedulerTest {

    private RedisScheduler redisScheduler;

    @BeforeTest
    public void setUp() {
        redisScheduler = new RedisScheduler("localhost");
    }

    @Test(enabled = false)
    public void test() {
        Task task = new Task() {
            @Override
            public String getUUID() {
                return "1";
            }

            @Override
            public Site getSite() {
                return null;
            }
        };
        Request request = new Request("http://www.ibm.com/developerworks/cn/java/j-javadev2-22/");
        request.putExtra("1","2");
        redisScheduler.push(request, task);
        Request poll = redisScheduler.poll(task);
        System.out.println(poll);

    }
}
