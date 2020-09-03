package day05;

/**
 * 练习一
 */
public class Start {
    String stageName;
    String gender;
    String works;

    public void say(){
        System.out.println(stageName+"唱歌需要100元");
    }
    public void play(){
        System.out.println(stageName+"演戏需要200元");
    }
}

class Student{
    String StudentName;
    String gender;
    int age;
    public void study(){
        System.out.println(StudentName+"正在学习！");
    }
    public void sleep(){
        System.out.println(StudentName+"正在睡觉！");
    }

}
class Teacher{
    /**
     * 构造器   默认免费赠送无参构造器
     *          1.无参构造器
     *          2.有参构造器
     *      注意事项：1.构造器可以重载（方法名相同，参数不同）
     *                 2.构造方法名必须和类名一样 大小写也一样
     * 标准的javaBean
     *          1.成员变量和成员方法
     *          2.getter  和  setter
     *          3.无参和有参
     */
    String name;
    int age;
    String subject;
    String clazz;
    String sex;

    public Teacher() {
        super();
    }

    public Teacher(String name, int age, String subject, String clazz, String sex) {
        super();
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.clazz = clazz;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0||age>100){
            System.out.println("年龄不合法");
            return;
        }
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getSex(){
        return this.sex;
    }

    public void setSex(boolean sex){
        this.sex= sex?"男":"女";
    }

    public void teacher(){
        System.out.println(name+"老师在讲"+subject);
    }
    public void work(){
        System.out.println(clazz+"加作业");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", clazz='" + clazz + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
