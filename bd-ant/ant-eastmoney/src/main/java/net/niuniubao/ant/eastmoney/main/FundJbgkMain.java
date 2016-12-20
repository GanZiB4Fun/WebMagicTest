package net.niuniubao.ant.eastmoney.main;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.eastmoney.mapper.Mapper;
import net.niuniubao.ant.eastmoney.model.FundJbgkObj;
import net.niuniubao.ant.eastmoney.model.FundListJsonData;
import net.niuniubao.ant.model.OOSpider;
import net.niuniubao.ant.mybatis.MybatisSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by design on 2016/5/3.
 */
public class FundJbgkMain {
    public static void main(String[] args) {
        SqlSession session = MybatisSession.mybatisSession().openSession();
        Mapper mapper =session.getMapper(Mapper.class);
        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), FundJbgkObj.class);
        while (true){
            List<FundListJsonData> fundListJsonDatas = mapper.selectFundIdNotProc(0);
            if(fundListJsonDatas==null || fundListJsonDatas.size()==0) break;
            for (int i = 0; i <fundListJsonDatas.size() ; i++) {
                FundJbgkObj fundJbgkObj = ooSpider.get("http://fund.eastmoney.com/f10/jbgk_"+fundListJsonDatas.get(i).getFundUrlId()+".html");
                fundJbgkObj.setCompanyUrlId(fundJbgkObj.getCompanyUrlId().replaceAll("[a-z|\\.|\\:|\\/]",""));
                fundJbgkObj.setFundManagerUrlId(fundJbgkObj.getFundManagerUrlId().replaceAll("[a-z|\\.|\\:|\\/]", ""));
                fundJbgkObj.setFundUrlId(fundListJsonDatas.get(i).getFundUrlId());
                mapper.insertFundJbgk(fundJbgkObj);
                mapper.updateFundListStatus(-1,fundListJsonDatas.get(i).getFundListId());
                session.commit();
            }
        }
        session.close();
        ooSpider.close();
    }
}
