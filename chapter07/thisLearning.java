package chapter07;

public class thisLearning {
    public static void main(String[] args){
        //this关键字：java虚拟机给每个对象分配this，代表当前对象
        //this可以解决变量命名问题
        Dog d1 = new Dog("小丑",7);
        //this关键字的细节
        /*
        1、this关键字可以用来访问本类的方法、属性、构造器
        2、区分当前类的属性和局部变量
        3、访问成员方法的语法： this.方法名(参数列表);
        4、访问构造器语法： this(参数列表) --只能在构造器中调用访问另一个构造器
        5、this不能在类定义外部使用
         */
        d1.f1();
        Dog d2 = new Dog();
        d2.printInfo();

        //this练习题
        Per p1 = new Per("jack",21);
        Per p2 = new Per("tom",11);
        Per p3 = new Per("tom",11);
        System.out.println("p1和p2的比较结果：" + p1.compareTo(p2));
        System.out.println("p2和p3的比较结果：" + p2.compareTo(p3));



    }
}

class Dog{
    String name;
    int age;

    public Dog(){
        this("huang",5);//!注意！对其他构造器的调用必须在构造器的第一句
        System.out.println("无参构造器");
        //尝试访问Dog(String name,int age)构造器

    }

    public Dog(String name,int age){
        this.name = name;
        this.age = age;
        //若没有this，格局属性的就近原则，那么name = name只影响构造器内的局部变量，而非属性
    }



    public void printInfo(){
        System.out.println("name为" + name + "，age为" + age);
    }
    public void f1(){
        //调用本类的printInfo()方法
        //方法1
        printInfo();
        //方法2
        this.printInfo();
    }
}

class Per{
    String name;
    int age;
    public Per(String name,int age){
        this.age = age;
        this.name = name;
    }

    public boolean compareTo(Per p){
        if (this.name.equals(p.name) && this.age == p.age){
            return true;
        }else {
            return false;
        }
    }

}
