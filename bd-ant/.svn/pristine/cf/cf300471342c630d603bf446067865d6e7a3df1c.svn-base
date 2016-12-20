package net.niuniubao.ant.eastmoney.model;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.eastmoney.mapper.Mapper;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.mybatis.MybatisSession;
import org.apache.ibatis.session.SqlSession;

public class ManagerObjTest {

    public static void main(String[] args) {
        //数据库事务准备
        SqlSession sqlSession = MybatisSession.mybatisSession().openSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);

        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), ManagerObj.class);

                ManagerObj managerObj= ooSpider.get("http://fund.eastmoney.com/manager/30277862.html");
                String companyUrlId = managerObj.getCompanyUrlId().replaceAll("http\\:\\/\\/fund\\.eastmoney\\.com/manager/","").replaceAll("\\.html","");
                managerObj.setCompanyUrlId(companyUrlId);
                System.out.println(managerObj);



        ooSpider.close();
    }
}