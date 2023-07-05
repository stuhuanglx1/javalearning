package chapter04;

public class homework {

    public static void main(String[] args){
        //作业1：计算表达式结果
        System.out.println("===========作业1===========");
        System.out.println(10 / 3);//3
        System.out.println(10 / 5);//2
        System.out.println(10 % 2);//0
        System.out.println(-10.5 % 3);//-1.5(近似值)

        //作业2：测试代码结果
        System.out.println("===========作业2===========");
        int i = 66;
        System.out.println(++i+i);//134

        //作业3：判断正确的赋值语句
        System.out.println("===========作业3===========");
        /*
        int num1 = (int)"18";  错误，String->int Integer.parseInt(”18“)方法
        int num2 = 18.0;  错误，精度大转精度小
        double num3 = 3d;  ok
        double num4 = 8;  ok，会进行自动类型转换
        int i = 48;char ch = i+1;  错误，int->char
        byte b = 19;short s = b + 2;    第一句正确，第二句错误，byte运算会转成int，int->short
         */

        //作业4：将String转换成double类型，以及将char类型转换成String
        System.out.println("===========作业4===========");
        String s1 = "3421.12";
        double d1 = Double.parseDouble(s1);
        System.out.println(d1);
        char c1 = '帅';
        String s2 = c1 + "";
        System.out.println(s2);



    }

}
