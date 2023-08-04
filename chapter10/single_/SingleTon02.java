package chapter10.single_;

public class SingleTon02 {
    //懒汉式
    public static void main(String[] args) {

        System.out.println("num = " + Cat.num);
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Cat instance2 = Cat.getInstance();
        System.out.println(instance);
        System.out.println(instance == instance2);
        //只有在使用静态方法时才调用构造器，且只执行一次
    }
}
class Cat{
    private String name;
    public static int num = 0;
    //定义一个静态属性对象
    private static Cat cat;

    //构造器私有化
    private Cat(String name){
        System.out.println("构造器被加载");
        this.name = name;
    }

    //提供一个public的static方法，可以返回一个对象
    public static Cat getInstance(){
        if (cat == null){
            cat = new Cat("小可");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
