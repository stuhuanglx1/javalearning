package chapter10.single_;

public class Single01 {
    //单例设计模式
    /*
    1、静态方法和属性的经典使用
    2、设计模式（23种）是在大量的实践中总结和理论化之后优选绑定代码结构、编程风格以及解决问题的思考方式。

    单例模式：采用一定方法保证在整个软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法
    方式：①饿汉式、②懒汉式
    1）构造器私有化==>防止new
    2）类的内部创建对象
    3）向外暴露一个静态的公共方法
    4）代码实现
    饿汉式可能会导致创建了对象但没有使用，会有内存的浪费
    饿汉式 vs 懒汉式
    1、二者最主要区别在于创建对象的时机不同：饿汉式在类加载后就创建了对象实例，懒汉式是在使用时创建
    2、饿汉式不存在线程安全问题，而懒汉式存在线程安全问题
    3、饿汉式存在浪费资源的可能（若没有使用一个对象实例，创建的对象就浪费了），懒汉式不存在该问题
    4、在javaSE标准类中，java.lang.Runtime就是经典的单例模式
     */
    public static void main(String[] args) {
//        Runtime
    }
}
