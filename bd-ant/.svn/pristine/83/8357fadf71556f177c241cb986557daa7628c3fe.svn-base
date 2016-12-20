package net.niuniubao.ant.pipeline;

import net.niuniubao.ant.Task;
import net.niuniubao.ant.ResultItems;

/**
 * Pipeline is the persistent and offline process part of crawler.<br>
 * The interface Pipeline can be implemented to customize ways of persistent.
 *
 * @author dev@niuniubao.net <br>
 * @since 1.0.0
 * @see ConsolePipeline
 * @see FilePipeline
 */
public interface Pipeline {

    /**
     * Process extracted results.
     *
     * @param resultItems resultItems
     * @param task task
     */
    public void process(ResultItems resultItems, Task task);
}
