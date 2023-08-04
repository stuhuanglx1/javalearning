package chapter10.interface_;

public class Interface_ {
    //接口
    /*
    给出一些没有实现的方法，将其封装到一起，到某个类要使用时，再根据具体方法情况写方法
    语法：
    interface 接口名{
    属性
    方法(1抽象方法 2默认方法 3静态方法)
    }
    class 类名 implements 接口{
    自己属性
    自己方法
    必须实现的接口的抽象方法
    }
    1、在JDK7以前，接口里的所有方法都没有方法体，都是抽象方法
    2、JDK8以后，接口可以有静态方法，默认方法，可以有方法的具体实现
    【应用实现】
    1、将需要的功能、规格定下来，然后让别人去实现
    2、具体来说，一个项目经理管3个程序员，开发一个功能，为了控制和管理软件，项目经理定义一些接口，由程序员具体实现
     -- 接口的统一调用（多人协作需要规范）
    注意事项：
    1）接口不能被实例化
    2）接口中所有方法都是public，接口中的抽象方法可以不需要abstract修饰
    3）一个普通类实现接口，就必须将该接口的所有方法都实现
    4）抽象类实现接口，可以不要实现接口方法
    5）一个类可以实现多个接口 A extends B
    6）接口中的属性都是final（public static final），必须初始化
    7）接口中属性的访问形式：接口名.属性名
    8）接口不能继承别的类，但可以继承多个别的接口
    9）接口的修饰符只能是默认和public，和类的修饰符一样
    接口 VS 继承类
    实现机制是对单继承机制的补充，继承是继承父类功能，接口是实现新功能
    ①接口和继承解决问题不同
    继承的价值在于：解决代码的复用性和可维护性
    接口的价值在于：设计好各种规范，让其他类去实现这些方法
    ②接口比继承更加灵活
    继承是满足is-a关系，而接口只需要满足like-a关系
    ③接口在一定程度上使代码解耦
    * 接口的多态特性 *
     1）多态参数
     接口引用可以指向实现了接口的类对象（可以接收多个对象）
     2）多态数组
     详见InterfacePolyParameter.java
     3）接口存在多态传递
     */


}