package chapter10.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
//        new AA();//接口AA是抽象类，无法实例化
    }
}

interface AA{
    //接口中所有方法都默认public static
    void say();
    void hi();
}
class BB implements AA {//可以使用Alt+Enter快捷键
    //需要实现接口中的所有抽象方法
    @Override
    public void say() {//在此处将修饰符public改为默认，则会报错，证明接口中的方法只能是public，不是默认

    }

    @Override
    public void hi() {

    }
}
//抽象类可以不用实现接口的抽象方法
abstract class CC implements AA{}