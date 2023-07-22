package chapter08.homework.Homework13;

public class Person13 {
    private String name;
    private char sex;
    private int age;

    public Person13(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "name=" + name + ", sex=" + sex + ", age=" + age ;
    }

    public String play(){
        return name + "爱玩";
    }
}
