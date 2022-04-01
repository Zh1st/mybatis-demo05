package sfw.xmut.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sfw.xmut.pojo.Iclass;
import utils.MybatisUtils;

public class ClassMapperTest {

    SqlSession session;
    ClassMapper classMapper;

    @Before
    public void setUp() throws Exception {
        session= MybatisUtils.getSession();
        classMapper=session.getMapper(ClassMapper.class);
    }


    @Test
    public void selectClassByID() {
        Iclass iclass=classMapper.selectClassByID(2);
        System.out.println(iclass);

    }

    @After
    public void tearDown() throws Exception {
        session.commit();
        session.close();
    }

}