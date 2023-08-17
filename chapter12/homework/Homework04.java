package chapter12.homework;

/**
 * @author H lx
 * @vision 1.0
 * 程序阅读题
 */
public class Homework04 {
    public static void main(String[] args) {
        try {
            showExce();
            System.out.println("A");
        }catch (Exception e){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
        //输出BCD
    }
    public static void showExce() throws Exception{
        throw new Exception();
    }
}
