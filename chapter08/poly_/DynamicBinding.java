package chapter08.poly_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();//向上转型
        System.out.println(a.sum());//40  若子类没有sum方法，则输出30
        System.out.println(a.sum1());//30  若子类没有sum1方法，则输出20
    }
}
class A{
    public int i = 10;
    public int sum(){
        //当子类sum方法注释后，将执行父类中的sumff，但getI方法仍是从子类开始查看，故此处调用子类getI
        return getI() + 10;  //动态绑定机制

    }
    public int sum1(){
        return i + 10;
    }
    public int getI(){
        return i;
    }
}
class B extends A{
    public int i = 20;
//    public int sum(){
//        return i + 20;
//    }
//    public int sum1(){
//        return i + 10;
//    }
    public int getI(){
        return i;
    }
}
