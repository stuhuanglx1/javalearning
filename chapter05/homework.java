package chapter05;
import java.util.Scanner;

public class homework {
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);

        //homework01--根据规则计算人能经过几次路口
        System.out.println("作业1==========================");
        double money1 = 100000;
        int count1 = 0;
        while (true){
            if (money1 > 50000){
                money1 *= 0.95;
                count1++;
                System.out.println("剩余" + money1);
            }else if (money1 >= 1000){
                money1 -= 1000;
                count1++;
                System.out.println("剩余" + money1);
            }else {
                break;
            }
        }
        System.out.println("100000可以经过路口" + count1 + "次");


        //homework02
        System.out.println("作业2==========================");
        int num2 = -34;
        if (num2 < 0){
            System.out.println(num2 + "小于0");
        }else if (num2 > 0){
            System.out.println(num2 + "大于0");
        }else {
            System.out.println(num2 + "等于0");
        }

        //homework03
        System.out.println("作业3==========================");
        int year3 = 2100;
        if ((year3 % 4 == 0 && year3 % 100 != 0) || year3 % 400 == 0){
            System.out.println(year3 + "是闰年");
        }else {
            System.out.println(year3 + "不是闰年");
        }

        //homework04
        System.out.println("作业4==========================");
        int num4 = 153;
        int a1 = num4 % 10;//个位
        int a2 = (num4 % 100) / 10;//十位
        int a3 = num4 / 100;//百位
        System.out.println("个位"+a1+"、十位"+a2+"、百位"+a3);
        if (num4 == (Math.pow(a1,3) + Math.pow(a2,3) + Math.pow(a3,3))){
            System.out.println(num4 + "是水仙花数");
        }else {
            System.out.println(num4 + "不是水仙花数");
        }

        //homework05
        System.out.println("作业5==========================");
        int m = 0,n = 3;
        if (m > 0){
            if (n > 2){
                System.out.println("ok1");
            }else {
                System.out.println("ok2");
            }
        }//没有输出

        //homework06
        System.out.println("作业6==========================");
        int count6 = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 5 != 0){
                System.out.print(i + "\t");
                count6++;
                if (count6 % 5 == 0){
                    System.out.println();
                }
            }
        }

        //homework07
        System.out.println("作业7==========================");
//        char c1 = 97;
//        System.out.println(c1);
//        char c26 = 122;
//        System.out.println(c26);
//        char d1 = 65;
//        System.out.println(d1);
//        char d26 = 90;
//        System.out.println(d26);
        for (int i = 97;i <= 122;i++){
            char a_z = (char)i;
            char A_Z = (char)(i - 32);
            System.out.println("小写：" + a_z + " 大写：" + A_Z);
        }
        //方法二：考察编码和字符串
        System.out.println("练习6方法2");
        for (char i = 'a';i <= 'z';i++){
            System.out.print(i + "\t");
        }
        System.out.println();
        for (char i = 'Z';i >= 'A';i--){
            System.out.print(i + "\t");
        }
        System.out.println();

        //homework08
        System.out.println("作业8==========================");
        double sum8 = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 2 != 0){
                sum8 += 1.0/i;  //注意i为整数，Java中整数除法会得到整数
            }else {
                sum8 -= 1.0/i;
            }
        }
        System.out.println("总和为" + sum8);

        //homework09
        System.out.println("作业9==========================");
        int sum9_1 = 0;
        int sum9_2 = 0;
        for (int i = 1;i <= 100;i++){
            sum9_1 += i;
            sum9_2 += sum9_1;
        }
        System.out.println("最后一项结果是" + sum9_1 + " 合计为" + sum9_2);
        //方法二：多层嵌套
        int sum9_3 = 0;
        System.out.println("方法二--多层嵌套");
        for (int i = 1;i <= 100;i++){
            for (int j = 0;j <= i;j++){
                sum9_3 += j;
            }
        }
        System.out.println("合计" + sum9_3);

    }
}
