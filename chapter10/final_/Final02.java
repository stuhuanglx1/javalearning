package chapter10.final_;

public class Final02 {
    public static void main(String[] args) {
        E e = new E();
        //类属性增加final，将不能更改该属性值
//        e.TAX_RATE = 0.01;
    }
}
final class A02{

}
//A02类增加了final关键字，B类就会报错，无法继承A02类
//class B extends A02 {
//
//}
class C{
    public final void hi(){}
}
class D extends C{
    //增加了final修饰，父类方法不可更改
//    @Override
//    public void hi() {
//        System.out.println("D类的hi方法");
//    }
}
class E{
    public final double TAX_RATE = 0.08;
}
class F{
    public void cry(){
        final double NUM = 0.09;
        //当局部常量用final修饰，该局部变量则不可更改
//        NUM = 0.1;
        System.out.println("NUM = " + NUM);
    }
}
