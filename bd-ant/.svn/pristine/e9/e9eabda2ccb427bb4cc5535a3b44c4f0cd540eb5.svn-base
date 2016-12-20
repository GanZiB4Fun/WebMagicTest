package net.niuniubao.ant.samples.scheduler;

import net.niuniubao.ant.Request;
import net.niuniubao.ant.Task;
import net.niuniubao.ant.scheduler.PriorityScheduler;

/**
 * @author dev@niuniubao.net
 */
public class LevelLimitScheduler extends PriorityScheduler {

    private int levelLimit = 3;

    public LevelLimitScheduler(int levelLimit) {
        this.levelLimit = levelLimit;
    }

    @Override
    public synchronized void push(Request request, Task task) {
        if (((Integer) request.getExtra("_level")) <= levelLimit) {
            super.push(request, task);
        }
    }
}
