package chapter13.stringBuffer_;

/**
 * @author H lx
 * @vision 1.0
 */
public class StringBuffer_ {
    /*
    StringBUffer：
    1、java.lang.StringBUffer代表可变的字符序列，可以对字符串内容进行增删
    2、很多方法与String类相同，但StringBufer是可变长度
    3、StringBuffer是一个容器，且是final类，不可继承
    4、父类、接口：直接父类是AbstractStringBuilder（接口Appendable, CharSequence），接口Serializable、CharSequence
    父类AbistractStringBuilder的char[] value用于存放字符，不是final类型，存放在堆中，不再是常量池
    5、StringBuffer的字符序列是存在父类的char[] value中的，所以变化（增加、删除）时不需要每次都更换地址（即创建新对象）
    【String VS StringBuffer】
    1）String保存的是字符串常量，里面的值不可更改，每次String更新就是更改地址，效率低；
    2）StringBuffer保存的是字符串变量，其值可以更改，每次StringBuffer更新是更新值，不用每次更新地址（超过容量了会更新地址），效率高
    【String 和 StringBuffer 相互转换】
    String -> StringBUffer
        String str = "hello world!";
        //方式1--构造器（String str）
        StringBuffer stringBuffer = new StringBuffer(str);
        这种方式返回的是StringBuffer，但str仍然是String类型
        //方式2--append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);
    StringBuffer -> String
        StringBuffer stringBuffer2 = new StringBuffer("java learning");
        //方式1--toString方法
        String s = stringBuffer2.toString();
        //方式2--构造器（StringBuffer strb）
        String s1 = new String(stringBuffer2);
    【StringBuffer的常用方法】
    增append、删delete(start,end)、改repalce(start,end,string)、查indexOf
    插insert   获取长度length
     */
}
