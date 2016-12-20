package net.niuniubao.ant.simuquan.main;

import net.niuniubao.ant.simuquan.crawl.JsonCrawl;
import net.niuniubao.ant.simuquan.mapper.SimuquanMapper;
import net.niuniubao.ant.simuquan.model.ManagerList;
import net.niuniubao.ant.simuquan.model.ManagerListData;

import java.util.Map;

/**
 * Created by GanJianWei on 2016/4/26.
 */
public class ManagerListCrawl extends JsonCrawl<ManagerListData> {
    private static int page = 1;
    private static int task = 0;
    private static long counter = 0;//列表数据计数器

    public ManagerListCrawl(Map<String, Class> map) {
        super("http://api.quchaogu.com/fund/manager/list?page=%s&pagecount=500", map);
    }

    /**
     * 处理获取的数据
     *
     * @param mapper
     * @param data
     */
    @Override
    protected void process(SimuquanMapper mapper, ManagerListData data) {
        for(ManagerList managerList : data.getManager_list() ){
            managerList.setData_version(SimuquanCrawlMain.VERSION);
            managerList.setProc_status(0);
            mapper.insertManagerList(managerList);
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
    protected boolean hasMore(ManagerListData data) {
        if (data == null || data.getManager_list().size() == 0) {
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
