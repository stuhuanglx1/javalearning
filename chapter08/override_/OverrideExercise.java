package chapter08.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person nancy = new Person("nancy", 20);
        System.out.println(nancy.say());
        Student chars = new Student("chars", 18, "111", 89.5);
        System.out.println(chars.say());
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say(){
        return "我是" + name + "，今年" + age + "岁";
    }
}
class Student extends Person{
    private String id;
    private double score;

    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
    public String say(){
        return super.say() + "，id为" + id + "，考了" + score + "分";
    }
}
