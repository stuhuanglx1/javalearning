package chapter06;
import java.util.Scanner;

public class exercise01_array {
    public static void main(String[] args){

        //传统方法--代码灵活性太差  ==> 数组的必要性
        double hen1 = 3;
        double hen2 = 5;
        double hen3 = 1;
        double hen4 = 3.4;
        double hen5 = 2;
        double hen6 = 50;
        double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
        double averWeight = totalWeight / 6;
        System.out.println("总体重为" + totalWeight + " ,平均体重为" + averWeight);

        //数组（引用数据类型）--可以存放多个同一类型的数据
        System.out.println("======使用数组解决=======");
        double[] hens = {3, 5, 1, 3.4, 2, 50};
        totalWeight = 0;
        for (int i = 0;i < hens.length;i++){
            System.out.println("第" + (i + 1) + "只鸡的体重为：" + hens[i]);
            totalWeight += hens[i];
        }
        averWeight = totalWeight / hens.length;
        System.out.println("总体重：" + totalWeight + " 平均体重：" + averWeight);

        //数组的使用方式
        //使用方式1-动态初始化   数组类型 数组名[]（数据类型[] 数组名） = new 数据类型[大小];
        int[] a1 = new int[5];  //默认值为0
        System.out.println(a1[2]);
        //使用方式2-动态初始化  --> 先声明数组，再创建数组
        int[] a2;  //声明，此时未分配内存空间 a2为null
        a2 = new int[6];  //分配到了空间，可以存放数据
        //使用方式3-静态初始化   数据类型[] 数组名 = {……,……,……}; <==知道数组的具体值
        int[] a3 = {2,4,6,4};

        //数组使用细节
        /*
        ①数组是多个相同类型数据的组合，实现对数据的统一管理
        ②数组中元素可以是任何类型（基本数据类型+引用数据类型），但不能混用
        ③数组创建后未赋值，是有默认值的 int,short,byte,long->0;float,double->0.0;boolean->false;String->null
        ④步骤：1、声明数组，开辟空间；2、元素赋值；3、使用数组
        ⑤！！！数组下标是从0开始
        ⑥数组下标必须在指定下标范围内使用，否则会报错：下标越界异常
        ⑦数组是引用类型，数组型数据是对象（object）
         */
//        int[] arr1 = {3.4,4,100,"hello"};//错误，String -> int , double -> int
        double[] arr2 = {3.4,4,100};//正确
        String[] arr3 = {"北京", "上海", "杭州"};

        //应用案例1
        System.out.println("==========应用案例1=============");
        char[] chars = new char[26];
        for (int i = 0;i < chars.length;i++){
            chars[i] = (char) ('A' + i);
        }
        for (int i = 0;i < chars.length;i++){
            System.out.print(chars[i] + "\t");
        }
        System.out.println();

        //应用案例2
        System.out.println("==========应用案例2=============");
        int[] arr = {4,-1,9,10,23,22};
        int max = -1000;
        int maxIndex = 0;
        int sum2 = 0;
        for (int i = 0;i < arr.length;i++){
            sum2 += arr[i];
            if (arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("最大值的下标为"+maxIndex+" 值为"+max);
        System.out.println("总和为"+sum2+" 平均值为"+((double)sum2/arr.length));


        //数组赋值机制
        System.out.println("===============");
        /*
        1、基本数据类型赋值，这个值就是具体的数值，互相不影响---值拷贝、值传递
        2、数组在默认情况下是引用传递，赋的是地址---地址拷贝、引用传递===>传递的是！地址！
         */
        int n1 = 8;
        int n2 = n1;
        System.out.println("n1=" + n1 + " n2=" + n2);
        n1 = 3;
        System.out.println("n1=" + n1 + " n2=" + n2);//n2变化不会影响到n1
        int[] array1 = {2,3,65,44,2};
        int[] array2 = array1;
        for (int i = 0;i < array1.length;i++){
            System.out.println("数组1："+array1[i]+" \t数组2："+ array2[i]);
        }
        System.out.println("数组1的地址："+array1+"数组2的地址："+array2);
        System.out.println("更改array2------");
        array2[2] = 12;
        for (int i = 0;i < array1.length;i++){
            System.out.println("数组1："+array1[i]+" \t数组2："+ array2[i]);
        }
        System.out.println("数组1的地址："+array1+"数组2的地址："+array2);//数组元素的值改变但地址不会改变

        //数组拷贝  (保证数组地址独立)
        System.out.println("====================");
        int[] arr01 = {10,20,30};
        int[] arr02 = new int[arr01.length];
        for (int i = 0;i < arr01.length;i++){
            arr02[i] = arr01[i];
        }
        arr02[1] = 88;
        for (int i = 0;i < arr01.length;i++){
            System.out.print(arr01[i] + "\t");
        }
        System.out.println();
        for (int i = 0;i < arr02.length;i++){
            System.out.print(arr02[i] + "\t");
        }
        System.out.println();
        System.out.println("数组01的地址："+arr01+"数组02的地址："+arr02);//此时两个数组地址不同，是相互独立

        //数组反转array reverse
        System.out.println("【案例】数组反转==========================");
        int[] arr03 = {11,22,33,44,55,66,77};
        int temp;
        for (int i = 0;i < arr03.length/2;i++){
            temp = arr03[arr03.length-1-i];
            arr03[arr03.length-1-i] = arr03[i];
            arr03[i] = temp;
        }
        for (int i = 0;i < arr03.length;i++){
            System.out.print(arr03[i] + "\t");
        }//交换成功，无论数组元素是奇数个还是偶数个
        //逆序遍历，创建一个arr04进行顺序拷贝
        System.out.println();
        int[] arr05 = {11,22,33,44,55,66,77};
        int[] arr04 = new int[arr05.length];
        for (int i = 0;i < arr05.length;i++){
            arr04[i] = arr05[arr05.length-1-i];
            System.out.print(arr04[i] + "\t");
        }//arr05的数据空间无用

        //数组扩容
        System.out.println("\n数组扩容========================");
        int[] arr06 = {1,2,3};
        int[] arr07 = new int[arr06.length + 1];
        for (int i = 0;i < arr06.length;i++){
            arr07[i] = arr06[i];
        }
        arr07[arr06.length] = 4;
        for (int i = 0;i < arr07.length;i++){
            System.out.print(arr07[i] + "\t");
        }
        arr06 = arr07;

        System.out.println("\n数组动态扩容========================");
        Scanner myScanner = new Scanner(System.in);
        int[] arr09 = {1,2,3};
        do {
            System.out.println("是否需要扩容？（y、n）");
            char isAdd = myScanner.next().charAt(0);
            if (isAdd == 'n'){
                break;
            }
            System.out.println("输入增加的整数值：");
            int num = myScanner.nextInt();

            int[] arrAdd = new int[arr09.length + 1];
            for (int i = 0;i < arr09.length;i++){
                arrAdd[i] = arr09[i];
            }
            arrAdd[arr09.length] = num;
            arr09 = arrAdd;
        }while (true);
        for (int i = 0;i < arr09.length;i++){
            System.out.print(arr09[i] + "\t");
        }

        //数组缩减
        System.out.println("\n数组缩减=================");
        int[] arr10 = {1,2,3,4,5};
        do {
            System.out.println("是否需要缩减？（y、n）");
            char isReduce = myScanner.next().charAt(0);
            if (isReduce == 'n'){
                break;
            }
            System.out.println("输入缩减的下标：");
            int index = myScanner.nextInt();
            if (index > arr10.length-1 || index < 0){
                System.out.println("数组下标越界，终止缩减");
                break;
            }

            int[] arrReduce = new int[arr10.length - 1];
            for (int i = 0,j = 0;i < arr10.length-1;i++,j++){
                if (j == index){
                    i--;
                    continue;
                }
                arrReduce[i] = arr10[j];
            }
            arr10 = arrReduce;
        }while (true);
        for (int i = 0;i < arr10.length;i++){
            System.out.print(arr10[i] + "\t");
        }



    }
}
