package chapter10.static_;

public class ChildGame {
    public static void main(String[] args) {
//        int count = 0;//统计有多少小孩加入游戏
        /*
        count变量十分独立，不同于类和对象 ==> 类变量（静态变量） 所有对象共享的变量
        静态变量内存分析：
        ①静态变量被同一个类的所有对象共享
        ②不论在堆中还是在方法区（看jdk版本）中都不影响静态使用
        ③静态变量在类加载时就生成
        类变量是该类的所有对象共享的变量，任何一个该类的对象区访问他时，都能取得相同的值，
        同理何一个该类的对象区修改他时，修改的同一个变量。
        定义语法：
        访问修饰符 static 数据类型 变量名;【推荐】
        static 访问修饰符 数据类型 变量名;
        如何访问：方法①类名.类变量名【推荐】  方法②对象名.类变量名
         */
        //快速入门--不规范
        Child child1 = new Child("白骨精");
        child1.join();
        child1.count++;
        Child child2 = new Child("金角大王");
        child2.join();
        child2.count++;
        Child child3 = new Child("蜘蛛精");
        child3.join();
        child3.count++;
        Child child4 = new Child("牛魔王");
        child4.join();
        child4.count++;
        System.out.println("游戏结束时共有" + Child.count + "个人加入游戏");
    }
}
class Child{
    private String name;

    //定义一个类变量(静态变量)
    //该变量最大的特点就是会被child类的所有对象实例共享
    public static int count = 0;

    public Child(String name){
        this.name = name;
    }
    public void join(){
        System.out.println(name + "加入了游戏。。");
    }
}
