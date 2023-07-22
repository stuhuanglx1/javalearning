package chapter08.override_;

public class Override01 {
    //方法重写（覆盖）：子类有一个方法和父类某个方法的名称、返回类型、参数一样，那么就说子类方法覆盖了父类的方法
    /*
    注意事项：
    1、子类方法参数、方法名要好父类参数和方法名需要一致
    2、子类方法的返回类型要和父类方法返回类型一样，或者是父类返回类型的子类
    public object f1(){} 和  public String f1(){}符合条件
    3、子类方法不能缩小父类的访问权限
     */
    public static void main(String[] args) {
        //实例演示
        Dog dog = new Dog();
        dog.cry();
    }
}
class Animal{
    public void cry(){
        System.out.println("Animal类的cry（）方法");
    }
    public Object f1(){
        return " ";
    }
    void eat(){}
}
class Dog extends Animal{
    //Dog的cry方法重写了父类Animal中的cry方法
    public void cry(){
        System.out.println("Dog类的cry（）方法");
    }
    public String f1(){
        return " ";
    }
    public void eat(){}
}
