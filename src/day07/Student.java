package day07;

public class Student {
    private String name;
    private int age;
    private static int sid;
    private String clazz = "java45";

    static {
        System.out.println("加载外部资源给成员变量赋值");
    }

    public Student() {
        sid++;
        System.out.println("无参数构造");
    }

    public Student(String name, int age) {
        System.out.println("有参数构造器");
        sid++;
        this.name = name;
        this.age = age;
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
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", clazz='" + clazz + '\'' +
                ", sid='" + sid + '\'' +
                '}';
    }
}
