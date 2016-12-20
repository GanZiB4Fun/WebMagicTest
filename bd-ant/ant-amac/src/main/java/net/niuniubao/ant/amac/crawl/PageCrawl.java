package net.niuniubao.ant.amac.crawl;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.amac.mapper.AmacMapper;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.mybatis.MybatisSession;
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
        //数据库事务准备
        SqlSession session = MybatisSession.mybatisSession().openSession();
        AmacMapper mapper = session.getMapper(AmacMapper.class);

        while (true) {

            List<F> list = list(mapper);

            //如果获取不到未处理数据 判断列表抓取线程是否执行完成
            if (list == null || list.size() == 0) {
                //如果列表抓取线程执行完成,则退出循环处理
                if (listen() == 0) break;
                //如果列表抓取线程还在执行中,则休息10秒,再继续执行
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }

            OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), aClass);

            List<T> results = ooSpider.getAll(getUrls(list));

            for (T result : results) {
                if (result == null) continue;
                insert(result,mapper);
                addCounter();
            }
            ooSpider.close();

            session.commit();
        }
        session.close();
        LOGGER.info("处理完成基金信息详情,线程退出");
    }

    protected abstract List<F> list(AmacMapper mapper);

    protected abstract int listen();

    protected abstract List<String> getUrls(List<F> list);

    protected abstract void insert(T entity,AmacMapper mapper);

    protected abstract void addCounter();
}
