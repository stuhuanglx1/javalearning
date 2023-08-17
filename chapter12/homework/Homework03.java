package chapter12.homework;

/**
 * @author H lx
 * @vision 1.0
 * 程序阅读题
 */
public class Homework03 {
    public static void func(){
        try {
            throw new RuntimeException();
        }finally {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        try {
            func();
            System.out.println("A");
        }catch (Exception e){
            System.out.println("C");
        }
        System.out.println("D");
    }
    /*
    输出结果： BCD
     */
}
