package day22.装饰者;

/**
 * @author 余俊锋
 * @date 2020/9/3 9:54
 */
public class StudentStrong implements code {
    Student student;
    public StudentStrong( Student student) {
        this.student=student;
    }

    @Override
    public void study() {
        student.study();
        System.out.println("springcloud");
    }
}
