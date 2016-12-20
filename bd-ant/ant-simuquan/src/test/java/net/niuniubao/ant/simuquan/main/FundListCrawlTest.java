package net.niuniubao.ant.simuquan.main;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.simuquan.model.FundList;
import net.niuniubao.ant.simuquan.model.FundListData;
import net.niuniubao.ant.simuquan.model.Json;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by cuiyingjia on 16/4/26.
 */
public class FundListCrawlTest {

    public static void main(String[] args) {

//        int currentPage = 1;
//        String queryUrl = "http://api.quchaogu.com/fund/info/list?apiversion=1.1&app_version=2.2.0.7&page=1&pagecount=20";
//
//        String url = String.format(queryUrl, String.valueOf(currentPage));
//        Object object = HttpClientUtil.httpGet(String.format(url, String.valueOf(currentPage)));
//
//        JSONObject jsonObject = JSONObject.fromObject(object.toString());
//
//        Map<String, Class> map = new HashMap<String, Class>();
//        map.put("data", FundListData.class);
//        map.put("fund_list", FundList.class);
//
//        Json content = (Json) JSONObject.toBean(jsonObject, Json.class, map);
//
//        FundListData data = (FundListData) content.getData();
//
//        System.out.println(data);





    }

}