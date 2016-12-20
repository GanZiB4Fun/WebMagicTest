package net.niuniubao.ant.eastmoney.main;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.eastmoney.mapper.Mapper;
import net.niuniubao.ant.eastmoney.model.ManagerFund;
import net.niuniubao.ant.eastmoney.model.ManagerJsonData;
import net.niuniubao.ant.mybatis.MybatisSession;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ManagerFundMainTest {

    public static void main(String[] args) {
        //数据库事务准备
        SqlSession session = MybatisSession.mybatisSession().openSession();
        Mapper mapper = session.getMapper(Mapper.class);

        while (true){
            List<ManagerJsonData> managerJsonDatas = mapper.selectManagerIdNotProc(-1);
            if (managerJsonDatas.size()==0|| managerJsonDatas==null) break;
            for (int i = 0; i < managerJsonDatas.size(); i++) {
                String url = "http://fund.eastmoney.com/data/FundDataPortfolio_Interface.aspx?dt=17&mc=jjjl&pn=200&pi=1&jlid="+managerJsonDatas.get(i).getManagerUrlId();
                String resp = HttpClientUtil.httpGet(url).replaceAll("var jjjl = \\{graph: \\[", "").replaceAll("\\};","");
                String graph[] = resp.split("\\],");
                String fundJsonData[] = graph[0].replaceAll("\\},\\{","}},{{").split("\\},\\{");
                ManagerFund managerFund = new ManagerFund();
                managerFund.setManagerUrlId(managerJsonDatas.get(i).getManagerUrlId());
                managerFund.setDataVersion("v1.0.1");
                managerFund.setProcStatus(0);
                for (int j = 0; j < fundJsonData.length ; j++) {
                    JSONObject jsonObject = JSONObject.fromObject(fundJsonData[j]);
                    managerFund.setName(jsonObject.getString("name"));
                    managerFund.setValueField(jsonObject.getString("valueField"));
                    mapper.insertManagerFund(managerFund);
                    mapper.updateManagerListStatus(1,managerJsonDatas.get(i).getManagerListId());
                    session.commit();
                }

            }
        }

        session.close();
    }
}