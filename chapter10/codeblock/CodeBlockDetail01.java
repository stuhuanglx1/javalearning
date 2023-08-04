package chapter10.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //创建实例对象时（new）
//        AA aa = new AA();

        //创建子类对象时，父类也会加载
//        BB bb = new BB();
        //会先加载父类代码块，再加载子类，而且父类先被加载
        /*
        AA  静态代码块被执行。。。
        BB  静态代码块被执行。。。
        AA  普通代码块被执行
         */

        //使用类的静态成员时
        System.out.println(Cat.age);
        /*
        Animal  静态代码块被执行。。。
        Cat  静态代码块被执行。。。
        10
         */

        //静态代码块仅加载一次
        //普通代码块可以多次执行
//        DD dd = new DD();
//        DD dd1 = new DD();
        /*
        DD  静态代码块被执行。。。
        DD  普通代码块被执行。。。
        DD  普通代码块被执行。。。
         */

        //如果只使用类的静态成员，普通代码块并不会执行
        System.out.println(DD.num);
        /*
        DD  静态代码块被执行。。。
        12
         */

    }
}
class AA{
    //静态代码块
    static {
        System.out.println("AA  静态代码块被执行。。。");
    }
    {
        System.out.println("AA  普通代码块被执行");
    }
}
class BB extends AA{
    //静态代码块
    static {
        System.out.println("BB  静态代码块被执行。。。");
    }
}
class Animal{
    static {
        System.out.println("Animal  静态代码块被执行。。。");
    }
}
class Cat extends Animal{
    public static int age = 10;
    static {
        System.out.println("Cat  静态代码块被执行。。。");
    }
}
class DD{
    public static int num = 12;
    //静态代码块
    static {
        System.out.println("DD  静态代码块被执行。。。");
    }
    //普通代码块  -- 构造器的补充
    //再new对象时被调用，每创建一个对象调用一次，和类是否加载无关
    {
        System.out.println("DD  普通代码块被执行。。。");
    }
}