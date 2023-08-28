package chapter13.string_;

/**
 * @author H lx
 * @vision 1.0
 */
public class StringExercise01 {
    public static void method1(){
        String a = "abc";
        String b = "abc";
        System.out.println(a.equals(b));//true  String中的equals比较的是value值
        System.out.println(a == b);//true
    }
    public static void method2(){
        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a.equals(b));//true
        System.out.println(a == b);//false
    }

    public static void method3(){
        String a = "hhh";
        String b = new String("hhh");
        System.out.println(a.equals(b));//true
        System.out.println(a == b);//false

        //intern方法：如果常量池中包含与该字符串内容相同(equals)的字符串，则返回来自池的字符串；否则，将此对象添加到池，并返回引用
        //返回的是常量池地址
        System.out.println(a == b.intern());//true
        System.out.println(b == b.intern());//false
        //b返回的是堆的地址   b.intern()返回的是常量池地址
    }

    public static void method4(){
        String s1 = "hhh";
        String s2 = "java";
        String s4 = "java";
        String s3 = new String("java");
        System.out.println(s2 == s3);//false
        System.out.println(s2 == s4);//true
        System.out.println(s2.equals(s3));//true
        System.out.println(s1 == s2);//false
    }

    public static void method5(){
        Person p1 = new Person();
        p1.name = "hhh";
        Person p2 = new Person();
        p2.name = "hhh";

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//true
        System.out.println(p1.name == "hhh");//true

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);//false
    }
    public static void main(String[] args) {
        System.out.println("练习1");
        method1();
        System.out.println("练习2");
        method2();
        System.out.println("练习3");
        method3();
        System.out.println("练习4");
        method4();
        System.out.println("练习5");
        method5();
    }
}
class Person{
    String name;
}