package chapter08.Object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println("-------------- ==的使用 -----------------");
        System.out.println(a == b);//true
        System.out.println(a == c);//true
        System.out.println(b == c);//true
        //引用类型，地址一致均为true
        B bobj = a;
        System.out.println("-------------- ==与equals -----------------");
        System.out.println(bobj == b);//true
        System.out.println(a.equals(b));//true

        System.out.println("-------------- String -----------------");
        "hello".equals("abc");
        String s1 = new String("134");
        String s2 = new String("134");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

        System.out.println("-------------- Integer -----------------");
        Integer i = 10;
        System.out.println(i.equals(100));//false
        Integer integer1 = new Integer(4);
        Integer integer2 = new Integer(4);
        System.out.println(integer1 == integer2);//false
        System.out.println(integer1.equals(integer2));//true
    }

}
class B{}
class A extends B{}

