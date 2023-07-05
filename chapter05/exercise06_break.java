package chapter05;
import java.util.Scanner;

public class exercise06_break {
    public static void main(String[] args){

        //break--提前跳出循环
        //简易使用break
        for (int i = 1;i <= 10;i++){
            if (i == 3){
                break;
            }
            System.out.println("i= " + i);
        }  //只能输出1和2

        //案例：随机生成1-100，统计直至生成97时的次数
        int num = 0;
        int count97 = 0;
        while (num != 97){
            num = (int)(Math.random() * 100) + 1;
            count97 += 1;
            System.out.println("第" + count97 + "次：" + num);
        }
        System.out.println("获得97这个数需要" + count97 + "次");
        //使用break（用while循环也可）
        num = 0;
        count97 = 0;
        for (;;){
            num = (int)(Math.random() * 100) + 1;
            count97 += 1;
            System.out.println("第" + count97 + "次：" + num);
            if (num == 97){
                break;
            }
        }
        System.out.println("break:获得97这个数需要" + count97 + "次");

        //break的使用细节
        /*
        break出现在多重嵌套语句中，可以通过标签明确终止哪一层循环
          标签的使用：label1：{
                    label2：     {
                    label3：            { break label2;}
                                 }
                            }
          ①break可以指定退出哪层；②标签名可自定义；③实际开发中不建议使用标签，标签会使可读性变差；
          ④break后无标签，默认退出最近的循环体
         */
        label1:
        for (int i = 0;i < 5;i++){
        label2:
            for (int j = 0;j < 5;j++){
                System.out.println("i=" + i + " j=" + j);
                if (j == 2){
                    break label1;
                }
            }
        }

        //练习1：1-100内求和，求出当和第一次大于20的当前数
        System.out.println("练习1======================");
        int num1 = 0;
        int sum1 = 0;
        for (int i = 1;i < 100;i++){
            sum1 += i;
            if (sum1 > 20){
                num1 = i;
                break;
            }
        }
        System.out.println("此时，当前数为" + num1 + " 和为" + sum1);

        //练习2：实现登录验证
        //注意：字符串比较使用equals()方法
        System.out.println("练习2======================");
        String name = "";
        String password = "";
        int num2 = 3;
        Scanner myScanner = new Scanner(System.in);
        for (int i = 1;i <= num2;i++){
            System.out.println("请输入用户名：");
            name = myScanner.next();
            System.out.println("请输入密码：");
            password = myScanner.next();
            if ("丁真".equals(name) && "666".equals(password)){  //这种比较写法可以 避免空指针
                System.out.println("恭喜你，登录成功~~");
                break;
            }else if (i == num2){
                System.out.println("你已经输错" + num2 + "次，没有机会了");
            }else {
                System.out.println("你输错了，还剩" + (num2 - i) + "次机会");
            }
        }

    }
}
