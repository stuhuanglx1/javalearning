package chapter06;

public class homework {
    public static void main(String[] args){

        //homework01--考察数组定义格式
        System.out.println("作业01==================");
        /*判断数组定义
        a)String strs[] = {'a','b','c'};  //错误，{}给的是字符，而不是字符串，数据类型不匹配 char->String
        b)String[] strs = {"a","b","c"};  //正确
        c)String[] strs = new String{"a""b""c"};  //错误，格式错误、没逗号
        d)String strs[] = new String[]{"a","b","c"};  //正确
        e)String[] strs = new String[3]{"a","b","c"};  //错误，编译不通过
        数组定义正确的有b,d
         */

        //homework02--考察默认值
        System.out.println("作业02==================");
        String foo = "blue";
        boolean[] bar = new boolean[2];//默认值false
        if (bar[0]){
            foo = "green";
        }
        System.out.println(foo);//输出的是blue

        //homework03
        System.out.println("作业03==================");
        int num3 = 1;
        while (num3 < 10){
            System.out.print(num3 + "\t");
            if (num3 > 5){
                break;
            }
            num3 += 2;
        }//输出的是1,3,5,7

        //homework04
        System.out.println("\n作业04==================");
        int[] arr = {10,12,45,90};
        int num4 = 23;
        int[] arr1 = new int[arr.length + 1];
        System.out.println("方法1-----------");
        //赋值
        arr1[0] = num4;
        for (int i = 0;i < arr.length;i++){
                arr1[i+1] = arr[i];
        }
        //排序
        int temp;
        for (int i = 0;i < arr.length;i++){
            if (arr1[i] > arr1[i+1]){
                temp = arr1[i + 1];
                arr1[i + 1] = arr1[i];
                arr1[i] = temp;
            }
        }
        //输出
        for (int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i] + "\t");
        }

        //方法2：先找到应该插入的下标，再扩容拷贝插入
        System.out.println("\n方法2-----------");
        int index4 = -1;
        int[] arr2 = new int[arr.length + 1];
        for (int i = 0;i < arr.length;i++){
            if (arr[i] > num4){
                index4 = i;
                break;
            }
        }
        if (index4 == -1){
            index4 = arr.length;
        }
        for (int i = 0,j = 0;i < arr2.length;i++){
            if (i != index4){
                arr2[i] = arr[j];
                j++;
            }else {
                arr2[i] = num4;
            }
        }
        //输出
        for (int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i] + "\t");
        }

        //homework05
        System.out.println("\n作业05==================");
        int[] arr5 = new int[10];
        double sum5 = 0;
        int max = 0;
        int index5 = -1;
        boolean is8 = false;
        for (int i = 0;i < arr5.length;i++){
            arr5[i] = (int)(Math.random() * 100) + 1;
        }
        //正序打印、总和、最大值、查找
        for (int i = 0;i < arr5.length;i++){
            sum5 += arr5[i];
            System.out.print(arr5[i] + "\t");
            if (arr5[i] > max){
                max = arr5[i];
                index5 = i;
            }
            if (arr5[i] == 8){
                is8 = true;
            }
        }
        System.out.println();
        //倒序打印
        for (int i = arr5.length - 1;i >= 0;i--){
            System.out.print(arr5[i] + "\t");
        }
        System.out.println("\n平均数为" + (sum5/arr5.length) + " 最大值为" + max + " 下标为" + index5 +
                " \n是否有8？" +  is8);

        //homework06
        System.out.println("作业06==================");
        char[] arr61 = {'a','b','c','d'};
        char[] arr62 = arr61;
        arr61[2] = 'h';
        for (int i = 0;i < arr62.length;i++){
            System.out.println(arr61[i] + "," + arr62[i]);
        }//输出为 a,a  b,b  h,h  d,d

        //homework07--冒泡排序
        System.out.print("作业07==================");
        int[] arr7 = {10,67,93,23,87,0,-23,90,499,-65};
        int temp7 = 0;
        for (int i = 0;i < arr7.length - 1;i++){
            for (int j = 0;j < arr7.length - 1 - i;j++){
                if (arr7[j] > arr7[j + 1]){
                    temp7 = arr7[j];
                    arr7[j] = arr7[j + 1];
                    arr7[j + 1] = temp7;
                }
            }
            System.out.print("\n第" + (i + 1) + "轮排序结果： ");
            for (int j = 0;j < arr7.length;j++){
                System.out.print(arr7[j] + "\t");
            }
        }


    }
}
