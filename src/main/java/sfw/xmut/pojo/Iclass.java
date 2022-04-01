package sfw.xmut.pojo;

import java.util.List;

public class Iclass {

    private int id;
    private String classname;
    private List<Student> studentList;


    @Override
    public String toString() {
        return "Iclass{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                ", studentList=" + studentList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
