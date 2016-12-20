package net.niuniubao.ant.downloader;

import net.niuniubao.ant.Page;
import net.niuniubao.ant.Request;
import net.niuniubao.ant.Task;

/**
 * Downloader is the part that downloads web pages and store in Page object. <br>
 * Downloader has {@link #setThread(int)} method because downloader is always the bottleneck of a crawler,
 * there are always some mechanisms such as pooling in downloader, and pool size is related to thread numbers.
 *
 * @author dev@niuniubao.net <br>
 * @since 1.0.0
 */
public interface Downloader {

    /**
     * Downloads web pages and store in Page object.
     *
     * @param request request
     * @param task    task
     * @return page
     */
    Page download(Request request, Task task);

    /**
     * Tell the downloader how many threads the spider used.
     *
     * @param threadNum number of threads
     */
    void setThread(int threadNum);
}
