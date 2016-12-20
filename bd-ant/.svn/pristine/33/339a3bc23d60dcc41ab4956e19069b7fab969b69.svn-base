package net.niuniubao.ant.eastmoney.model;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.eastmoney.mapper.Mapper;
import net.niuniubao.ant.mybatis.MybatisSession;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;

public class ManagerJsonDataTest {
    public static void main(String[] args) {
        SqlSession session = MybatisSession.mybatisSession().openSession();
        Mapper mapper =session.getMapper(Mapper.class);
        String queryUrl = "http://fund.eastmoney.com/Data/FundDataPortfolio_Interface.aspx?dt=14&mc=returnjson&ft=all&pn=1390&pi=1&sc=abbname&st=asc";
        String resp = HttpClientUtil.httpGet(queryUrl);
        resp = resp.replaceAll("var returnjson= ","");
        JSONObject jsonObject = JSONObject.fromObject(resp);
        JSONArray jsonArray = jsonObject.getJSONArray("data");
//        List<ManagerJsonData> list = new ArrayList<ManagerJsonData>();

        for (int i = 0; i <jsonArray.size() ; i++) {
            String managerInfoStr = "\","+jsonArray.get(i).toString()+",\"";
            managerInfoStr =  managerInfoStr.replaceAll("\\[", "").replaceAll("\\]", "");

            ManagerJsonData managerJsonData = saveManager(managerInfoStr.split("\\\",\\\""));
            mapper.insertManagerList(managerJsonData);
            session.commit();
            session.close();
        }

    }

    public static ManagerJsonData saveManager(String[] args){
        ManagerJsonData manager = new ManagerJsonData();
        for (int i = 0; i < args.length ; i++) {
            manager.setManagerUrlId(args[1]);
            manager.setManagerName(args[2]);
            manager.setCompanyUrlId(args[3]);
            manager.setCompanyName(args[4]);
            manager.setFundUrlId(args[5]);
            manager.setFundName(args[6]);
            manager.setWorkDays(args[7]);
            manager.setCurrentBestReturn(args[8]);
            manager.setBestReturnFund(args[9]);
            manager.setTotalFundAssets(args[10]);
            manager.setBestReturn(args[11]);

        }
        return manager;
    }
}