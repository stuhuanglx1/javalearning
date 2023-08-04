package chapter10.static_;

public class VisitStatic {
    public static void main(String[] args) {
        //类名.类变量名
        //说明：类变量是随着类加载而创建的，没有创建实例对象也可以访问
        System.out.println(A.name);//无需创建实例对象

        A a = new A();
        System.out.println("a.name = " + a.name);

        //类方法
        Stu.show();
        Stu stu1 = new Stu("tom");
        Stu.payFee(200);

        //静态方法的两种调用方式
        Stu.show();//推荐写法
        stu1.show();
        stu1.payFee(100);

        Stu stu2 = new Stu("chairs");
        Stu.payFee(300);
        Stu.show();
    }
}
class A{
    //类变量
    //类变量的访问，依旧遵守相关的访问权限
    public static String name = "hlx";
}
class Stu{
    private String name;
    //定义一个静态变量统计学生学费总金额
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee){
        Stu.fee += fee;
    }
    public static void show(){
        System.out.println("总学费为" + Stu.fee);
    }
}
