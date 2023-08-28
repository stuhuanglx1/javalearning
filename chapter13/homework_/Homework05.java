package chapter13.homework_;

/**
 * @author H lx
 * @vision 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        String s1 = "hhh";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);//false
        System.out.println(a.equals(b));//false
        System.out.println(a.name == b.name);//true

        String s4 = new String("hhh");
        String s5 = "hhh";
        System.out.println(s1 == s4);//false
        System.out.println(s4 ==s5);//false

        String t1 = "hello" + s1;
        String t2 = "hellohhh";
        System.out.println(t1.intern() == t2);//true
    }
}
class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
