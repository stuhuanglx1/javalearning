package chapter08.super_;

public class Super01 {
    //super关键字代表父类的引用，用于访问父类的属性、方法、构造器
    /*
    1、访问父类属性，但不能访问父类private属性
    2、访问父类的方法，不能访问父类的private方法
    3、访问父类构造器：使用super(参数列表) 必须在构造器第一行
     */
    //super细节
    /*
    1、调用父类是构造器，分工明确
    2、当父类和子类的成员（属性和方法）重名是，为了访问父类成员，必须使用super，如果没有重名super、this直接访问都是一样的效果
    3、super的访问不限于直接父类，如果爷爷类和本类中有同名成员，也可使用super去访问爷爷类成员，super访问符合就近原则
     */

    public static void main(String[] args) {
        B b = new B();
        b.cry();
    }
}
class A{
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public A() {}
    public A(String name) {}
    public A(String name,int age) {}

    public void call(){
        System.out.println("A类的call方法。。。");
    }

    public void test100(){
        System.out.println("test100...");
    }
    protected void test200(){
        System.out.println("test200...");
    }
    void test300(){
        System.out.println("test300...");
    }
    private void test400(){
        System.out.println("test400...");
    }
}
class B extends A{
    public int n1 = 2394;
    public B(){
        super();
//        super("jack");
//        super("tom",90);
    }
    public void hi(){
        System.out.println(super.n1 + "\t" + super.n2 + "\t" + super.n3);
//        System.out.println(super.n4);  //会报错
        super.test100();
        super.test200();
        super.test300();
//        super.test400();  //会报错，不能访问父类私有
    }

    public void call(){
        System.out.println("这是B类的call方法");
    }

    public void cry(){
        System.out.println("B类的cry方法。。。");
        //调用A类的call方法 -- 三种方式

        //先找本类，如果有则调用，若没有则找父类，以此类推。。。。。。。。
        call();//B类
        //this和上述方法顺序一样
        this.call();//B类
        //找call方法的顺序直接查找父类，其他规则一样
        super.call();//A类

        //调用属性n1 -- 三种方式
        System.out.println(n1);//2394
        System.out.println(this.n1);//2394
        System.out.println(super.n1);//100
    }
}
