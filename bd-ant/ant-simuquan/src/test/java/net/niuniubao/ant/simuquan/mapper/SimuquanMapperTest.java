package net.niuniubao.ant.simuquan.mapper;

import net.niuniubao.ant.mybatis.MybatisSession;
import net.niuniubao.ant.simuquan.model.FundList;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by cuiyingjia on 16/4/27.
 */
public class SimuquanMapperTest {

    @Test
    public void testSelectFundIdNotProc() throws Exception {
        SqlSession session = MybatisSession.mybatisSession().openSession();
        SimuquanMapper mapper = session.getMapper(SimuquanMapper.class);
        List<FundList>  list = mapper.selectFundIdNotProc(10);

        return;
    }
}