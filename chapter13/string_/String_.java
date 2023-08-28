package chapter13.string_;

/**
 * @author H lx
 * @vision 1.0
 */
public class String_ {
    /*
    字符串String
    【理解】
    1）String对象是用于保存字符串，也就是一组字符序列
    接口：Serializable（串行化-可以在网络上传输）, Comparable<String>（可以做比较）, CharSequence 父类Object
    2）字符串常量是用双引号括起的字符序列
    3）字符串的字符使用的是Unicode字符编码，一个字符占两个字节
    4）常用构造方法：
    String s1 = new String();
    String s2 = new String(String original);
    String s3 = new String(char[] a);
    String s4 = new String(char[] a,int startIndex,int count);
    String s5 = new String(byte[] b);
    总结为两种方式：
    ①直接赋值 String s = "h";
    先从常量池中查看是否有"h"的数据空间，如果有直接指向；如果没有则重新创建然后指向。s最终指向的是常量池的空间地址
    ②调用构造器 String s = new String("h");
    现在堆中创建空间，里面维护了value属性，指向常量池的h空间。如果常量池没有"h"，重新创建；如果有，通过value指向，最终指向的是堆中的空间地址
    5）String实现了接口：Serializable（串行化-可以在网络上传输）、Comparable<String>（可以做比较）、CharSequence，以及父类Object
    6）String是一个final类，不能被继承
    7）String类中是存储到value数组中（char数组）
    private final char value[];  --用于存放字符串内容，final使得value数组的地址不能被更改

    intern（）：intern方法：如果常量池中包含与该字符串内容相同(equals)的字符串，则返回来自池的字符串；否则，将此对象添加到池，并返回引用
    ！！！该方法返回的是常量池地址
    【字符串的特性】
    1、String是一个final类，代表不可变字符序列
    2、字符串不可变。一个字符串对象一旦被分配，其内容不可以改变
    常量相加，看的是池；变量相加，是在堆中
    【String的常用方法】
    String类保留字符串常量，每次更新都需要重新开辟空间，效率较低--》提供了StringBuilder和StringBuffer
    equals//区分大小写，判断内容是否相等
    equalsIngoreCase//忽略大小写，判断内容是否相等
    length//获取字符个数，字符串长度
    indexOf//获取字符在字符串第一次出现的索引，找不到返回-1
    lastIndexOf//获取字符在字符串最后一次出现的索引，找不到返回-1
    substring//截取规定范围的子串
    trim//去前后空格
    charAt//获取某索引处的字符，注意字符串的字符不能使用Str[index]这种方式获取
    toUpperCase\toLowerCase 改变大小写
    concat//拼接字符串
    replace//替换字符串中字符
    split//分割字符串 特殊字符需要转义字符，如\等
    compareTo//比较大小 ——先找最小长度，然后遇到不一样的字符就会直接比较，返回长度的差值，前者-后者，数字比较大小，字母比较ascⅡ码
    如果完全一样，返回0；如果遇上两个字符串前面都一样，就是长度不一样，此时则会返回前者字符串长度-后者字符串长度
    toCharArray//转换成字符数组
    format//格式字符串，%s字符串，%c字符，%d整型，%.2f浮点型（2是保留位数，并且会进行四舍五入的处理）  String类的静态方法
     */
}
