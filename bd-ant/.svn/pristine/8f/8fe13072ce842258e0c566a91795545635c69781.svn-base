package net.niuniubao.ant.samples.main;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.samples.model.vo.EastMoneyManagerObj;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import net.niuniubao.ant.Site;
import net.niuniubao.ant.model.OOSpider;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.*;

/**
 * Created by cuiyingjia on 16/4/8.
 */
public class EastMoneyMain {

    public static void main(String[] args) {

        List indexCodes = getManagerIndexCode();

        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), EastMoneyManagerObj.class);
//        EastMoneyManagerObj eastMoneyObj = ooSpider.get("http://fund.eastmoney.com/manager/30277862.html");
//        System.out.println(eastMoneyObj);

        List<EastMoneyManagerObj> resultItemses = ooSpider.<EastMoneyManagerObj>getAll(indexCodes);

        System.out.println(resultItemses);

        ooSpider.close();


    }

    private static List getManagerIndexCode(){
        String queryUrl = "http://person.amac.org.cn/pages/registration/train-line-register!orderSearch.action";
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("ORDER", "ASC"));
        params.add(new BasicNameValuePair("ORDERNAME", "AOI#AOI_NAME"));
        params.add(new BasicNameValuePair("filter_EQS_OTC_ID", "01"));
        params.add(new BasicNameValuePair("sqlkey", "registration"));
        params.add(new BasicNameValuePair("sqlval", "SELECT_LINE_PERSON"));
        String resp = HttpClientUtil.httpPost(queryUrl,params);
        String[] preJson = resp.split("\\{");
        String json = "{"+preJson[preJson.length-1];
//        System.out.println(json);
//        System.out.println("------------我是华丽的分割线------------");
        JSONObject jo = JSONObject.fromObject(json);
        JSONArray jsonArray =  jo.getJSONArray("data");

        Collection java_collection = JSONArray.toCollection(jsonArray);
        Object[] objects1 =java_collection.toArray();
        ArrayList<String> arrayList= new ArrayList<String>();
        for (Object object : objects1){
            object = object.toString().replaceAll("\\[|\\]","");
            arrayList.add(object.toString());
        }
        List list = new ArrayList();
        String templateUrl = "http://fund.eastmoney.com/manager/%s.html";
        int i = 0;
        for (String str :arrayList){
            list.add(String.format(templateUrl,str.split(",",0)[0]));
            System.out.println(list.get(i));
            i++;
        }

        return list;
    }


}
