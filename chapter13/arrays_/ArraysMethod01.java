package chapter13.arrays_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author H lx
 * @vision 1.0
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1,20,3};
        //遍历数组--toString方法
        System.out.println(Arrays.toString(integers));

        //排序--sort
        Arrays.sort(integers);
        System.out.println("===========排序后========");
        System.out.println(Arrays.toString(integers));
        //可以通过传入一个比较器，实现定制排序
        Integer[] arr = {3,2,6,9,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("==========定制排序==========");//匿名内部类
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;//变成降序
            }
        });
        /*
        sort源码分析：
        会一直追踪到TimSort类的binarySort方法，会根据动态绑定机制，会根据传入来执行匿名内部类
        while (left < right) {
                int mid = (left + right) >>> 1;
                if (c.compare(pivot, a[mid]) < 0)
                    right = mid;
                else
                    left = mid + 1;
            }
            assert left == right;
            接口编程+动态绑定+匿名内部类
            常见底层框架和源码的使用方式
         */
        System.out.println(Arrays.toString(arr));

        //binarySearch通过二分搜索法进行查找（必须是有序数组）
        Integer[] arr3 = {2,4,6,7,8};
        int index = Arrays.binarySearch(arr3,7);//不存在该元素就会返回-(low + 1)
        System.out.println("index=" + index);
        int index1 = Arrays.binarySearch(arr3,88);//不存在该元素就会返回-(low + 1)
        System.out.println("index=" + index1);//输出-6  ==> -（length + 1）

        //copyOf数组复制
        Integer[] newArr = Arrays.copyOf(arr3,arr3.length);
        System.out.println(Arrays.toString(newArr));
        newArr = Arrays.copyOf(arr3,arr3.length - 2);
        System.out.println(Arrays.toString(newArr));
        newArr = Arrays.copyOf(arr3,arr3.length + 2);//拷贝长度>原数组长度，就在新数组后面增加null
        System.out.println(Arrays.toString(newArr));
//        newArr = Arrays.copyOf(arr3, - 2);//会报异常
//        System.out.println(Arrays.toString(newArr));

        //fill数组填充--用num填充数组，更换数组所有的值
        Integer[] arr4 = new Integer[]{9,3,2};
        Arrays.fill(arr4,99);
        System.out.println(Arrays.toString(arr4));

        //equals比较两个数组内容是否完全一样
        boolean equals = Arrays.equals(arr,arr3);
        System.out.println("equals = " + equals);

        //asList将一组值转换成list
        //asList会将（2，3，4，5）会转成一个List合集
        /*
        返回的asList编译类型是List(接口)
        运行类型是class java.util.Arrays$ArrayList，是Arrays的内部类
         */
        List<Integer> asList = Arrays.asList(2,3,4,5);
        System.out.println("asList = " + asList);
        System.out.println(asList.getClass());
    }


}
