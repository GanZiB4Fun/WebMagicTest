package net.niuniubao.ant.model;

import net.niuniubao.ant.pipeline.PageModelPipeline;
import org.apache.commons.lang3.builder.ToStringBuilder;
import net.niuniubao.ant.Task;

/**
 * Print page model in console.<br>
 * Usually used in test.<br>
 * @author dev@niuniubao.net <br>
 * @since 1.0.0
 */
public class ConsolePageModelPipeline implements PageModelPipeline {
    @Override
    public void process(Object o, Task task) {
        System.out.println(ToStringBuilder.reflectionToString(o));
    }
}
