package net.niuniubao.ant.eastmoney.main;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.eastmoney.mapper.Mapper;
import net.niuniubao.ant.eastmoney.model.CompanyJbgkObj;
import net.niuniubao.ant.eastmoney.model.CompanyJsonData;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.mybatis.MybatisSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by GanJianWei on 2016/4/21.
 */
public class CompanyJbgkMain {
    public static void main(String[] args) {
        SqlSession session = MybatisSession.mybatisSession().openSession();
        Mapper mapper =session.getMapper(Mapper.class);
        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), CompanyJbgkObj.class);
        while (true){
            List<CompanyJsonData> companyJsonDatas =  mapper.selectCompanyIdNotProc(0);
            if(companyJsonDatas==null|| companyJsonDatas.size()==0) break;
            for (int i = 0; i < companyJsonDatas.size(); i++) {
                CompanyJbgkObj companyJbgkObj = ooSpider.get("http://fund.eastmoney.com/company/f10/jbgk_"+companyJsonDatas.get(i).getCompanyUrlId()+".html");
                if (companyJbgkObj == null)  continue;
                companyJbgkObj.setCompanyUrlId(companyJsonDatas.get(i).getCompanyUrlId());
                mapper.insertCompanyJbgk(companyJbgkObj);
                mapper.updateCompanyListStatus(1,companyJsonDatas.get(i).getCompanyListId());
                session.commit();
            }
        }
        session.close();
        ooSpider.close();
    }
}
