package chapter08.homework;

public class Homework06 {
}
class Grand06{
    String name = "AA";
    private int age = 100;
    public void g1(){}
}
class Father06 extends Grand06{
    String id = "001";
    private double score;
    public void f1(){
//        super.name;
//        super.g1();
        //super可以访问哪些成员
        /*
        属性：name  方法：g1()
         */
//        this.id;
//        this.score;
//        this.name;
//        this.g1();
//        this.f1();
        //this可以访问哪些成员
        /*
        属性：name\id\score  方法：g1()\f1()
         */
    }
}
class Son06 extends Father06{
    String name = "BB";
    public void g1(){ }
    private void show(){
//        super.id;
//        super.name;
//        super.f1();
//        super.g1();
        //super可以访问哪些成员
        /*
        属性：id\name  方法：f1()\g1()（Grand06类中）
         */
//        this.name;
//        this.id;
//        this.g1();
//        this.f1();
//        this.show();
        //this可以访问哪些成员
        /*
        属性：name\id 方法：g1()（Son06类中）\f1()\show()
         */
    }
}
