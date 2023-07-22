package chapter08.poly_.PolyDetail;

public class detail01 {
    public static void main(String[] args) {
        //向上转型
        Animal animal = new Cat();
        animal.eat();//cat eats
        animal.run();//run
        animal.sleep();//sleep
//        animal.catchMouse();//无法调用子类的特有方法
        //编译阶段能调用哪些成员由编译类型决定
        System.out.println("=====================");
        //向下转型
        //运用向下转型可以调用catchMouse方法
        Cat cat = (Cat) animal;//编译类型是Cat，运行类型是Cat  animal这个对象本来就是指向Cat类的
        cat.eat();
        cat.catchMouse();
        Animal animal1 = new Animal();
        animal1.eat();
//        Cat cat1 = (Cat) animal1;//报错
//        cat1.catchMouse();//报错
        Animal animal2 = new Dog();
        animal2.eat();
//        Cat cat2 = (Cat) animal2;//报错
    }
}
class Animal{
    public void eat(){
        System.out.println("eat");
    }
    public void run(){
        System.out.println("run");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("cat eats");
    }
    public void catchMouse(){
        System.out.println("cat catch mouse...");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("dog eats");
    }
    public void eatBones(){
        System.out.println("dog eat bones...");
    }
}
