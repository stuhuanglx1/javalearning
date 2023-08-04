package chapter10.final_;

public class Final01 {
    //final关键字
    /*
    final可以修饰类，属性，方法和局部变量
    使用情况：
    1）当不希望类被继承时，可以用final修饰
    2）当不希望父类的某个方法被子类覆盖或者重写时，可以使用关键词final修饰
    3）当不希望类的某个属性的值被修改时，可以使用关键词final修饰
    4）当不希望某个局部变量的值被修改时，可以使用关键词final修饰
    细节：
    1、final修饰的属性又叫常量，一般用XX_XX_XX来命名（大写）
    2、final修饰的属性在定义时必须赋初值，并且之后不能修改
    赋值可以在下述位置：
    ①定义时：如public final double TAX_RATE = 0.08;  ②构造器中  ③代码块中
    3、如果final修饰的属性是静态的，则初始化位置只能在①定义时②静态代码块中 ，切记不能在构造器中
    4、final不能继承，但可以实例化对象
    5、如果类不是final类，但含有final方法，该方法虽然不能重写，但可以被继承
    6、一般来说，一个类已经是final类了，方法就不必用final修饰
    7、final不能修饰构造方法
    8、final和static搭配使用，效率更高 -- 不会导致类加载  final和static顺序可以互换
    9、包装类（Integer\Double\Float\Boolean等都是final，String也是final类）都不能被继承
     */
}
