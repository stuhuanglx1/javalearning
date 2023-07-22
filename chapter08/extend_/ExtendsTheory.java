package chapter08.extend_;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);//大头儿子
//        System.out.println(son.age);//会报错
        System.out.println(son.getAge());//39
        System.out.println(son.hobby);//旅游
    }
}
class Grandpa{
    String name = "大头爷爷";
    String hobby = "旅游";
    int age = 67;
}
class Father extends Grandpa{
    String name = "大头爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }
}
class Son extends Father{
    String name = "大头儿子";
}

