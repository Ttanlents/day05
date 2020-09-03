package day10.test2;

import java.util.List;

public class Clazz {
    String className;
    Teacher teacher;
    List<Student> list;

    public Clazz() {
    }

    public Clazz(String className, Teacher teacher, List<Student> list) {
        this.className = className;
        this.teacher = teacher;
        this.list = list;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public void show(){
        System.out.println("课程名称："+this.className);
        System.out.println("授课老师："+this.teacher.getName());
        for (Student s:this.list){
            System.out.println(s.getName()+" : "+s.getAttend());
        }
    }
}
