package chapter08.modifier;

public class Test {
    public static void main(String[] args) {

        /*访问修饰符—用于控制方法的访问权限
        Public  对外公开
        Protected  对子类和同一个包中类公开
        默认  对同一个包中类公开
        Private  只有类本身可以访问，不对外公开
         */


        /*注意事项
        1、	修饰符可以用来修饰类中的属性，成员方法及类
        2、	只有public和默认能修饰类
         */


        //本类所有修饰符可访问
        A a = new A();
        a.m1();
        a.m2();
        a.m3();
//        a.m4();//报错
        //A和B在同一个包下，可以访问public\protected\默认，不能访问private
        B b = new B();
        b.f();
        //在packagelearning包下还有一个TestModifier进行测试
        //不同包下不能访问protected、默认、private，仅有public可以访问
    }
}
