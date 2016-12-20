package net.niuniubao.ant.samples.scheduler;

import org.testng.annotations.Test;
import net.niuniubao.ant.Request;

import java.util.concurrent.TimeUnit;

/**
 * @author dev@niuniubao.net
 */
public class DelayQueueSchedulerTest {

    @Test(enabled = false)
    public void test() {
        DelayQueueScheduler delayQueueScheduler = new DelayQueueScheduler(1, TimeUnit.SECONDS);
        delayQueueScheduler.push(new Request("1"), null);
        while (true){
            Request poll = delayQueueScheduler.poll(null);
            System.out.println(System.currentTimeMillis()+"\t"+poll);
        }
    }
}
