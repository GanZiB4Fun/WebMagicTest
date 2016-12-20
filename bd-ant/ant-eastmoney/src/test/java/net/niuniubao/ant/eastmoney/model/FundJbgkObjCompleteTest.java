package net.niuniubao.ant.eastmoney.model;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.eastmoney.mapper.Mapper;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.mybatis.MybatisSession;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by GanJianWei on 2016/5/4.
 */
public class FundJbgkObjCompleteTest {
    public static void main(String[] args) {
        //数据库事务准备
        SqlSession session = MybatisSession.mybatisSession().openSession();
        Mapper mapper = session.getMapper(Mapper.class);

        //爬虫就位
        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), FundJbgkObj.class);
        FundJbgkObj fundJbgkObj = ooSpider.get("http://fund.eastmoney.com/f10/jbgk_000355.html");
            fundJbgkObj.setFundJbgkId(1534);
            fundJbgkObj.setCompanyUrlId(fundJbgkObj.getCompanyUrlId().replaceAll("[a-z|\\.|\\:|\\/]", ""));
            fundJbgkObj.setFundManagerUrlId(fundJbgkObj.getFundManagerUrlId().replaceAll("[a-z|\\.|\\:|\\/]", ""));
            mapper.updateFundJbgk(fundJbgkObj);
            session.commit();
        session.close();
        ooSpider.close();
    }
}
