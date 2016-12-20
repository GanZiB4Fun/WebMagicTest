package net.niuniubao.ant.samples.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.niuniubao.ant.ResultItems;
import net.niuniubao.ant.Task;
import net.niuniubao.ant.pipeline.Pipeline;
import net.niuniubao.ant.utils.FilePersistentBase;

import java.io.*;
import java.util.Map;

/**
 * @author dev@niuniubao.net
 */
public class OneFilePipeline extends FilePersistentBase implements Pipeline {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private PrintWriter printWriter;

    /**
     * create a FilePipeline with default path"/data/webmagic/"
     */
    public OneFilePipeline() throws FileNotFoundException, UnsupportedEncodingException {
        this("/data/webmagic/");
    }

    public OneFilePipeline(String path) throws FileNotFoundException, UnsupportedEncodingException {
        setPath(path);
        printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(getFile(path)), "UTF-8"));
    }

    @Override
    public synchronized void process(ResultItems resultItems, Task task) {
        printWriter.println("url:\t" + resultItems.getRequest().getUrl());
        for (Map.Entry<String, Object> entry : resultItems.getAll().entrySet()) {
            if (entry.getValue() instanceof Iterable) {
                Iterable value = (Iterable) entry.getValue();
                printWriter.println(entry.getKey() + ":");
                for (Object o : value) {
                    printWriter.println(o);
                }
            } else {
                printWriter.println(entry.getKey() + ":\t" + entry.getValue());
            }
        }
        printWriter.flush();
    }
}
