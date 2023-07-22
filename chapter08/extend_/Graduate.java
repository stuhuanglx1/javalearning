package chapter08.extend_;

public class Graduate {

    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){//就只有testing方法与Pupil不一样
        System.out.println("大学生" + name + "正在考高等数学");
    }
    public void showInfo(){
        System.out.println("name=" + this.name + " age=" + this.age + " score=" + this.score);
    }
    //与Pupil的属性和方法有很多相同的，继承可以解决代码复用
}
