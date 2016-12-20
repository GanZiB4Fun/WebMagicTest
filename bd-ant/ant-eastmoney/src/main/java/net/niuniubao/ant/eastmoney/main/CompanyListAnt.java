package net.niuniubao.ant.eastmoney.main;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.eastmoney.mapper.Mapper;
import net.niuniubao.ant.eastmoney.model.CompanyJsonData;
import net.niuniubao.ant.mybatis.MybatisSession;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/20.公司列表数据抓取
 * 天天基金网
 */
public class CompanyListAnt {

    public static void main(String[] args) {
        SqlSession session = MybatisSession.mybatisSession().openSession();
        Mapper mapper =session.getMapper(Mapper.class);
        String queryUrl = "http://fund.eastmoney.com/Data/FundRankScale.aspx?v=0.11116677499376237";
        String resp = HttpClientUtil.httpGet(queryUrl);
        resp = resp.replaceAll("var json=","");
        JSONObject jsonObject = JSONObject.fromObject(resp);
        JSONArray jsonArray = jsonObject.getJSONArray("datas");

        for (int i = 0; i <jsonArray.size() ; i++) {
           String companyInfoStr = jsonArray.get(i).toString();
           companyInfoStr =  companyInfoStr.replaceAll("\\[","").replaceAll("\\]","");
            String companyInfo[] = companyInfoStr.split(",");
            for (int j = 0; j < companyInfo.length; j++) {
                companyInfo[j]=companyInfo[j].replaceAll("\"","");
            }
            CompanyJsonData eastMoneyCompanyJsonData = saveCompanyInfo(companyInfo);
            mapper.insertCompanyList(eastMoneyCompanyJsonData);
            session.commit();
        }
        session.close();
    }

    /**
     * 保存公司列表信息并返回
     * @param companyInfo
     * @return
     */
    public static CompanyJsonData saveCompanyInfo(String companyInfo[]){
        CompanyJsonData eastMoneyCompanyJsonData = new CompanyJsonData();

        eastMoneyCompanyJsonData.setCompanyUrlId(companyInfo[0]);
        eastMoneyCompanyJsonData.setCompanyName(companyInfo[1]);
        eastMoneyCompanyJsonData.setRegisterDate(companyInfo[2]);
        eastMoneyCompanyJsonData.setHeaderName(companyInfo[3]);
        eastMoneyCompanyJsonData.setFundSum(companyInfo[4]);
        eastMoneyCompanyJsonData.setCompanyShortNameEn(companyInfo[5]);
        eastMoneyCompanyJsonData.setUnknown(companyInfo[6]);
        eastMoneyCompanyJsonData.setManagementSize(companyInfo[7]);
        eastMoneyCompanyJsonData.setHaiTongPiont(companyInfo[8]);
        eastMoneyCompanyJsonData.setCompanyShortName(companyInfo[9]);
        eastMoneyCompanyJsonData.setUnknownNumber(companyInfo[10]);
        eastMoneyCompanyJsonData.setEndDate(companyInfo[11]);
        eastMoneyCompanyJsonData.setProcStatus(0);
        eastMoneyCompanyJsonData.setDataVersion("v1.0.1");

        return eastMoneyCompanyJsonData;
    }

}
