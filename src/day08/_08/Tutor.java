package day08._08;

public  class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号"+id+"助教"+name+"帮助学生解决问题");  ///668
    }
}
