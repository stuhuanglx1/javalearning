package chapter05;
import java.util.Scanner;

public class exercise04_while {
    public static void main(String[] args){
        //案例1--简单使用while--先判断后执行
        int i1 = 1;
        while (i1 <= 10){
            System.out.println("第" + i1 + "次");
            i1++;
        }
        System.out.println("退出while");

        //while使用细节
        /*
        1、循环条件是一个返回布尔值的表达式
        2、while是先判断再执行语句
         */

        //练习1
        System.out.println("练习题1=========================");
        int i2 = 1;
        while (i2 <= 100){
            if (i2 % 3 == 0){
                System.out.println(i2);
            }
            i2++;
        }

        //练习2
        System.out.println("练习题2=========================");
        int start = 40;
        int end = 200;
        int count = 0;
        int i3 = start;
        while (i3 <= end){
            if (i3 % 2 == 0){
                System.out.println(i3);
                count++;
            }
            i3++;
        }
        System.out.println("count= " + count);

        //do-while语句--先执行后判断
        //简易的do-while循环
        int i4 = 1;
        do {
            System.out.println("你好" + i4);
            i4++;
        }while (i4 <= 10);
        System.out.println("do-while循环退出");//此时i4=11

        //练习3-do-while
        System.out.println("do-while 练习题1=========================");
        int j3 = 1;
        do {
            System.out.println(j3);
            j3++;
        }while (j3 <= 100);

        //练习4-do-while
        System.out.println("do-while 练习题2=========================");
        int j4 = 1;
        int sum = 0;
        do {
            sum += j4;
            j4++;
        }while (j4 <= 100);
        System.out.println("总和为" + sum);

        //练习5-do-while
        System.out.println("do-while 练习题3=========================");
        int j5 = 1;
        int count5 = 0;
        do {
            if (j5 % 5 == 0 && j5 % 3 != 0){
                System.out.println("j5=" + j5);
                count5++;
            }
            j5++;
        }while (j5 <= 200);
        System.out.println("count为" + j5);

        //练习6-do-while
        System.out.println("do-while 练习题4=========================");
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("我问：\"还钱吗？（y/n）\"");
            answer = myScanner.next().charAt(0);
            System.out.println("李三的回答是：" + answer);
        }while (answer != 'y');
        System.out.println("李三还钱了");





    }
}
