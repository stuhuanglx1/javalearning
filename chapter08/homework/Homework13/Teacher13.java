package chapter08.homework.Homework13;

public class Teacher13 extends Person13{
    private int work_age;

    public Teacher13(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("我承诺，我会认真教学。");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    @Override
    public String toString() {
        return super.toString() + ",work_age=" + work_age + "\t" + play();
    }
}
