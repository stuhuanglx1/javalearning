package chapter10.innerclass_;

/**
 * 演示匿名内部类
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04{//外部类
    private int n1 = 10;//属性
    public void method(){
        //基于接口的匿名内部类
        /*
        需求：想使用IA接口，并创建对象(只使用一次)
        传统方式：写一个类，然后实现该接口，并创建对象  -->  使用一次但定义了一个类，浪费
        解决方案：匿名内部类，简化开发
         */
//        IA tiger = new Tiger();
//        tiger.cry();
        //tiger的编译类型：IA；运行类型：匿名内部类
        /*
        底层--会分配类名,类名XXX=>Outer04$1
        class XXX implements IA{
            @Override
            public void cry() {
                System.out.println("老虎叫。");
            }
        }
         */
        IA tiger = new IA(){  //JDK底层z创建匿名内部类Outer04$1时，立即创建了Outer$1实例，并且把地址返回给tiger
            @Override
            public void cry() {
                System.out.println("老虎叫。");
            }
        };//匿名内部类只能使用一次，即Outer04$1只能使用一次，但实例对象tiger可以反复使用
        tiger.cry();

        //基于类的匿名内部类
        //father的编译类型：Father，运行类型：匿名内部类Outer04$2
        //("jack")参数列表会传递给构造器
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类：重写father的test方法");
            }
        };
        father.test();
        father.test();//实例可以反复使用
        System.out.println("father的运行类型：" + father.getClass());//Outer04$2

        //基于抽象类的匿名内部类--必须实现抽象方法
        new Animal(){
            @Override
            void eat() {
                System.out.println("吃东西。。。");
            }
        }.eat();

    }
}
interface IA{//接口
    public void cry();
}
//class Tiger implements IA{
//    @Override
//    public void cry() {
//        System.out.println("老虎吼。。。");
//    }
//}
class Father{//其他外部类
    public Father(String name){//构造器
        System.out.println("接收到 name = " + name);
    }
    public void test(){//方法
    }
}
//抽象类
abstract class Animal{
    abstract void eat();
}