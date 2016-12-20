package net.niuniubao.ant.scripts;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author dev@niuniubao.net
 * @since 1.0.0
 */
public class ScriptEnginePool {

    private final int size;

    private final AtomicInteger availableCount;

    private final LinkedBlockingQueue<ScriptEngine> scriptEngines = new LinkedBlockingQueue<ScriptEngine>();

    public ScriptEnginePool(Language language,int size) {
        this.size = size;
        this.availableCount = new AtomicInteger(size);
        for (int i=0;i<size;i++){
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName(language.getEngineName());
            scriptEngines.add(engine);
        }
    }

    public ScriptEngine getEngine() {
        availableCount.decrementAndGet();
        return scriptEngines.poll();
    }

    public void release(ScriptEngine scriptEngine){
        scriptEngines.add(scriptEngine);
        availableCount.incrementAndGet();
    }

}
