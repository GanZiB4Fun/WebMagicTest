package net.niuniubao.ant.simuquan.model;

import net.niuniubao.ant.HttpClientUtil;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/25.
 */
public class CrawlCompanyListTest {

    public static void main(String[] args){

        int currentPage = 10000;
        String queryUrl = "http://api.quchaogu.com/fund/company/list?page=%s";

        String url = String.format(queryUrl, String.valueOf(currentPage));
        Object object = HttpClientUtil.httpGet(String.format(url, String.valueOf(currentPage)));

        JSONObject jsonObject = JSONObject.fromObject(object.toString());

        Map<String, Class> map = new HashMap<String, Class>();
        map.put("data", CompanyListData.class);
        map.put("company_list", CompanyList.class);

        Json content = (Json) JSONObject.toBean(jsonObject, Json.class, map);

        CompanyListData data = (CompanyListData) content.getData();

        System.out.println(data);
    }
}
