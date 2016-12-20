package net.niuniubao.ant.pipeline;

import net.niuniubao.ant.Task;
import net.niuniubao.ant.ResultItems;

import java.util.Map;

/**
 * Write results in console.<br>
 * Usually used in test.
 *
 * @author dev@niuniubao.net <br>
 * @since 1.0.0
 */
public class ConsolePipeline implements Pipeline {

    @Override
    public void process(ResultItems resultItems, Task task) {
        System.out.println("get page: " + resultItems.getRequest().getUrl());
        for (Map.Entry<String, Object> entry : resultItems.getAll().entrySet()) {
            System.out.println(entry.getKey() + ":\t" + entry.getValue());
        }
    }
}
