package chapter10.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();//可以被实例化
        EE ee = new EE();
        ee.cal();//final修饰的方法仍然能被继承使用
        System.out.println(FF.num);//只输出100，不会调用代码块（即不进行类加载）--高效率
//        String;
//        Double;
    }
}
class AA{
    //定义时赋值
    public final double TAX_RATE = 0.08;
//    public final double TAX_RATE2;//就这样单放着，不给值，报错

    public final double TAX_RATE3;
    //构造器中赋值
    public AA(){
        TAX_RATE3 = 0.04;
    }

    public final double TAX_RATE4;
    //代码块中给值
    {
        TAX_RATE4 = 0.067;
    }
}
class BB{
    public static final double T1 = 2;
    public static final double T2;
//    public static final double T3;

    //静态代码块
    static {
        T2 = 20;
    }

//    //构造器，不能给final修饰的静态属性赋值
//    public BB(){
//        T3 = 7;
//    }
//
}
final class CC{}
class DD{
    public final void cal(){
        System.out.println("cal()");
    }
}
class EE extends DD{

}
class FF{
    public final static int num = 100;
    static {
        System.out.println("FF静态代码块");
    }
}
