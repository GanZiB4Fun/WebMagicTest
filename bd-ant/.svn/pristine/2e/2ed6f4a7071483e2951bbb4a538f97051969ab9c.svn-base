package net.niuniubao.ant.handler;

import net.niuniubao.ant.Request;

/**
 * @author dev@niuniubao.net
 * @since 1.0.0
 */
public interface RequestMatcher {

    /**
     * Check whether to process the page.<br><br>
     * Please DO NOT change page status in this method.
     *
     * @param page page
     *
     * @return whether matches
     */
    public boolean match(Request page);

    public enum MatchOther {
        YES, NO
    }
}
