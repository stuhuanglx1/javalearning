package chapter10.main_;

public class main01 {
    //深入理解main方法
    /*
    main方法的形式：public static void main(String[] args) { }
    1、Java虚拟机调用类main()方法，所以访问权限是public --main方法是虚拟机进行调用
    2、Java虚拟机在执行main方法时不必创建对象，所以是静态方法
    3、该方法接收String类型的数组参数，该数组保存执行Java命令时传递给所运行类型的类的参数
    4、java执行程序无需返回值，故void返回类型
    特别提示：1）在main方法中可以调用main方法所在类的静态方法或静态属性
    2）但无法直接访问该类中的非静态成员，必须创建一个该类的实例对象后才能通过对象去访问类中的静态成员
     */

    //静态属性
    private static String name = "hhh";
    //非静态属性
    private int n = 1000;
    //静态方法
    public static void hi(){
        System.out.println("main01的hi方法");
    }
    //非静态方法
    public void cry(){
        System.out.println("cry");
    }

    public static void main(String[] args) {
        //可以直接访问本类的静态方法和属性
        System.out.println("name = " + name);
        hi();
//        System.out.println("n = " + n);//错误，无法访问非静态成员
//        cry();//错误，无法访问非静态方法
        //若想访问上述非静态方法，需要创建实例对象
        new main01().cry();
    }
}
