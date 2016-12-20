package net.niuniubao.ant.simuquan.model;

import net.niuniubao.ant.HttpClientUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class CompanyManagerListTest {

    static int price =0;
    public static void main(String[] args) {
        int page = 1;

        while (true) {
            String queryUrl = "http://api.quchaogu.com/fund/manager/list?page=%s&pagecount=500";
            queryUrl = String.format(queryUrl,page);
            String resp = HttpClientUtil.httpGet(queryUrl);
            JSONObject jsonObject = JSONObject.fromObject(resp);
            JSONObject dataObject = jsonObject.getJSONObject("data");
            JSONArray jsonArray = dataObject.getJSONArray("manager_list");
            if(jsonArray.size()!=0) {
                price=price+jsonArray.size();
            }else {
                price=price+jsonArray.size();
                page--;
                break;
            }
            page++;

        }
        System.out.println("page="+page);
        System.out.println("price="+price);

    }

}