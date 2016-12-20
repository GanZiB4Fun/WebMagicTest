package net.niuniubao.ant.simuquan.crawl;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.mybatis.MybatisSession;
import net.niuniubao.ant.simuquan.mapper.SimuquanMapper;
import net.niuniubao.ant.simuquan.model.Json;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/20.
 * 私募排排网Json列表数据爬取接口
 */
public abstract class JsonCrawl<T> extends Thread {

    protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    //抓取链接模板
    private String fetchUrl;

    private Map<String,Class> map;

    public JsonCrawl(String url,Map<String,Class> map) {
        fetchUrl = url;
        this.map = map;
        addTask();
    }

    @Override
    public void run() {
        fetch();
    }

    /**
     * 开启爬取程序
     */
    protected void fetch() {
        String queryUrl = fetchUrl;

        SqlSession session = MybatisSession.mybatisSession().openSession();

        SimuquanMapper mapper = session.getMapper(SimuquanMapper.class);

        int currentPage = getPage();
        while (true) {
            String url = String.format(queryUrl, String.valueOf(currentPage));
            Object object = HttpClientUtil.httpGet(String.format(url, String.valueOf(currentPage)));

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Fetch Data from URL[{}],result data is null? [{}]", url, object == null ? "yes" : "no");
            }

            if (object == null) continue;

            JSONObject jsonObject = JSONObject.fromObject(object.toString());

            Json content = (Json) JSONObject.toBean(jsonObject, Json.class, map);

            T data = (T) content.getData();

            if (!hasMore(data)) {
                deleteTask();
                break;
            }

            process(mapper, data);
            currentPage = getPage();
            session.commit();
        }
        session.close();

        LOGGER.info("[{}] is complete, and exit thread!", this.getName());
    }


    /**
     * 处理获取的数据
     *
     * @param mapper
     * @param data
     */
    protected abstract void process(SimuquanMapper mapper, T data);

    /**
     * 获取一个当前未处理分页,并将分页数下翻
     *
     * @return
     */
    protected abstract int getPage();

    protected abstract void deleteTask();

    protected abstract void addTask();

    protected abstract boolean hasMore(T data);
}
