package chapter13.wrapper_;

/**
 * @author H lx
 * @vision 1.0
 */
public class Wrapper_ {
    /*
    //包装类：
    针对八种基本定义相应的应用类型
    有类的特点，可以调用类中方法
    boolean -> Boolean 独立  接口Serializable,接口Comparable,父类Object
    char -> Character  独立  接口Serializable,接口Comparable,父类Object
    byte -> Byte  父类是Number  接口Comparable,父类Number,Number实现了接口Serializable
    short -> Short  父类是Number  接口Comparable,父类Number,Number实现了接口Serializable
    int -> Integer  父类是Number  接口Comparable,父类Number,Number实现了接口Serializable
    long -> Long  父类是Number  接口Comparable,父类Number,Number实现了接口Serializable
    float -> Float  父类是Number  接口Comparable,父类Number,Number实现了接口Serializable
    double -> Double  父类是Number  接口Comparable,父类Number,Number实现了接口Serializable
    【包装类和基本数据类型的相互转换】
    1、jdk5前的手动装箱和拆箱：装箱--基本类型->包装类型；拆箱--包装类型->基本类型
    2、jdk5后自动装箱和拆箱方式
    3、自动装箱底层调用的是valueOf方法，比如Integer.valueOf()、intValue()方法
    【包装类和String类型的相互转换】
    包装类-->String:①+"" ②toString() ③String.valueOf()
    String-->包装类:①Integer.parseInt() ②Integer i = new Integer(str);构造器
    【包装类的常用方法】仅一部分
    MAX_VALUE、MIN_VALUE  返回最大值、返回最小值
    Character.isDigit('a')  判断是不是数字
    Character.isLetter('a')  判断是不是字母
    Character.isUpperCase('a')  判断是不是大写
    Character.isLowerCase('a')  判断是不是小写
    Character.isWhitespace('a')  判断是不是空格
    Character.toUpperCase('a')  转成大写
    Character.toLowerCase('A')  转成小写

    Integer.valueOf(int i)解读：
    This method will always cache values in the range -128 to 127
    底层源码显示在-128~127范围内是选取cache数组中的值直接返回，范围外则是new一个
    即Integer在类加载时就已经创建了-128 to 127范围256个整数
    注意：只要有基本数据类型，==判断的是值是否相等
     */
}
