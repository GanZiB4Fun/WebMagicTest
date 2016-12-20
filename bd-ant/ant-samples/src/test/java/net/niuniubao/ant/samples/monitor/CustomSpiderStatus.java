package net.niuniubao.ant.samples.monitor;

import net.niuniubao.ant.Spider;
import net.niuniubao.ant.monitor.SpiderMonitor;
import net.niuniubao.ant.monitor.SpiderStatus;

/**
 * @author dev@niuniubao.net
 */
public class CustomSpiderStatus extends SpiderStatus implements CustomSpiderStatusMXBean {

    public CustomSpiderStatus(Spider spider, SpiderMonitor.MonitorSpiderListener monitorSpiderListener) {
        super(spider, monitorSpiderListener);
    }


    @Override
    public String getSchedulerName() {
        return spider.getScheduler().getClass().getName();
    }
}
