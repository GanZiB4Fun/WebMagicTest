package net.niuniubao.ant.scheduler;

import net.niuniubao.ant.Request;
import net.niuniubao.ant.Task;
import net.niuniubao.ant.scheduler.component.DuplicateRemover;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.niuniubao.ant.scheduler.component.HashSetDuplicateRemover;

/**
 * Remove duplicate urls and only push urls which are not duplicate.<br><br>
 *
 * @author dev@niuniubao.net
 * @since 1.0.0
 */
public abstract class DuplicateRemovedScheduler implements Scheduler {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    private DuplicateRemover duplicatedRemover = new HashSetDuplicateRemover();

    public DuplicateRemover getDuplicateRemover() {
        return duplicatedRemover;
    }

    public DuplicateRemovedScheduler setDuplicateRemover(DuplicateRemover duplicatedRemover) {
        this.duplicatedRemover = duplicatedRemover;
        return this;
    }

    @Override
    public void push(Request request, Task task) {
        logger.trace("get a candidate url {}", request.getUrl());
        if (!duplicatedRemover.isDuplicate(request, task) || shouldReserved(request)) {
            logger.debug("push to queue {}", request.getUrl());
            pushWhenNoDuplicate(request, task);
        }
    }

    protected boolean shouldReserved(Request request) {
        return request.getExtra(Request.CYCLE_TRIED_TIMES) != null;
    }

    protected void pushWhenNoDuplicate(Request request, Task task) {

    }
}
