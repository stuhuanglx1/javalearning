package chapter13.wrapper_;

/**
 * @author H lx
 * @vision 1.0
 * 包装类和String类型的相互转换
 */
public class Wrapper_String {
    public static void main(String[] args) {
        //包装类-->String(Integer为例)
        Integer i1 = 100;//自动装箱
        //方式1
        String str = i1 + "";//此时i1仍然是Integer类型
        //方式2
        String str2 = i1.toString();
        //方式3
        String str3 = String.valueOf(i1);

        //String-->包装类
        String str4 = "12345";
        //方式1
        Integer i2 = Integer.parseInt(str4);//也使用到自动装箱
        //方式2
        Integer i3 = new Integer(str4);//Integer中有传字符串的构造器


    }
}
