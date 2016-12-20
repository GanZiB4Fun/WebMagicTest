package net.niuniubao.ant.handler;

import net.niuniubao.ant.ResultItems;
import net.niuniubao.ant.Task;

/**
 * @author dev@niuniubao.net
 * @since 1.0.0
 */
public interface SubPipeline extends RequestMatcher {

    /**
     * process the page, extract urls to fetch, extract the data and store
     *
     * @param resultItems resultItems
     * @param task task
     * @return whether continue to match
     */
    public MatchOther processResult(ResultItems resultItems, Task task);

}
