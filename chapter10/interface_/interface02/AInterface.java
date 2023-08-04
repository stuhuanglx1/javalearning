package chapter10.interface_.interface02;

public interface AInterface {
    //写属性
    public int n1 = 10;
    //写方法
    //在接口中，抽象方法可以省略abstract，无论写与否，都是抽象方法
    public void hi();

    //JDK8后可以有默认实现方法,需要使用default修饰
//    public void say(){
//        System.out.println();
//    }   //有方法体会报错
    default public void say(){
        System.out.println("say...");
    }
    //JDK8后有静态方法
    public static void cry(){
        System.out.println("cry...");
    }

}
//如果一个类implements实现接口，需要将接口中所有的抽象方法都实现
class A implements AInterface{
    @Override
    public void hi() {
        System.out.println("hi...");
    }
}
