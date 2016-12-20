package net.niuniubao.ant;

import net.niuniubao.ant.pipeline.Pipeline;
import net.niuniubao.ant.scheduler.Scheduler;

/**
 * Interface for identifying different tasks.<br>
 *
 * @author dev@niuniubao.net <br>
 * @since 1.0.0
 * @see Scheduler
 * @see Pipeline
 */
public interface Task {

    /**
     * unique id for a task.
     *
     * @return uuid
     */
    public String getUUID();

    /**
     * site of a task
     *
     * @return site
     */
    public Site getSite();

}
