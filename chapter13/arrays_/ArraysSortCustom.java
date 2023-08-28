package chapter13.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author H lx
 * @vision 1.0
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1,-1,8,0,20};
        //冒泡排序1
        bubble01(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {1,-3,8,0,20};
        //定制冒泡排序
        bubble02(arr1, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;//i2-i1是降序，i1-i2是升序
            }
        });
        System.out.println(Arrays.toString(arr1));
    }
    //使用冒泡排序--从小到大
    public static void bubble01(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //结合冒泡 + 定制
    public static void bubble02(int[] arr, Comparator c){
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //数组的排序，由compare方法的返回值决定
                if (c.compare(arr[j],arr[j + 1]) > 0){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
