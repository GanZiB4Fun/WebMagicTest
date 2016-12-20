package net.niuniubao.ant.simuwang.crawl;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.mybatis.MybatisSession;
import net.niuniubao.ant.simuwang.mapper.SimuWangMapper;
import net.niuniubao.ant.simuwang.model.Json;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/20.
 * 私募排排网Json列表数据爬取接口
 */
public abstract class JsonCrawl<M> extends Thread {

    protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    //抓取链接模板
    private String fetchUrl;

    private Class mClass;

    public JsonCrawl(Class<M> mClass,String url) {
        this.mClass = mClass;
        fetchUrl = url;
        addTask();
    }

    @Override
    public void run(){
        fetch();
    }

    /**
     * 开启爬取程序
     */
    protected void fetch() {
        String queryUrl = fetchUrl;

        SqlSession session = MybatisSession.mybatisSession().openSession();

        SimuWangMapper mapper = session.getMapper(SimuWangMapper.class);

        int currentPage = getPage();
        while (true) {
            String url = String.format(queryUrl, String.valueOf(currentPage));
            Object object = HttpClientUtil.httpGet(String.format(url, String.valueOf(currentPage)));

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Fetch Data from URL[{}],result data is null? [{}]", url, object == null ? "yes" : "no");
            }

            if (object == null) continue;

            JSONObject jsonObject = JSONObject.fromObject(object.toString());

            Map<String, Class<M>> map = new HashMap<String, Class<M>>();
            map.put("data", mClass);

            Json content = (Json) JSONObject.toBean(jsonObject, Json.class, map);

            List<M> list = content.getData();

            for (M entity : list) {
                insert(mapper,entity);
                addCounter();
            }
            currentPage = getPage();
            session.commit();

            if (currentPage > content.getPager().getPagecount()) {
                deleteTask();
                break;
            }
        }
        session.close();

        LOGGER.info("[{}] is complete, and exit thread!", this.getName());
    }

    /**
     * 获取一个当前未处理分页,并将分页数下翻
     *
     * @return
     */
    protected abstract int getPage();

    /**
     * 处理并插入需要插入的数据
     *
     * @param mapper
     * @param entity
     */
    protected abstract void insert(SimuWangMapper mapper,M entity);

    /**
     * 数据处理计数器增加
     */
    protected abstract void addCounter();

    protected abstract void deleteTask();

    protected abstract void addTask();
}
