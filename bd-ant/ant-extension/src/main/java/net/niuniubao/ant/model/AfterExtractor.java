package net.niuniubao.ant.model;

import net.niuniubao.ant.Page;

/**
 * Interface to be implemented by page models that need to do something after fields are extracted.<br>
 *
 * @author dev@niuniubao.net <br>
 * @since 1.0.0
 */
public interface AfterExtractor {

    public void afterProcess(Page page);
}
