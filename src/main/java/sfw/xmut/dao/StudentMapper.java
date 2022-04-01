package sfw.xmut.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import sfw.xmut.pojo.Student;

import java.util.List;

public interface StudentMapper {

    @Select("select * from s_student WHERE id=#{id}")
    Student selectStudentById(int id);

    @Update("UPDATE s_student set name=#{name} WHERE id=#{id}")
    void updateStudentById(Student student);

    @Select("select * from s_student WHERE cid=#{cid}")
    List<Student> selectStudentbyByCid(int cid);

}
