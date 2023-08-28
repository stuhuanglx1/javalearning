package chapter13.string_;

/**
 * @author H lx
 * @vision 1.0
 */
public class StringExercise02 {
    //字符串的特性
    public static void method01(){
        String s1 = "hello";
        s1 = "hihi";
        //这段代码共创建了2个字符串对象
    }
    public static void method02(){
        String s2 = "hello" + "abc";//==>String s2 = “helloabc”编译器会自动优化
        //该段代码创建了1个字符串对象
    }
    public static void method03(){
        String a = "hello";
        String b = "abc";
        String c = a + b;//不等同于String c = "hello" + "abc"
        //这段代码创建了3个对象
        /*
        执行步骤：
        1、StringBuilder sb = StringBuilder()
        2、sb.append("hello")
        3、sb.append("abc")
        4、String c = sb.toString
        a指向常量池的hello
        b指向常量池的abc
        c相当于在堆中new了一个对象，指向的是堆中地址，而value数组指向常量池
         */
        String d = "helloabc";
        System.out.println(d == c);//false,c指向的是堆中地址,d指向常量池中地址
        System.out.println(d.equals(c));//true
        System.out.println(d == c.intern());//true
        String e = a + "abc";
        System.out.println(c.equals(d));//true
        System.out.println(c.intern() == c.intern());//true
        System.out.println(c == e);//false
        System.out.println(c == e.intern());//false
    }
    public static void method04(){
        String s1 = "hhh";
        String s2 = "java";
        String s5 = "hhhjava";
        String s6 = (s1 + s2).intern();
        System.out.println(s5 == s6);//true
        System.out.println(s5.equals(s6));//true
    }
    public static void main(String[] args) {
        method04();
    }
}
