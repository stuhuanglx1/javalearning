package chapter12.exception_;

/**
 * @author H lx
 * @vision 1.0
 */
public class ThrowException {
    static void methodA(){
        try {
            System.out.println("进入方法A");//①
            throw new RuntimeException("制造异常");//③
        } finally {
            System.out.println("用A方法的finally");//②
        }
    }
    static void methodB(){
        try {
            System.out.println("进入方法B");//④
            return;
        } finally {
            System.out.println("用B方法的finally");//⑤
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        methodB();
        /*
        输出：
        进入方法A
        用A方法的finally
        制造异常
        进入方法B
        用B方法的finally
         */
    }
}
