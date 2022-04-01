package sfw.xmut.dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import sfw.xmut.pojo.Iclass;

public interface ClassMapper {

    @Select("SELECT * from c_class where id=#{id}")
    @Results({@Result(id=true,property = "id",column = "id"),
             @Result(property = "studentList",column = "id",
             many = @Many(select = "sfw.xmut.dao.StudentMapper.selectStudentbyByCid"))})
    Iclass selectClassByID(int id);
}
