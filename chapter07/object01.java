package chapter07;

public class object01 {
    public static void main(String[] args){
        //两只猫：小花，100岁，花色；小白，三岁，白色

        //单独变量 --> 不利于数据管理
        //第一只猫
        String name1 = "小花";
        int age1 = 100;
        String color1 = "花色";
        //第二只猫
        String name2 = "小白";
        int age2 = 3;
        String color2 = "白色";

        //数组==>(1)数据类型体现不出来(2)只能通过下标获取信息，造成名字和内容的对应关系不明确(3)不能体现具体行为
        String[] cat1 = {"小花","100","花色"};
        String[] cat2 = {"小白","3","白色"};

        //上述方法缺点：不利于数据管理，效率低

        //对象是类的实例化
        Cat cat01 = new Cat();
        cat01.name = "小花";
        cat01.age = 100;
        cat01.color = "花色";

        Cat cat02 = new Cat();
        cat02.name = "小白";
        cat02.age = 3;
        cat02.color = "白色";

        System.out.println("第一只猫的信息  "+"名字："+cat01.name+" 年龄："+cat01.age+" 颜色："+cat01.color);

        //如何创建对象？
        //方法①--先声明再创建
        Cat cat;
        cat = new Cat();//分配空间
        //方法②--直接创建
        Cat catt = new Cat();

        //如何访问属性？
        //对象名.属性名

        //类和对象的内存分配机制 + 属性细节--默认值
        Person2 p1 = new Person2();
        System.out.println("当前人的信息========");
        System.out.println("名字："+p1.name+" 年龄："+p1.age+" 是否通过："+p1.isPass+" 薪水："+p1.salary);
        p1.age = 10;
        p1.name = "小黄";
        Person2 p2 = p1;//p2和p1的指向地址一样// ，相当于给对象p1再起l一个名字p2
        System.out.println("第一个人的信息  名字："+p1.name+" 年龄："+p1.age+" 是否通过："+
                p1.isPass+" 薪水："+p1.salary);
        System.out.println("第二个人的信息  名字："+p2.name+" 年龄："+p2.age+" 是否通过："+
                p2.isPass+" 薪水："+p2.salary);
        /*
        代码执行流程
        Person p1 = new Person();
        ①加载Person类信息：属性信息+方法信息
        ②在堆中开辟空间存储相关信息 （0和null），默认初始化
        ③将上述空间地址存储在栈中，赋给p1
        ④进行指定初始化

        内存分配机制：
        1、栈：一般存放基本数据类型（局部变量）
        2、堆：存放对象（类、数组）
        3、方法区：常量池（常量，比如字符串），类加载信息
         */

        Person2 a = new Person2();
        a.age = 10;
        a.name = "小明";
        Person2 b;
        b = a;
        System.out.println(b.name);//小明
        b.age = 200;
        b = null;
        System.out.println(a.age);//200
        System.out.println(b.age);//null(空指针异常)

    }
}


//定义一个猫类Cat -> 自定义的数据类型
class Cat{
    //属性 == 成员变量 == field（字段）
    String name;
    int age;
    String color;
    //行为

}

class Car{
    String name;
    double price;
    String color;
    String[] master;//属性可以是基本数据类型，也可以是引用类型（对象，数组）
    /*
    属性细节；
    1、属性的定义：访问修饰符 数据类型 属性名;   访问修饰符控制属性访问范围（public、protected、默认、private）
    2、属性可以是基本数据类型，也可以是引用类型（对象，数组）
    3、属性若是不赋值，是有默认值，规则和数组一样
     */
}

class Person2{
    String name;
    int age;
    double salary;
    boolean isPass;
}
