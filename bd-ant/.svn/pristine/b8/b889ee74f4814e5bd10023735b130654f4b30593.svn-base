package net.niuniubao.ant.simuquan.model;

import net.niuniubao.ant.HttpClientUtil;
import net.sf.json.JSONObject;

/**
 * Created by GanJianWei on 2016/4/25.
 */
public class CompanyListTest {
    public static void main(String[] args) {
        int page = 1;
        while (true) {
            String queryUrl = "http://api.quchaogu.com/fund/company/list?device_id=a357523055665715&apiversion=1.1&page=1&pagecount=300&req_from=zjsl_jg";
            queryUrl = String.format(queryUrl,page);
            String resp = HttpClientUtil.httpGet(queryUrl);
            JSONObject jsonObject = JSONObject.fromObject(resp);
            if(jsonObject==null) {
              break;
            }

            page++;
        }
    }

}
