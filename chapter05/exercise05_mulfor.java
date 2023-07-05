package chapter05;
import java.util.Scanner;

public class exercise05_mulfor {
    public static void main(String[] args){
        //多重循环
        for (int i = 0;i < 2;i++){
            for (int j = 0;j < 3;j++){
                System.out.println("i=" + i + " j=" +j);
            }
        }

        //多重循环 练习1
        System.out.println("多重循环--练习1===========================");
        Scanner myScanner = new Scanner(System.in);
        int classNum = 2;
        int stuNum = 3;
        double grade;
        double sum;
        double totalsum = 0;
        int passNum = 0;
        for (int i = 1;i <= classNum;i++){
            sum = 0;
            for (int j = 1;j <= stuNum;j++){
                System.out.println("请输入" + i +"班第" + j + "个学生的成绩");
                grade = myScanner.nextDouble();
                sum += grade;
                if (grade >= 60){
                    System.out.println("该生及格");
                }else {
                    System.out.println("该生不及格");
                }
            }
            System.out.println(i + "班的平均成绩为" + (sum / stuNum));
            totalsum += sum;
        }
        System.out.println("所有班级的平均成绩为" + (totalsum / (stuNum * classNum)));

        //多重循环 练习2 --九九乘法表
        System.out.println("多重循环--练习2===========================");
        for (int i = 1;i <= 9;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }

        //多重循环--打印金字塔
        /*
        1、先打印一个矩形
        2、再总结各行*的数量规律
        3、排成想要的形状，是在每行前加入一定的空格，所以总结各行的空格规律
        4、打印空心金字塔:第一层和最后一层不变，其他行的中间部分的*换成空格
         */
        System.out.println("多重循环--空心金字塔===========================");
        int shape = 5;//层数
        for (int i = 1;i <= shape;i++){
            for (int j = 1;j <= shape - i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j <= i * 2 - 1;j++){
                if (j == 1 || j == i * 2 -1 || i == shape){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /*
        1、化繁为简-->拆分需求，总结规律
        2、先死后活-->将特定值做成变量
         */

        System.out.println("多重循环--空心菱形===========================");
        int shape2 = 6;//层数
        for (int i = 1;i <= shape2;i++) {
            for (int j = 1; j <= shape2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1;i <= shape2 - 1;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (shape2 - i) * 2 - 1; j++) {
                if (j == 1 || j == (shape2 - i) * 2 - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
