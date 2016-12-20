package net.niuniubao.ant.eastmoney.model;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.eastmoney.mapper.Mapper;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.mybatis.MybatisSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CompanyJbgkObjTest {
    public static void main(String[] args) {
        SqlSession session = MybatisSession.mybatisSession().openSession();
        Mapper mapper =session.getMapper(Mapper.class);
        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), CompanyJbgkObj.class);
        List<CompanyJsonData> companyJsonDatas =  mapper.selectCompanyIdNotProc(0);
        for (int i = 0; i < companyJsonDatas.size(); i++) {
            CompanyJbgkObj companyJbgkObj = ooSpider.get("http://fund.eastmoney.com/company/f10/jbgk_"+companyJsonDatas.get(i).getCompanyUrlId()+".html");
            mapper.insertCompanyJbgk(companyJbgkObj);
            session.commit();
        }
            session.close();
        ooSpider.close();
    }
}