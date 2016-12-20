package net.niuniubao.ant.simuquan.main;

import net.niuniubao.ant.simuquan.crawl.PageCrawl;
import net.niuniubao.ant.simuquan.mapper.SimuquanMapper;
import net.niuniubao.ant.simuquan.model.Json;
import net.niuniubao.ant.simuquan.model.ManagerData;
import net.niuniubao.ant.simuquan.model.ManagerInfo;
import net.niuniubao.ant.simuquan.model.ManagerList;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by GanJianWei on 2016/4/28.
 */
public class ManagerPageCrawl extends PageCrawl<ManagerData,ManagerList>{

    private static long counter = 0;

    private static int page = 1;//分页计数器

    private static int taskCount = 0;//任务计数器,一个线程代表一个任务

    public ManagerPageCrawl(Class<ManagerData> aClass) {
        super(aClass);
    }

    @Override
    protected int proccess(SimuquanMapper mapper, JSONObject jsonObject) {

        Map map = new HashMap();
        map.put("data", ManagerData.class);
        map.put("manager_info", ManagerInfo.class);
        Json content = (Json) JSONObject.toBean(jsonObject, Json.class, map);
        ManagerData data = (ManagerData) content.getData();

        ManagerInfo managerInfo = data.getManager_info();
        managerInfo.setData_version(SimuquanCrawlMain.VERSION);
        managerInfo.setProc_status(0);
        mapper.insertManagerInfo(managerInfo);

        return 0;
    }

    @Override
    protected synchronized List list(SimuquanMapper mapper) {
        List<ManagerList> list = mapper.selectManagerIdNotProc(0);
        for (ManagerList managerList : list){
            mapper.updateManagerListStatus(1,managerList.getManager_list_id());
        }
        return list;
    }

    @Override
    protected int listen() {
       return ManagerListCrawl.getTask();
    }

    @Override
    protected  List<String> getUrls(List<ManagerList> list) {
        List<String> urls = new ArrayList<String>();
        for (ManagerList data : list) {
            urls.add("http://api.quchaogu.com/fund/manager/detail?manager_id=" + data.getId());
        }
        return urls;
    }

    @Override
    protected void insert(Json entity, SimuquanMapper mapper) {

    }

    @Override
    protected synchronized void deleteTask() {
        taskCount--;
    }

    @Override
    protected synchronized void addTask() {
        taskCount++;
    }

    @Override
    protected synchronized void addCounter() {
        counter++;
    }

    public static long getCounter(){
        return counter;
    }

    public static synchronized int getPage() {
        return page++;
    }

    public static int getTaskCount() {
        return taskCount;
    }
}
