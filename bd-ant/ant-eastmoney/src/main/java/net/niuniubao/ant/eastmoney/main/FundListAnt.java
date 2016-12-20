package net.niuniubao.ant.eastmoney.main;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.eastmoney.mapper.Mapper;
import net.niuniubao.ant.eastmoney.model.FundListJsonData;
import net.niuniubao.ant.mybatis.MybatisSession;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;


/**
 * Created by GanJianWei on 2016/4/20.
 */
public class FundListAnt {
    public static void main(String[] args) {

        SqlSession session = MybatisSession.mybatisSession().openSession();
        Mapper mapper = session.getMapper(Mapper.class);
        String queryUrl = "http://fund.eastmoney.com/data/rankhandler.aspx?op=ph&dt=kf&ft=all&rs=&gs=0&sc=zzf&st=desc&pi=1&pn=4000&dx=1&v=0.5963794291825191";
        String resp = HttpClientUtil.httpGet(queryUrl)+"}";
        resp = resp.replaceAll("var rankData = ", "");
        JSONObject jsonObject = JSONObject.fromObject(resp);

        JSONArray jsonArray = jsonObject.getJSONArray("datas");
        for (int i = 0; i < jsonArray.size(); i++) {
            String fundListInfo[] = jsonArray.getString(i).split(",");
            FundListJsonData fundListJsonData = save(fundListInfo);
            mapper.insertFundList(fundListJsonData);
            session.commit();
        }
        session.close();
    }

    public static FundListJsonData save(String[] fundListInfo){
        FundListJsonData fundListJsonData = new FundListJsonData();
        for (int i = 0; i < fundListInfo.length; i++) {
            fundListJsonData.setFundUrlId(fundListInfo[0]);
            fundListJsonData.setFundName(fundListInfo[1]);
            fundListJsonData.setDataVersion("v1.0.1");
            fundListJsonData.setProcStatus(0);
        }
        return fundListJsonData;
    }
}

