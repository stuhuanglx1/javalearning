package chapter08.debug_;

import java.util.Arrays;

public class Debug01 {
    public static void main(String[] args) {
//        //案例一：debug逐行执行代码
//        int sum = 0;
//        for (int i = 0; i < 4; i++) {
//            sum += i;
//            System.out.println("i=" + i);
//            System.out.println("sum=" + sum);
//        }
//        System.out.println("end...");

//        //案例二：数组越界异常
//        int[] arr02 = {10,39,2};
//        for (int i = 0; i <= arr02.length; i++) {
//            System.out.println("arr02[" + i + "] = " + arr02[i]);
//        }
//        System.out.println("退出循环");

        //案例三：数组排序
        int[] arr03 = {10,39,2,78,0};
        Arrays.sort(arr03);
        for (int i = 0; i < arr03.length; i++) {
            System.out.print("arr03[" + i + "] = " + arr03[i] + "\n");
        }
        System.out.println("退出循环");
        //可以在debug过程中，动态增加断点
    }
}
