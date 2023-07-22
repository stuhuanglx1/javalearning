package chapter08.poly_.objpoly;

public class polyObject {
    public static void main(String[] args) {
        //编译类型Animal，运行类型是Dog
        Animal animal = new Dog();
        animal.cry();//小狗在叫
        //编译类型Animal，运行类型是Cat
        animal = new Cat();
        animal.cry();//小猫在叫

    }

}

class Animal{

    public void cry(){
        System.out.println("动物在叫");
    }
}
class Dog extends Animal{

    public void cry(){
        System.out.println("小狗在叫");
    }
}
class Cat extends Animal{

    public void cry(){
        System.out.println("小猫在叫");
    }
}
