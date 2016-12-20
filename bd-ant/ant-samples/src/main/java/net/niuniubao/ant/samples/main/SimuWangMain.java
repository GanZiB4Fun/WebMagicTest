package net.niuniubao.ant.samples.main;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.Site;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.samples.model.vo.SimuWangFundObj;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/14.
 */
public class SimuWangMain {
    public static void main(String[] args) {
        List indexCodes =getFundCode();
        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), SimuWangFundObj.class);

        //获取当前产品数据
        SimuWangFundObj SimuWangFundObj = ooSpider.get("http://dc.simuwang.com/product/HF00001A1S.html");


//        List<SimuWangFundObj> resultItemses = ooSpider.<SimuWangFundObj>getAll(indexCodes);
//        System.out.println(resultItemses);
        ooSpider.close();
    }


    private static List getFundCode(){
        String queryUrl = "http://dc.simuwang.com/Screen/getData.html?page=1%s&condition=fund_type:1,6,4,3,8,2,7,5;sort_name:ret_ytd;sort_asc:desc;keyword:;ret:ret_ytd";
        List list = new ArrayList();
        for (int i = 1; i < 2; i++) {
            String resp = HttpClientUtil.httpGet(String.format(queryUrl, String .valueOf(i)));
            JSONObject jo = JSONObject.fromObject(resp);
            JSONArray jsonArray = jo.getJSONArray("data");

            //获取产品历史净值
            String templateUrl = "http://dc.simuwang.com/product/%s.html";
            for (Object object : jsonArray) {
                JSONObject jsonObject = (JSONObject) object;
                String fundId = jsonObject.get("fund_id").toString();
                list.add(String.format(templateUrl, fundId));
                int page = 1;
                while (true) {
                    String navResp = HttpClientUtil.httpGet("http://dc.simuwang.com/Fund/getNavHis.html?id="+fundId+"&page=" + page + "&json=1");
                    JSONObject navObj = JSONObject.fromObject(navResp);
                    JSONArray dataArray =  navObj.getJSONArray("data");
                    JSONObject pagerObj = navObj.getJSONObject("pager");

                    System.out.println(dataArray);

                    if (page++>Integer.valueOf(pagerObj.get("pagecount").toString())) break;
                }
            }
        }
            return list;


    }
}
