package chapter13.string_;

/**
 * @author H lx
 * @vision 1.0
 * String的常用构造方法
 */
public class String01 {
    public static void main(String[] args) {
        String name = "jack";
        name = "tom";

        //String类中value字符数组用于存放字符串内容
        final char[] value = {'a','b','c'};
        value[0] = 'r';//final数组的内容可以变，地址不能变
        char[] v2 = {'d','f'};
//        value = v2;//更改地址，则会报错


//        String s1 = new String();
//        String s2 = new String(String original);
//        String s3 = new String(char[] a);
//        String s4 = new String(char[] a,int startIndex,int count);
//        String s5 = new String(byte[] b);
        String s = new String("");
        for (int i = 0; i < 800; i++) {
            s += "hello";
        }
        //每次会创建对象然后重新指向，拼接效率较低
    }
}
