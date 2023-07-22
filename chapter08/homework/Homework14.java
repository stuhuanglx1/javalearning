package chapter08.homework;

public class Homework14 {
    public static void main(String[] args) {
        C14 c = new C14();
        /*
        我是A类
        haha我是B类的有参构造器
        我是C类的有参构造器
        我是C类的无参构造器
         */
    }
}
class A14{
    public A14(){
        System.out.println("我是A类");//①
    }
}
class B14 extends A14{
    public B14() {
        System.out.println("我是B类的无参构造器");
    }
    public B14(String name){
        System.out.println(name + "我是B类的有参构造器");//②
    }
}
class C14 extends B14{
    public C14() {
        this("hello");
        System.out.println("我是C类的无参构造器");//④
    }
    public C14(String name){
        super("haha");
        System.out.println("我是C类的有参构造器");//③
    }
}