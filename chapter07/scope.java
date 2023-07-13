package chapter07;

public class scope {
    public static void main(String[] args){
        //变量作用域 -- ！！重要！！
        /*
        1)java中的主要变量：属性（成员变量）和局部变量
        2)局部变量一般指的是在成员方法中定义的变量
        3)全局变量作用域为整个类体；局部变量作用域为对应的代码块
        4)全局变量可以不赋值，直接使用，有默认值；局部变量一定要赋值，没有默认值
         */
        //使用细节
        /*
        1\属性和局部变量可以重名，访问时遵循就近原则  且在成员方法内可以重新定义和属性重名的局部变量
        2\在同一个作用域中，即在同一个成员方法中，两个局部变量不能重名
        3\属性生命周期长，对象创建时就产生，对象关闭才消失；而局部变量随代码块的创建而产生，即仅存在于一次方法调用过程
        4\作用域范围不同：全局变量（属性）-->可以被本类使用，也可以被其他类调用  局部变量-->只能在本类的对应方法中使用
        5\修饰符不同：全局变量 可以加修饰符；局部变量 不可以加修饰符
         */
        Cat1 c = new Cat1();
        c.sleep();

    }
}

class Cat1{
    int age = 10;//全局变量,作用域为整个Cat1类
    double weight;

    public void cry(){
        int n = 10;//局部变量
        String name = "Tom";//局部变量
        //n和name均是cry()方法的局部变量，作用域在cry()方法中
        System.out.println("在cry中使用age  "+age);
    }
    public void eat(){
        System.out.println("在eat中使用age  "+age);
//        System.out.println("在eat中使用n  "+n);//有编译错误
    }
    public void sleep(){
//        double time;
//        System.out.println("睡觉时间为" + time);//报错，time没有初始化
        age = 34;
        System.out.println("sleep中的age输出为" + age);
    }

}
