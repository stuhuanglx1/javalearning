package chapter10.abstract_;

public class Absract02 {
}
abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //这个eat方法其实没什么意义--父类方法无确定性 ==> 将该方法设计为抽象（abstract）方法
    //所谓抽象方法就是没有实现的方法==>没有方法体
//    public void eat(){
//        System.out.println("这是一个动物，但不知道吃什么");
//    }
    public abstract void eat();
    //当一个类中有抽象方法，这个类将被声明为抽象类
}
