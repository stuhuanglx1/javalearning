package chapter08.homework;

public class Homework07 {
    public static void main(String[] args) {
        new Demo07().test();
        /*
        Test
        Demo
        Rose
        jack
         */
        System.out.println("=============================");
        new Demo07("john").test();
        /*
        john
        jack
         */
    }
}
class Test07{
    String name = "Rose";
    Test07(){
        System.out.println("Test");
    }
    Test07(String name){
        this.name = name;
    }
}
class Demo07 extends Test07{
    String name = "jack";
    Demo07(){
        super();
        System.out.println("Demo");
    }
    Demo07(String s){
        super(s);
    }
    public void test(){
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
