package chapter10.codeblock;

public class CodeBlock01 {
    //代码块--对代码块的补充机制
    /*
    代码块（初始化块），属于类中的成员，类似于方法，将逻辑语句封装在方法体中，通过{}包围起来
    和方法不同，没有方法名，没有返回，没有参数，只有方法体，而且不通过对象或类显示调用，而是加载类或创建对象时隐式调用

    基本语法[修饰符]{代码};
    注意：1、修饰符可选，要写的话也只能写static
    2、代码块分成两类：静态代码块和普通代码块
    3、逻辑语句可以是任何逻辑语句（输入、输出、方法调用、循环、判断等）
    4、末尾的;可以写上，也可省略
    好处：
    1、相当于另一种形式的构造器，可以做初始化操作
    2、场景：如果有多个构造器，可以抽取到初始化块中，提高代码复用性
    注意事项：
    1）static代码块也叫静态代码块，作用是对类进行初始化，而且随着类的加载而执行，并且只会执行一次
    2）类什么时候被加载：①创建对象实例（new） ②创建子类对象实例，父类也会被加载 ③使用类的静态成员
    3）普通的代码块，在创建对象实例时，会被隐式调用，被创建一次，就调用一次，如果只是使用类的静态成员则普通代码块不会执行
    *重点* 4）创建一个对象时，在一个类中的调用顺序：
    ①调用静态代码块和静态属性初始化（静态代码块和静态属性初始化的优先级一致，如果冲突，则按定义顺序调用）
    ②调用普通代码块和普通属性的初始化（普通代码块和普通属性初始化的优先级一致，如果冲突，则按定义顺序调用）
    ③调用构造方法
    5）构造方法的最前面其实隐含了super和调用普通代码块
    静态相关的代码块、属性初始化，在类加载时就执行完毕，因此是优先于构造器和普通代码块执行的
    6）继承关系的静态代码块、静态属性初始化、普通代码块、普通属性初始化，构造方法的调用顺序如下：
    ①父类的静态代码块和静态属性（优先级一样，按定义顺序执行）
    ②子类的静态代码块和静态属性（优先级一样，按定义顺序执行）
    ③父类的普通代码块和普通属性初始化（优先级一样，按定义顺序执行）
    ④父类构造方法
    ⑤子类的普通代码块和普通属性初始化（优先级一样，按定义顺序执行）
    ⑥子类的构造方法
    7）静态代码块只能直接调用静态成员，普通代码块可以调用任意成员
     */
    public static void main(String[] args) {
        Movie movie1 = new Movie("战狼");
        Movie movie2 = new Movie("唐人街探案",39.9);
        Movie movie3 = new Movie("你好，李焕英",49.9,"贾玲");
    }
}
class Movie{
    private String name;
    private double price;
    private String director;

    //三个构造器都有同样的语句，代码冗余 ==> 可以将相同的语句放入到代码块中
    //不管调用哪个构造器创建对象，都会调用代码块
    static {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始。。。");
        System.out.println("电影正式开始");
    }

    public Movie(String name) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始。。。");
//        System.out.println("电影正式开始");
        System.out.println("Movie(String name)被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始。。。");
//        System.out.println("电影正式开始");
        System.out.println("Movie(String name, double price)被调用");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始。。。");
//        System.out.println("电影正式开始");
        System.out.println("Movie(String name, double price, String director)被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
