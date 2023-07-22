package chapter08.modifier;

public class B {
    public void f(){
        A a = new A();
        //A和B在同一个包下，可以访问public\protected\默认，不能访问private
        System.out.println("n1=" + a.n1);
        System.out.println("n2=" + a.n2);
        System.out.println("n3=" + a.n3);
//        System.out.println("n4=" + a.n4);    //会报错
    }
}
