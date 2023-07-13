package chapter07;

public class VarParameter {
    //允许将同一个类中多个同名同功能但参数个数不同的方法封装成一个方法--可变参数
    //基本语法
    //   访问修饰符 返回类型 方法名(数据类型... 形参名){}

    public static void main(String[] args){
        //可变参数
        System.out.println("可变参数的快速入门--结果：" + sum(2,8,4));

        //可变参数细节
        /*
        1)实参可以为0个或者任意个
        2)实参可以为数组
        3)可变参数的实参本质上就是数组
        4)可变参数可以和普通参数放在一起，但必须位于参数列表最后
        5)一个形参列表里只能有一个可变参数
         */
        System.out.println("===============================");
        int[] arr = {2,4,5,7};
        System.out.println("输入一个数组作为实参的结果：" + sum(arr));
        System.out.println("===============================");
        f1("你好帅，小黄！ ",4,8,2);

        //可变参数--练习
        System.out.println("===============================");
        System.out.println(showCase("黄三",35,67,89.5,99,12));

    }

    //快速入门
    public static int sum(int... nums){  //可当成数组接收
        System.out.println("接收的参数个数：" + nums.length);
        int res = 0;
        for (int i = 0;i < nums.length;i++){
            res += nums[i];
        }
        return res;
    }

    public static void f1(String s,double... nums){
        System.out.println("字符串为：" + s);
        for (int i = 0;i < nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
        System.out.println();
    }

    //可变参数--练习
    public static String showCase(String name,double... scores){
        double totalScore = 0;
        for (int i = 0;i < scores.length;i++){
            totalScore += scores[i];
        }
        return name + "有"+ scores.length + "门课程，总分为" + totalScore;
    }
}
