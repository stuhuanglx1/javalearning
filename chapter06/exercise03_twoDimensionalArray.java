package chapter06;

import java.util.Scanner;

public class exercise03_twoDimensionalArray {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //二维数组的简易使用
        /*
        声明方式：int[][] y (推荐！)或 int[] y[] 或 int y[][]
         */
        int[][] arr01 = {
                {0,0,0,0,0,0},
                {0,0,1,0,0,0},
                {0,2,0,3,0,0},
                {0,0,0,0,0,0}
        };
        for (int i = 0;i < arr01.length;i++){
            for (int j = 0;j < arr01[0].length;j++){
                System.out.print(arr01[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(arr01);//指向存放一维数组的地址空间
        System.out.println(arr01[0]);//指向一维数组的值空间
        /*
        二维数组的重要概念：
        ①二维数组可以看成，原来的一维数组的每个元素都是一维数组
        ②arr[i][j]是第i+1行j+1个元素值
        ③！！列数可以不相等！！
         */

//        //使用方式1：动态初始化
//        int[][] arr01 = new int[2][4];
//        //使用方式2：动态初始化（先声明，后开辟空间）
//        int[][] arr02;
//        arr02 = new int[2][4];
//        //使用方式3：动态初始化--列数不确定
//        int[][] arr03 = new int[2][];//二维数组已经分配地址空间，但一维数组的空间还未分配
//        for (int i = 0;i < arr03.length;i++){
//            arr03[i] = new int[i + 1];//给一维数组开空间  如果没有new，则arr03[i]为null
//            //之后再使用for循环对每个一维数组的元素赋值
//            for (int j = 0;j < arr03[i].length;j++){
//                arr03[i][j] = i + 1;
//            }
//        }
//        //使用方式4：静态初始化
//        int[][] arr04 = {{2,3},{5,2},{100}};//列数可以不一样长

        //二维数组--练习1
        System.out.println("练习1====================");
        int[][] arr05 = {{4,6},{1,4,5,7},{-2}};
        int sum5 = 0;
        for (int i = 0;i < arr05.length;i++){
            for (int j = 0;j < arr05[i].length;j++){
                sum5 += arr05[i][j];
            }
        }
        System.out.println("sum=" + sum5);

        //二维数组--练习2 ==>杨辉三角
        System.out.println("杨辉三角====================");
        int n = 10;//行数
        int[][] arr06 = new int[n][];
        for (int i = 0;i < arr06.length;i++){
            arr06[i] = new int[i + 1];
            for (int j = 0;j < arr06[i].length;j++){
                if (j == 0 || j == arr06[i].length - 1){
                    arr06[i][j] = 1;
                }else {
                    arr06[i][j] = arr06[i-1][j] + arr06[i-1][j-1];
                }
            }
        }
        for (int i = 0;i < arr06.length;i++){
            for (int j = 0;j < arr06[i].length;j++){
                System.out.print(arr06[i][j] + "\t");
            }
            System.out.println();
        }

        //二维数组--练习3
        /*
        声明：int[] x,y[]  ==>x是一维数组，y是二维数组
        a)x[0] = y  不能通过编译，值!=二维数组
        b)y[0] = x  可以通过编译
        c)y[0][0] = x  不能通过编译，值！=一维数组
        d)x[0][0] = y  不能通过编译，x是一维数组
        e)y[0][0] = x[0]  可以通过编译
        f)x = y  不能通过编译，一维数组！=二维数组
        允许通过编译的是：b、e
         */

    }
}
