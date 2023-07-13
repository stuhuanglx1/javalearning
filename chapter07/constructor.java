package chapter07;

public class constructor {
    public static void main(String[] args){
        //构造器--新对象的初始化
        /*
        1、方法名与类名相同
        2、没有返回值
        3、在创建对象时，系统会自动调用该类构造器完成对对象的初始化
         */
        P p1 = new P(21,"huang");
        System.out.println("当前人初始化信息: " + p1.age + " , " + p1.name);
        //构造器细节
        /*
        1、一个类可以有多个构造器，即构造器重载
        2、构造器名与类名一致
        3、构造器没有返回值
        4、构造器时是完成对象的初始化，并不是创建对象
        5、在创建对象是，系统自动调用该类构造方法
        6、没有定义构造器时，系统将定义一个默认无参构造方法，如P(){}
        7、一旦定义了构造器，默认的构造器就被覆盖了，就不能使用默认的构造器，若仍想使用需要自己重新构造
         */
        P p2 = new P("huang");
        System.out.println("构造器2：当前人初始化信息: " + p2.age + " , " + p2.name);

        //练习1、2
        P p3 = new P();
        System.out.println("p3的age " + p3.age + ",name " + p3.name);  //18 null
        P p4 = new P("林",25);
        System.out.println("p4的age " + p4.age + ",name " + p4.name);  //25 林

        //对象创建的流程分析（含构造器）
        /*
        1、在方法区加载类信息（.class文件，只会加载一次）
        2、在堆内分配空间（地址）
        3、对象初始化：成员变量默认初始化，再进行显示初始化，构造器的实参列表传入初始化
        4、将创建的对象地址赋值给对象名（对象的引用）
        注意：对象在堆中，栈中存放对象的地址
         */
    }
}

class P{
    int age;
    String name;
    //构造器
    public P(int a,String n){
        System.out.println("构造器(int a,String n)被调用~~");
        name = n;
        age = a;
    }
    public P(String n){
        System.out.println("构造器（String n）被调用~~");
        name = n;

    }

    //练习1--无参构造器
    public P(){
        age = 18;
    }
    //练习2--两个参数的构造器
    public P(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}
