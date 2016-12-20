package net.niuniubao.ant.pipeline;

import net.niuniubao.ant.Spider;

import java.util.List;

/**
 * Pipeline that can collect and store results. <br>
 * Used for {@link Spider#getAll(java.util.Collection)}
 *
 * @author xiaoming8484@gmail.com
 * @since 1.0.0
 */
public interface CollectorPipeline<T> extends Pipeline {

    /**
     * Get all results collected.
     *
     * @return collected results
     */
    List<T> getCollected();
}
