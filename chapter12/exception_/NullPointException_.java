package chapter12.exception_;

/**
 * @author H lx
 * @vision 1.0
 */
public class NullPointException_ {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());//报异常
        //Exception in thread "main" java.lang.NullPointerException
    }
}
