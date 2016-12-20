package net.niuniubao.ant.simuquan.crawl;


import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.mybatis.MybatisSession;
import net.niuniubao.ant.simuquan.mapper.SimuquanMapper;
import net.niuniubao.ant.simuquan.model.Json;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/20.
 */
public abstract class PageCrawl<T,F> extends Thread {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    private Class<T> aClass;

    public PageCrawl(Class<T> aClass){
          addTask();
          this.aClass = aClass;
    }

    /**
     * 逐条处理基金信息数据
     *
     */
    @Override
    public void run() {
        fetch();
    }

    private void fetch() {


        while (true) {
            //数据库事务准备
            SqlSession session = MybatisSession.mybatisSession().openSession();
            SimuquanMapper mapper = session.getMapper(SimuquanMapper.class);
            List<F> list = list(mapper);
            LOGGER.info("列表数据[{}]",list.size());
            //如果获取不到未处理数据 判断列表抓取线程是否执行完成
            if (list == null || list.size() == 0) {
                //如果列表抓取线程执行完成,则退出循环处理
                if (listen() == 0){
                    break;
                }
                //如果列表抓取线程还在执行中,则休息10秒,再继续执行
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }

            List<String> urls = getUrls(list);

            for(String url : urls){
                Object object = HttpClientUtil.httpGet(url);
                if (object == null) continue;
                JSONObject jsonObject = JSONObject.fromObject(object.toString());
                proccess(mapper,jsonObject);
                addCounter();
            }
            session.commit();
            session.close();
        }

        deleteTask();

        LOGGER.info("处理完成基金信息详情,线程退出");
    }

    /**
     * 处理返回的json数据
     * @param jsonObject
     * @param mapper
     * @return
     */
    protected abstract int proccess(SimuquanMapper mapper,JSONObject jsonObject);

    protected abstract List<F> list(SimuquanMapper mapper);

    protected abstract int listen();

    protected abstract List<String> getUrls(List<F> list);

    protected abstract void insert(Json entity,SimuquanMapper mapper);

    protected abstract void deleteTask();

    protected abstract void addTask();

    protected abstract void addCounter();
}
