package net.niuniubao.ant.eastmoney.main;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.eastmoney.mapper.Mapper;
import net.niuniubao.ant.eastmoney.model.ManagerJsonData;
import net.niuniubao.ant.eastmoney.model.ManagerObj;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.mybatis.MybatisSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 管理过的基金http://fund.eastmoney.com/data/FundDataPortfolio_Interface.aspx?dt=17&mc=jjjl&pn=300&pi=1&jlid=30277862
 * Created by design on 2016/5/3.
 */
public class ManagerJbgkAnt {
    public static void main(String[] args) {
        //数据库事务准备
        SqlSession sqlSession = MybatisSession.mybatisSession().openSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);

        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), ManagerObj.class);

        while(true){
            List<ManagerJsonData> managerJsonDatas = mapper.selectManagerIdNotProc(0);
            if(managerJsonDatas.size()==0|| managerJsonDatas==null) break;
            for (int i = 0; i <managerJsonDatas.size() ; i++) {
                ManagerObj managerObj= ooSpider.get("http://fund.eastmoney.com/manager/"+managerJsonDatas.get(i).getManagerUrlId()+".html");
                managerObj.setManagerUrlId(managerJsonDatas.get(i).getManagerUrlId());
                String companyUrlId = managerObj.getCompanyUrlId().replaceAll("[a-z|\\.|\\:|\\/]","");
                managerObj.setCompanyUrlId(companyUrlId);
                mapper.insertManager(managerObj);
                mapper.updateManagerListStatus(1,managerJsonDatas.get(i).getManagerListId());
                sqlSession.commit();
            }
        }
        ooSpider.close();
        sqlSession.close();
    }
}
