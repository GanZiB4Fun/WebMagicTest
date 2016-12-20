package net.niuniubao.ant.amac.model;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.amac.mapper.AmacMapper;
import net.niuniubao.ant.mybatis.MybatisSession;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmacFundManagerTest {

    public static void main(String[] args) {
        SqlSession session = MybatisSession.mybatisSession().openSession();
        AmacMapper mapper = session.getMapper(AmacMapper.class);

        while (true) {
            List<AmacFundManagerList> lists = mapper.selectFundManagerNotProcess(0);
            if (lists.size() == 0 || lists==null) break;
            for (int i = 0; i < lists.size(); i++) {
                String url = "http://person.amac.org.cn/pages/registration/train-line-register!search.action?ORDER=ASC" +
                        "&ORDERNAME=PP%23PTI_ID%2CPP%23PPP_NAME&filter_EQS_AOI_ID=" + lists.get(i).getAOI_ID() + "&filter_" +
                        "EQS_PTI_ID=&sqlkey=registration&sqlval=SEARCH_FINISH_PUBLICITY";
                String resp = HttpClientUtil.httpGet(url);
                JSONArray jsonArray = JSONArray.fromObject(resp);
                Map map = new HashMap();
                map.put("data", AmacFundManagerList.class);
                for (int j = 0; j < jsonArray.size(); j++) {
                    AmacFundManager amacFundManager = (AmacFundManager) JSONObject.toBean(jsonArray.getJSONObject(j), AmacFundManager.class, map);
                    amacFundManager.setDataVersion("v1.0.1");
                    amacFundManager.setProcStatus(0);
                    amacFundManager.setHtmlId(lists.get(i).getAOI_ID());
                    mapper.insertFundManager(amacFundManager);
                    System.out.println(amacFundManager);
                }
                mapper.updateFundManagerListStatus(lists.get(i).getAmacListId());
            }
        }
        session.commit();
        session.close();
    }
}