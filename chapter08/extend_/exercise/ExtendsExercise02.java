package chapter08.extend_.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        C1 c1 = new C1();
        /*
        结果：
        我是A1类的无参构造器。。。
        我是B1类的有参构造器 haha
        我是C1类的有参构造器。。。
        我是C1类的无参构造器。。。
         */
    }
}
class A1{
    public A1(){
        System.out.println("我是A1类的无参构造器。。。");
    }
}
class B1 extends A1{
    public B1(){
        System.out.println("我是B1类的无参构造器。。。");
    }
    public B1(String name){
        System.out.println("我是B1类的有参构造器 " + name);
    }
}
class C1 extends B1{
    public C1(){
        this("hello");
        System.out.println("我是C1类的无参构造器。。。");
    }
    public C1(String name){
        super("haha");
        System.out.println("我是C1类的有参构造器。。。");
    }
}