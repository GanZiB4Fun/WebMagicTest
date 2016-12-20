package net.niuniubao.ant.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by xiaoming(a)wallaw.cn on 16/4/20.
 */
public class MybatisSession {

    private SqlSessionFactory sqlSession;

    private static MybatisSession mybatisSession;

    public static synchronized MybatisSession mybatisSession() {
        if (mybatisSession == null) {
            mybatisSession = new MybatisSession();
        }

        return mybatisSession;
    }

    private MybatisSession(){
        //数据库事务准备
        String resource = "mybatis-config.xml";


//        InputStream inputStream = null;
//        try {
//            inputStream = Resources.getResourceAsStream(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        sqlSession = sqlSessionFactory.openSession(true);


        ApplicationContext act = new ClassPathXmlApplicationContext("application-context.xml");
        sqlSession = (SqlSessionFactory) act.getBean("sqlSessionFactory");
    }

    public SqlSession openSession(){
        return sqlSession.openSession(true);
    }

    public void close(){
    }


}
