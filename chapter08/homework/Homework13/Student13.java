package chapter08.homework.Homework13;

public class Student13 extends Person13{
    private String stu_id;

    public Student13(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我承诺，我会好好学习。");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    @Override
    public String toString() {
        return super.toString() + ",stu_id=" + stu_id + "\t" + play();
    }
}
