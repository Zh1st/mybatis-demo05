package sfw.xmut.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sfw.xmut.pojo.Student;
import utils.MybatisUtils;

import static org.junit.Assert.*;

public class StudentMapperTest {

    SqlSession session;
    StudentMapper studentMapper;

    @Before
    public void setUp() throws Exception {
        session= MybatisUtils.getSession();
        studentMapper=session.getMapper(StudentMapper.class);
    }

    @Test
    public void selectStudentById() {
        Student student=studentMapper.selectStudentById(2);
        System.out.println(student);
    }

    @Test
    public void updateStudentById(){
        Student student=new Student();
        student.setId(4);
        student.setName("李雷");
        student.setAge(21);
        studentMapper.updateStudentById(student);
        System.out.println("1234");
    }

    @After
    public void tearDown() throws Exception {
        session.commit();
        session.close();
    }


}
