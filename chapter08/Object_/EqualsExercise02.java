package chapter08.Object_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        //练习2
        System.out.println("==========练习2=============");
        Person2 p1 = new Person2();
        p1.name = "hlx";

        Person2 p2 = new Person2();
        p2.name = "hlx";

        System.out.println(p1 == p2);//false
        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.equals(p2));//false  来自父类Object，默认是地址  不是同一个对象

        String s1 = new String("sfc");
        String s2 = new String("sfc");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1 == s2);//false

        //练习3
        System.out.println("==========练习3=============");
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和65.0f是否相等？" + (it == fl));//true
        char ch1 = 'A';
        char ch2 = 12;
        System.out.println("65和'A'是否相等?" + (it == ch1));//true
        System.out.println("12和ch2是否相等?" + (12 == ch2));//true

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1和str2是否相等？" + (str1 == str2));//false
        System.out.println("str1和str2是否(equals)相等？" + (str1.equals(str2)));//true
//        System.out.println("hello" == new java.sql.Date());//编译器报错 不是同一类型，无法比较

    }
}
class Person2{
    public String name;
}
