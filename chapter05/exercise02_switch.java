package chapter05;
import java.util.Scanner;

public class exercise02_switch {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        //案例01
        System.out.println("请输入一个字符（a-f）：");
        char c1 = myScanner.next().charAt(0);
        switch (c1){
            case 'a':
                System.out.println("今天是星期一");
                break;
            case 'b':
                System.out.println("今天是星期二");
                break;
            case 'c':
                System.out.println("今天是星期三");
                break;
            case 'd':
                System.out.println("今天是星期四");
                break;
            case 'e':
                System.out.println("今天是星期五");
                break;
            case 'f':
                System.out.println("今天是星期六");
                break;
            case 'g':
                System.out.println("今天是星期日");
                break;
            default:
                System.out.println("你输入的字符不正确，无法匹配");
        }
        System.out.println("退出switch");


        //switch的使用细节
        /*
        1、表达式数据类型需要和case后常量类型一致，或着可以自动转换的类型
        2、表达式的返回值必须为 byte，short，int，char，enum【枚举】，String
        3、case后的是常量，不能是变量
        4、当没有匹配的case时，执行default
        5、break用来跳出switch循环，如果没有break将会一直循环到最后一条语句块
         */
        char c = 'a';
        switch (c){  //表达式返回值不能是double等
            case 'a': //值必须是常量或者常量表达式，‘a’+10是符合条件的，但变量a1就不符合
                System.out.println("ok1");
                break;
            case 'b'://如果是20，那么可以编译；如果是“hello”字符串，则会报错
                System.out.println("ok2");
                break;
            default:  //缺少default该语法也是正确的
                System.out.println("ok3");
        }

        //练习1
        System.out.println("练习1=========================");
        System.out.println("请输入一个字符（a-e）：");
        char c2 = myScanner.next().charAt(0);
        switch (c2){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
        }

        //练习2
        System.out.println("练习2=========================");
        System.out.println("请输入成绩：");
        double score = myScanner.nextDouble();
        if (score >= 0 && score <= 100){
            switch ((int)(score/60)){
                case 0:
                    System.out.println("不合格");
                    break;
                case 1:
                    System.out.println("合格");
                    break;
                default:
                    System.out.println("成绩输入有误");
            }
        }else {
            System.out.println("错误");
        }

        //练习3--使用穿透
        System.out.println("练习3=========================");
        System.out.println("请输入月份：");
        int month = myScanner.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入有误");
        }




    }
}
