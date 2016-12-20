package net.niuniubao.ant.amac.crawl;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.amac.mapper.AmacMapper;
import net.niuniubao.ant.amac.model.Json;
import net.niuniubao.ant.mybatis.MybatisSession;
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
public abstract class JsonCrawl<T> extends Thread {

    protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    //抓取链接模板
    private String fetchUrl;

    private Class mClass;

    public JsonCrawl(Class<T> mClass,String url) {
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

        AmacMapper mapper = session.getMapper(AmacMapper.class);

        int currentPage = getPage();
        while (true) {
            String url = String.format(queryUrl, String.valueOf(currentPage));
            Object object = HttpClientUtil.httpPostJson(String.format(url, String.valueOf(currentPage)),"{}");

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Fetch Data from URL[{}],result data is null? [{}]", url, object == null ? "yes" : "no");
            }

            if (object == null) continue;

            JSONObject jsonObject = JSONObject.fromObject(object.toString());

            Map<String, Class<T>> map = new HashMap<String, Class<T>>();
            map.put("content", mClass);

            Json content = (Json) JSONObject.toBean(jsonObject, Json.class, map);

            List<T> list = content.getContent();

            for (T entity : list) {
                insert(mapper,entity);
                addCounter();
            }
            currentPage = getPage();
            session.commit();

            if (currentPage > content.getTotalPages()) {
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
    protected abstract void insert(AmacMapper mapper,T entity);

    /**
     * 数据处理计数器增加
     */
    protected abstract void addCounter();

    protected abstract void deleteTask();

    protected abstract void addTask();
}
