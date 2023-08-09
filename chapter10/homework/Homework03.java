package chapter10.homework;

/**
 * @author H lx
 * @vision 1.0
 * 编程题：考察面向对象（高级）
 */
public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();
        Animal dog = new Dog();
        dog.shout();
    }
}
abstract class Animal{
    public abstract void shout();
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("猫会喵喵叫。。。");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫。。。");
    }
}
