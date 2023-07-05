package chapter05;
import java.util.Scanner;
public class exercise01_If {
    public static void main(String[] args){

        //案例01--单分支
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age1 = myScanner.nextInt();
        if (age1 > 18){
            System.out.println("难度年龄大于18岁，要对自己的行为负责");
        }
        System.out.println("程序继续");

        //案例02--双分支
        System.out.println("==================================");
        System.out.println("请输入年龄：");
        int age2 = myScanner.nextInt();
        if (age2 > 18){
            System.out.println("难度年龄大于18岁，要对自己的行为负责");
        }else {
            System.out.println("你的年龄不大，这次放过你了");
        }
        System.out.println("程序继续");

        //练习题
        System.out.println("练习题1========================");
        int x = 7;
        int y = 4;
        if (x > 5){
            if (y > 5){
                System.out.println(x + y);
            }
            System.out.println("程序继续");
        }else {
            System.out.println("x = " + x);
        }//输出”程序继续“

        System.out.println("练习题2====================");
        double d1 = 17.5;
        double d2 = 13;
        if (d1 > 10.0 && d2 < 20.0){
            System.out.println("两数之和" + (d1 + d2));
        }

        System.out.println("练习题3===============");
        int n1 = 7;
        int n2 = 8;
        int sum = n1 + n2;
        if (sum % 3 == 0 && sum % 5 == 0){
            System.out.println(n1 + "与" + n2 + "的和能被3整除也能被5整除");
        }else {
            System.out.println(n1 + "与" + n2 + "的和不能同时被3和5整除");
        }

        System.out.println("练习题4===============");
        System.out.println("输入年份");
        int year = myScanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + "是闰年");
        }else {
            System.out.println(year + "不是闰年");
        }

        //案例03--多分支1
        System.out.println("==================================");
        System.out.println("请输入同志的芝麻信用分（0~100）：");
        int score = myScanner.nextInt();
        if (score >= 1 && score <= 100){
            if (score == 100){
                System.out.println("信用极好");
            }else if (score <= 99 && score > 80){
                System.out.println("信用优秀");
            }else if (score <= 80 && score >= 60){
                System.out.println("信用一般");
            }else {
                System.out.println("信用不及格");
            }
        }else {
            System.out.println("信用分输入有误");
        }

        //案例04--多分支2
        System.out.println("==================================");
        boolean b = true;
        if (b == false){
            System.out.println("a");
        }else if (b){
            System.out.println("b");
        }else if (!b){
            System.out.println("c");
        }else {
            System.out.println("d");
        }//输出为b

        //案例05--嵌套分支1
        System.out.println("==================================");
        System.out.println("请输入得分");
        double score5 = myScanner.nextDouble();
        if (score5 > 8.0){
            System.out.println("请输入性别");
            char gender = myScanner.next().charAt(0);
            if (gender == '女'){
                System.out.println("恭喜你进入女子组");
            }else if (gender == '男') {
                System.out.println("恭喜你进入男子组");
            }else {
                System.out.println("你的性别有误，不能参加决赛");
            }
        }else {
            System.out.println("淘汰");
        }

        //案例06--嵌套分支2
        System.out.println("==================================");
        System.out.println("请输入月份");
        int month = myScanner.nextInt();
        System.out.println("请输入年龄");
        int age6 = myScanner.nextInt();
        double price = 60;
        if (month >= 4 && month <= 10){
            System.out.println("旺季");
            if (age6 < 18){
                price /= 2;
            }else if (age6 > 60){
                price /= 3;
            }
        }else {
            System.out.println("淡季");
            if (age6 >= 18 && age6 <=60){
                price = 40;
            }else {
                price = 20;
            }
        }
        System.out.println("票价为" + price);


    }

}
