package chapter12.exception_;

/**
 * @author H lx
 * @vision 1.0
 */
public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B();//向上转型
        //向下转型
        B b2 = (B)b;
        C c2 = (C)b;//报错
        //Exception in thread "main" java.lang.ClassCastException
    }
}
class A{}
class B extends A{}
class C extends A{}