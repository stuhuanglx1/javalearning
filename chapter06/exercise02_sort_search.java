package chapter06;
import java.util.Scanner;

public class exercise02_sort_search {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        //排序：内部排序 和 外部排序
        /*
        内部排序：将所有待处理数据加载到内存中进行排序 --交换式排序、选择排序、插入式排序
        外部排序：数据量过大，无法全部加载到内存，需要借助外部存储进行排序（大数据） --合并排序、直接合并排序
         */
        //冒泡排序（bubble sort）：通过对待排排序序列从后向前，依次比较相邻元素值，若发现逆序则交换元素。
        /*
        冒泡排序特点：一共n个数，则将进行(n-1)轮排序，每轮的比较次数减1
         */
        int[] arr = {26,69,80,57,13,90,-1,-9};
        int temp;
        for (int i = 0;i < arr.length - 1;i++){
            for (int j = 0;j < arr.length - i - 1;j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.print("第" + (i+1) + "轮排序结果： ");
            for (int k = 0;k < arr.length;k++){
                System.out.print(arr[k] + "\t");
            }
            System.out.println();
        }

        //查找：顺序查找 和 二分查找(数列有序)
        //案例01
        String[] names = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        System.out.println("请输入名字：");
        String name = myScanner.next();

        int index = -1;
        for (int i = 0;i < names.length;i++){
            if (names[i].equals(name)){
                System.out.println("恭喜你找到" + name);
                System.out.println("下标为" + i);
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("失败了，没有找到" + name);
        }

    }
}
