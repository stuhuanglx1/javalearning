package chapter08.packagelearing;

import chapter08.packagelearing.dahuang.Dog;

import java.util.Arrays;

//import java.util.Scanner;  只导入java.util包下的Scanner
//import java.util.*;  导入java.util包下的所有类
public class packageLearning {
    public static void main(String[] args) {
        //包的三大作用
        /*
        1、区分相同名字的类
        2、当类很多时，可以很好的管理文档
        3、控制访问范围
         */
        Dog dog = new Dog();
        System.out.println(dog);

        chapter08.packagelearing.xiaoming.Dog dog1 = new chapter08.packagelearing.xiaoming.Dog();
        System.out.println(dog1);

        //包的命名规则--只能包含数字、字母、下划线、小圆点  不能以数字开头，不能是关键字或保留字
        //包的规范--小写字母+小圆点 com.hlx.user

        //导包  需要导入哪个类就导入哪个类
        //使用系统提供的Arrays类完成数组排序
        int[] arr = {29,39,-2,12,4};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        //注意事项
        /*
        1、package的作用是声明当前类所在包，需要放在类的最上面，一个类中只有一句package
        2、import指令在package指令下方，在类定义之前，可以有多句且无固定顺序
         */


    }
}
