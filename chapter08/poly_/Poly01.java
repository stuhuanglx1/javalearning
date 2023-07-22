package chapter08.poly_;

public class Poly01 {
    //传统方法写案列，创建多个类--代码复用性不高，不利于代码维护 -->多态
    public static void main(String[] args) {
        Master jery = new Master("jery");
        Dog wangwang = new Dog("wangwang");
        Bone gutou = new Bone("骨头");
        jery.feed(wangwang,gutou);
        Cat cat1 = new Cat("夹子");
        Fish yellowfish = new Fish("黄鱼");
        jery.feed(cat1,yellowfish);

    }
}

class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    //多态组合喂食这个动作
    public void feed(Animal animal,Food food){
        System.out.println("主人" + name + "给" + animal.getName() + "吃" + food.getName());
    }

//    //喂小狗吃骨头
//    public void feed(Dog dog,Bone bone){
//        System.out.println("主人" + name + "给" + dog.getName() + "吃" + bone.getName());
//    }
//    //喂小猫吃鱼
//    public void feed(Cat cat,Fish fish){
//        System.out.println("主人" + name + "给" + cat.getName() + "吃" + fish.getName());
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Food{
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Fish extends Food{
    public Fish(String name) {
        super(name);
    }
}
class Bone extends Food{
    public Bone(String name) {
        super(name);
    }
}

class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
}
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
}
