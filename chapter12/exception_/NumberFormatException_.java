package chapter12.exception_;

/**
 * @author H lx
 * @vision 1.0
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String str = "j111";
        int num = Integer.parseInt(str);//抛异常
        //Exception in thread "main" java.lang.NumberFormatException
    }
}
