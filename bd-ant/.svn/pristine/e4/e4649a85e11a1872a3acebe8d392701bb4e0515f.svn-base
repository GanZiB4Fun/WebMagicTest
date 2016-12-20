package net.niuniubao.ant.simuquan.main;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.simuquan.crawl.PageCrawl;
import net.niuniubao.ant.simuquan.mapper.SimuquanMapper;
import net.niuniubao.ant.simuquan.model.*;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cuiyingjia on 16/4/26.
 */
public class FundInfoCrawl extends PageCrawl<FundInfoData,FundList>{

    private static long counter = 0;

    private static int task = 0;


    public FundInfoCrawl(Class<FundInfoData> aClass) {
        super(aClass);
    }

    /**
     * 处理返回的json数据
     *
     * @param jsonObject
     * @return
     */
    @Override
    protected int proccess(SimuquanMapper mapper,JSONObject jsonObject) {
        Map map = new HashMap();
        map.put("data",FundInfoData.class);
        map.put("jz_summary",JzSummary.class);
        map.put("jz_withdraw",JzWithdraw.class);
        map.put("jz_chart",JzChart.class);
        map.put("jz_list",JzList.class);
        Json content = (Json) JSONObject.toBean(jsonObject, Json.class, map);
        FundInfoData data = (FundInfoData)content.getData();

        FundInfo fundInfo = data.getFund_info();
        fundInfo.setData_version(SimuquanCrawlMain.VERSION);
        fundInfo.setProc_status(0);
        mapper.insertFundInfo(fundInfo);

        List<JzSummary> jzSummaries = data.getJz_summary();
        if (jzSummaries != null){
        for(JzSummary jzSummary : jzSummaries){
            jzSummary.setData_version(SimuquanCrawlMain.VERSION);
            jzSummary.setProc_status(0);
            jzSummary.setFund_id(fundInfo.getFund_id());
            mapper.insertJzSummary(jzSummary);
        }
        }
        List<JzWithdraw> jzWithdraws = data.getJz_withdraw();
        if (jzWithdraws != null){
            for(JzWithdraw jzWithdraw : jzWithdraws){
                jzWithdraw.setData_version(SimuquanCrawlMain.VERSION);
                jzWithdraw.setProc_status(0);
                jzWithdraw.setFund_id(fundInfo.getFund_id());
                mapper.insertJzWithdraw(jzWithdraw);
            }
        }
        List<JzList> jzLists = data.getJz_list();
        if (jzLists != null){
        for(JzList jzList : jzLists){
            jzList.setData_version(SimuquanCrawlMain.VERSION);
            jzList.setProc_status(0);
            jzList.setFund_id(fundInfo.getFund_id());
            mapper.insertJzList(jzList);
        }
        }

        List<JzChart> jzCharts = data.getJz_chart();
        if (jzCharts != null){
        for(JzChart jzChart : jzCharts){
            jzChart.setData_version(SimuquanCrawlMain.VERSION);
            jzChart.setProc_status(0);
            jzChart.setFund_id(fundInfo.getFund_id());
            mapper.insertJzChart(jzChart);
        }
        }

        FenhongInfo fenhongInfo = data.getFenhong_info();
        if(fenhongInfo != null){
            fenhongInfo.setData_version(SimuquanCrawlMain.VERSION);
            fenhongInfo.setProc_status(0);
            fenhongInfo.setFund_id(fundInfo.getFund_id());
            mapper.insertFenhongInfo(fenhongInfo);
            this.fenhongList(fundInfo,mapper);
        }



        return 0;
    }

    private void fenhongList(FundInfo fundInfo,SimuquanMapper mapper){
        Object object = HttpClientUtil.httpGet("http://api.quchaogu.com/fund/fenhong/list?apiversion=1.1&app_version=2.2.0.7&fund_id="+fundInfo.getFund_id());
        if (object == null) return;
        JSONObject jsonObject = JSONObject.fromObject(object.toString());
        Map map = new HashMap();
        map.put("data",FenhongList.class);
        map.put("fenhong_list",FenhongInfo.class);
        Json content = (Json) JSONObject.toBean(jsonObject, Json.class, map);
        FenhongList data = (FenhongList) content.getData();
        if(data == null) return;
        for (FenhongInfo fenhongInfo : data.getFenhong_list()){
            fenhongInfo.setData_version(SimuquanCrawlMain.VERSION);
            fenhongInfo.setProc_status(0);
            fenhongInfo.setFund_id(fundInfo.getFund_id());
            mapper.insertFenhongList(fenhongInfo);
        }
        return;
    }

    @Override
    protected List<FundList> list(SimuquanMapper mapper) {

        System.out.println(this.getName());
        List<FundList> list = mapper.selectFundIdNotProc(0);

        for (FundList fundList:list){
            mapper.updateFundListStatus(-1,fundList.getFund_id(),fundList.getData_version());
        }

        return list;
    }

    @Override
    protected int listen() {
        return FundListCrawl.getTask();
    }

    @Override
    protected List<String> getUrls(List<FundList> list) {
        List<String> urls = new ArrayList<String>();
        for (FundList data : list) {
            urls.add("http://api.quchaogu.com/fund/info/detail?apiversion=1.1&app_version=2.2.0.7&fund_id="+ data.getFund_id()+"&show_jz_chart=1&show_jz_list=1&show_jz_summary=1");
        }
        return urls;
    }

    @Override
    protected void insert(Json entity, SimuquanMapper mapper) {}

    @Override
    protected synchronized void deleteTask() {
        task--;
    }

    @Override
    protected synchronized void addTask() {
        task++;
    }

    @Override
    protected synchronized void addCounter() {
        counter++;
    }

    public static long getCounter() {
        return counter;
    }

    public static int getTask() {
        return task;
    }
}
