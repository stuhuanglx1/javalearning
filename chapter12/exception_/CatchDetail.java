package chapter12.exception_;

/**
 * @author H lx
 * @vision 1.0
 */
public class CatchDetail {
    public static void main(String[] args) {
        try {
            String name = "12h4";
            int a = Integer.parseInt(name);
            System.out.println("数字" + a);
        } catch (NumberFormatException e) {
            System.out.println("异常" + e.getMessage());
        } finally {
            System.out.println("finally代码块被执行");
        }

        System.out.println("程序继续执行");
    }
}
