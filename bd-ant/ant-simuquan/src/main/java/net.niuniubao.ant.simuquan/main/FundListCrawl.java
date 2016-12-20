package net.niuniubao.ant.simuquan.main;

import net.niuniubao.ant.simuquan.crawl.JsonCrawl;
import net.niuniubao.ant.simuquan.mapper.SimuquanMapper;
import net.niuniubao.ant.simuquan.model.FundList;
import net.niuniubao.ant.simuquan.model.FundListData;

import java.util.Map;

/**
 * Created by cuiyingjia on 16/4/26.
 */
public class FundListCrawl extends JsonCrawl<FundListData> {

    private static int page = 1;
    private static int task = 0;
    private static long counter = 0;//列表数据计数器

    public FundListCrawl(Map<String, Class> map) {
        super("http://api.quchaogu.com/fund/info/list?apiversion=1.1&app_version=2.2.0.7&page=%s&pagecount=16170", map);
    }

    /**
     * 处理获取的数据
     *
     * @param mapper
     * @param data
     */
    @Override
    protected void process(SimuquanMapper mapper, FundListData data) {
        for(FundList fundList : data.getFund_list() ){
            fundList.setData_version(SimuquanCrawlMain.VERSION);
            fundList.setProc_status(0);
            mapper.insertFundList(fundList);
            addCounter();
        }

    }

    /**
     * 获取一个当前未处理分页,并将分页数下翻
     *
     * @return
     */
    @Override
    protected synchronized int getPage() {
        return page++;
    }

    @Override
    protected synchronized void deleteTask() {
        task--;
    }

    @Override
    protected synchronized void addTask() {
        task++;
    }

    @Override
    protected boolean hasMore(FundListData data) {
        if (data == null || data.getFund_list().size() == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 数据处理计数器增加
     */
    protected synchronized void addCounter() {
        counter++;
    }

    public static int getTask() {
        return task;
    }

    public static long getCounter() {
        return counter;
    }
}
