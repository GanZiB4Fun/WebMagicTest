package net.niuniubao.ant.pipeline;

import net.niuniubao.ant.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dev@niuniubao.net
 */
public class CollectorPageModelPipeline<T> implements PageModelPipeline<T> {

    private List<T> collected = new ArrayList<T>();

    @Override
    public synchronized void process(T t, Task task) {
        collected.add(t);
    }

    public List<T> getCollected() {
        return collected;
    }
}
