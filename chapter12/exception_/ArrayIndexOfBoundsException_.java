package chapter12.exception_;

/**
 * @author H lx
 * @vision 1.0
 */
public class ArrayIndexOfBoundsException_ {
    public static void main(String[] args) {
        int[] arr = {1,6,8};
        for (int i = 0; i <= arr.length; i++) {
            //当i=3是会抛异常
            //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
            System.out.println(arr[i]);
        }
    }
}
