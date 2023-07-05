package chapter05;

public class exercise03_for {
    public static void main(String[] args){
        //案例-简单for循环
        for (int i = 1;i < 11;i++){
            System.out.println(i + "你好！");
        }
        //for的使用细节
        /*
        1、循环条件是返回一个布尔值的表达式
        2、初始化和变量迭代可以写在括号外，但；不能省略
        3、循环初始值可以多多条初始化语句，要求类型一样，用逗号隔开；变量迭代也可有多条迭代语句，中间用逗号隔开
         */
        int i = 1;
        for (;i < 11;){
            System.out.println(i + " 你好");
            i++;
        }//这种写法使得i可以在循环体外继续使用

//        for (;;){
//            System.out.println("0");
//        }//无限循环（死循环）

        int count = 3;
        for (int i1 = 0,j = 0;j < count;i1++,j += 2){
            System.out.println("i=" + i1 + " j=" + j);
        }

        //练习01
        System.out.println("练习1=============");
        int start = 1;
        int end = 100;
        int count1 = 0;
        int sum = 0;
        for (int i2 = start;i2 <= end;i2++){
            //过滤
            if (i2 % 9 == 0){
                count1 += 1;
                sum += i2;
                System.out.println(i2);
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("count = " + count1);

        //练习02--一个数所有的整数加法
        System.out.println("练习2=============");
        int num = 5;
        for (int i3 = 0;i3 <= num;i3++){
            System.out.println(i3 + "+" + (num - i3) + "=" +num);
        }


    }
}
