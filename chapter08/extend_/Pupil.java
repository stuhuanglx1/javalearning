package chapter08.extend_;


//模拟小学生考试
public class Pupil {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        System.out.println("小学生" + name + "正在考数学");
    }
    public void showInfo(){
        System.out.println("name=" + this.name + " age=" + this.age + " score=" + this.score);
    }

}
