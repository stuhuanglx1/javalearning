package chapter13.wrapper_;

/**
 * @author H lx
 * @vision 1.0
 */
public class WrapperType {
    public static void main(String[] args) {
        //接口Serializable,接口Comparable,父类Object
//        boolean-->Boolean
        //接口Serializable,接口Comparable,父类Object
//        Character-->char
        //接口Comparable,父类Number
//        byte-->Byte

        //基本数据类型和包装类的相互转换
        //演示int<-->Integer,其他包装类的用法类似
        //手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱
        int i = integer.intValue();

        //jdk5（包括jdk5）以后，可以自动装箱、自动拆箱
        int n2 = 200;
        //自动装箱int->Integer
        Integer integer2 = n2;//底层使用的仍然是Integer.valueOf方法
        //自动拆箱Integer->int
        int n3 = integer2;//底层是integer2.intValue方法



    }
}
