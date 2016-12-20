package net.niuniubao.ant.simuquan.main;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.mybatis.MybatisSession;
import net.niuniubao.ant.simuquan.mapper.SimuquanMapper;
import net.niuniubao.ant.simuquan.model.CompanyList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CompanyCrawlTest {

    public static void main(String[] args) {
        //数据库事务
        SqlSession session = MybatisSession.mybatisSession().openSession();
        SimuquanMapper mapper = session.getMapper(SimuquanMapper.class);

        List<CompanyList> lists = mapper.selectCompanyIdNotProc(0);
        for (CompanyList companyList: lists){
            String queryUrl = "http://api.quchaogu.com/fund/company/detail?company_id=%s";
            String url = String.format(queryUrl, String.valueOf(companyList.getCompany_id()));

            Object object = HttpClientUtil.httpGet(url);
            JSONObject jsonObject = JSONObject.fromObject(object.toString());
            JSONObject dataObject = jsonObject.getJSONObject("data");
            JSONArray fillingArray = dataObject.getJSONArray("filing_list");



        }

    }
}