package net.niuniubao.ant.processor;

import net.niuniubao.ant.Page;
import net.niuniubao.ant.Site;

/**
 * Interface to be implemented to customize a crawler.<br>
 * <br>
 * In PageProcessor, you can customize:
 * <br>
 * start urls and other settings in {@link Site}<br>
 * how the urls to fetch are detected               <br>
 * how the data are extracted and stored             <br>
 *
 * @author dev@niuniubao.net <br>
 * @see Site
 * @see Page
 * @since 1.0.0
 */
public interface PageProcessor {

    /**
     * process the page, extract urls to fetch, extract the data and store
     *
     * @param page page
     */
    void process(Page page);

    /**
     * get the site settings
     *
     * @return site
     * @see Site
     */
    Site getSite();
}
