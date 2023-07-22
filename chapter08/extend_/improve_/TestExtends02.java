package chapter08.extend_.improve_;

public class TestExtends02 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小黄";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(90);
        pupil.showInfo();

        System.out.println("=====================");
        Graduate graduate = new Graduate();
        graduate.name = "大黄";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(59);
        graduate.showInfo();
    }
}
