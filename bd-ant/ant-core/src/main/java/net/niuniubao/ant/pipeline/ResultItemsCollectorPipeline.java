package net.niuniubao.ant.pipeline;

import net.niuniubao.ant.Task;
import net.niuniubao.ant.ResultItems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dev@niuniubao.net
 * @since 1.0.0
 */
public class ResultItemsCollectorPipeline implements CollectorPipeline<ResultItems> {

    private List<ResultItems> collector = new ArrayList<ResultItems>();

    @Override
    public synchronized void process(ResultItems resultItems, Task task) {
        collector.add(resultItems);
    }

    @Override
    public List<ResultItems> getCollected() {
        return collector;
    }
}
