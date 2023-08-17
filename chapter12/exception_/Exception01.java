package chapter12.exception_;

/**
 * @author H lx
 * @vision 1.0
 * 异常处理机制的快速入门
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
//        int res = num1/num2;//此处会抛出异常ArithmeticException,下面代码不再执行
//        System.out.println(res);
        //不应该出现一个不算致命的问题，程序就奔溃--异常处理

        //异常处理机制--如果认为一段代码可能存在问题，可以用try-catch异常处理机制来解决
        try {
            int res = num1/num2;
        } catch (Exception e) {
            System.out.println("出现异常的原因：" + e.getMessage());
//            e.printStackTrace();
        }
        System.out.println("程序继续执行");
    }
}
