package chapter12.exception_;

/**
 * @author H lx
 * @vision 1.0
 */
public class CatchDetail03 {
    public static void main(String[] args) {

        try {
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1/n2);
        } finally {
            System.out.println("执行了finally");//打印
        }
        System.out.println("程序继续执行");//不会被打印
    }
}
