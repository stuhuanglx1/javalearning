package chapter08.packagelearing;

import chapter08.modifier.A;

public class TestModifier {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("n1=" + a.n1);
//        System.out.println("n2=" + a.n2);//报错
//        System.out.println("n3=" + a.n3);//报错
//        System.out.println("n4=" + a.n4);//报错
        a.m1();
//        a.m2();//报错
//        a.m3();//报错
//        a.m4();//报错
    }
}
