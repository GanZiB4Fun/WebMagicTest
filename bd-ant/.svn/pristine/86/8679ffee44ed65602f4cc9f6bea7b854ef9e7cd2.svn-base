package net.niuniubao.ant.amac.model;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.amac.mapper.AmacMapper;
import net.niuniubao.ant.mybatis.MybatisSession;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

public class AmacFundManagerListTest {
    public static void main(String[] args) {

        SqlSession session = MybatisSession.mybatisSession().openSession();

        AmacMapper mapper = session.getMapper(AmacMapper.class);
        for (int j = 1; j < 100; j++) {
            String url ;
            if (j<10){
                url ="http://person.amac.org.cn/pages/registration/train-line-register!orderSearch.action?ORDER=ASC&ORDERNAME=AOI%23AOI_NAME&filter_EQS_OTC_ID=0"+j+"&sqlkey=registration&sqlval=SELECT_LINE_PERSON";
            }else {
                url ="http://person.amac.org.cn/pages/registration/train-line-register!orderSearch.action?ORDER=ASC&ORDERNAME=AOI%23AOI_NAME&filter_EQS_OTC_ID="+j+"&sqlkey=registration&sqlval=SELECT_LINE_PERSON";
            }

            String resp =  HttpClientUtil.httpGet(url);
            JSONArray jsonArray = JSONArray.fromObject(resp);
            Map map = new HashMap();
            map.put("data",AmacFundManagerList.class);
            for (int i = 0; i < jsonArray.size(); i++) {
                AmacFundManagerList amacFundManagerList = (AmacFundManagerList) JSONObject.toBean(jsonArray.getJSONObject(i), AmacFundManagerList.class, map);
                amacFundManagerList.setDataVersion("v1.0.1");
                amacFundManagerList.setProcStatus(0);
                mapper.insertFundManagerList(amacFundManagerList);
            }
        }

    }
}