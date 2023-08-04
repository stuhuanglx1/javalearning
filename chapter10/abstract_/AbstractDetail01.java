package chapter10.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {
        //抽象类不能被实例化
//        new A();
    }
}
abstract class A{
//    abstract int n1 = 1;//abstract不能修饰属性等，只能修饰方法和类
    //不一定要包含抽象方法
}
//抽象类本质还是类，可以有类的各种成员
abstract class B{
    public int n1 = 10;
    public static String name = "23";

    public void hi(){
        System.out.println("hi");
    }
    public abstract void hello();
    public static void cal(){
        System.out.println("cal()");
    }
}
abstract class C{
    public abstract void hi();
    public abstract void say();
    public abstract void ok();
}
//实现抽象类的所有方法
class D extends C{
    @Override
    public void hi() {
        //相当于实现父类C的所有抽象方法
    }

    @Override
    public void say() {
    }

    @Override
    public void ok() {
    }
}
//子类也是抽象类
abstract class E extends C{
}

//8、抽象方法不能用private、final和static来修饰，和重写相违背
abstract class F{
//    private abstract void hi();//报错，无法重写
//    public static abstract void hi();//报错，无法重写 没有实例！
//    public final abstract void hi();//报错，无法重写
}
