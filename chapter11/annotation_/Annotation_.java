package chapter11.annotation_;

/**
 * @author H lx
 * @vision 1.0
 */
public class Annotation_ {
    //注解
    /*
    1、注解annotation也被成为元数据metadata，用于修饰解释包、类、方法、属性、构造器、局部变量等数据信息
    2、和注释一样，注解不影响程序逻辑，但注解可以被编译或运行，相当于嵌在代码中的补充信息
    3、javaSE中注解的使用目的比较简单，例如：标记过时的功能、忽略警告等；
    但在javaEE中注解占据重要地位，例如：配置应用程序的任何切面，代替JavaEE旧版遗留的冗余代码和xml配置等
    *使用：使用注解时需要在前面加@符号，并把注解当成一个修饰符使用，用于修饰他支持的程序元素
    【三个基本注解】
    1)@Override:限定某个方法，重写父类方法，该注解只能使用于方法
    如果没有 @Override修饰，也可以表示重写父类方法
    如果写了 @Override注解，编译器就会去检查该方法是否真的重写了父类方法，此时的确重写了，则编译通过，如果没有构成重写，则编译错误
    --编译进行语法校验
        @interface不是接口，是注解类，jdk5.0后加入
        @Target是修饰注解的注解称为元注解
    2)@Deprecated:用于某个程序元素（类、方法等）已过时，但过时不代表不能使用
    不推荐使用，但仍然可以使用
    可以修饰方法、类、字段、包、构造器、参数
    @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
    -- 作用：用于版本升级的过渡
    3)@SuppressWarning:抑制编译器警告
    语法：@SuppressWarnings({""})
    SupressWarning中的属性介绍以及属性说明详见javaLearning文档
    作用范围与放置位置相关
    可以修饰构造器，字段，方法，参数，局部变量，类
    @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
    源码中String[] value();表明可以输入多字段
    【元注解（了解）】
    看源码时能知道该行代码什么意思即可
    种类：
    1、Retention//指定注解的范围作用
    RetentionPolicy类型成员变量：三种SOURCE（编译器使用后直接丢弃）\CLASS（把注解记录在class文件中，运行时不会保留注解，默认）\RUNTIME（把注解记录在class文件中，运行时会保留注解，反射获取该注解）
    2、Target//指定该注解能在哪些地方使用
    3、Documented//指定该注解是否会在javadoc体现
    4、Inherited//子类会继承父类注解
     */
}
