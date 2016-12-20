package net.niuniubao.ant.pipeline;

import net.niuniubao.ant.Task;

/**
 * Implements PageModelPipeline to persistent your page model.
 *
 * @author dev@niuniubao.net <br>
 * @since 1.0.0
 */
public interface PageModelPipeline<T> {

    public void process(T t, Task task);

}
