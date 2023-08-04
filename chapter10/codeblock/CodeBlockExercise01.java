package chapter10.codeblock;

public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("total = " + Person.total);
        System.out.println("total = " + Person.total);
        /*
        in static block
        total = 100
        total = 100
         */
        //static代码块仅调用一次
    }
}
class Person{
    public static int total;
    static {
        total = 100;
        System.out.println("in static block");
    }
}
