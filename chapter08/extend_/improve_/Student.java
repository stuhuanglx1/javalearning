package chapter08.extend_.improve_;

//Pupil和Graduate的父类
public class Student {
    //共有的属性
    public String name;
    public int age;
    private double score;
    //共有的方法
    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo(){
        System.out.println("name=" + this.name + " age=" + this.age + " score=" + this.score);
    }
}
