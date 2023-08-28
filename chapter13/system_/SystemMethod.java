package chapter13.system_;

import java.util.Arrays;

/**
 * @author H lx
 * @vision 1.0
 */
public class SystemMethod {
    public static void main(String[] args) {
        /*
        system方法
        1）exit：退出当前程序
        2）arraycopy：复制数组元素，比较适合底层调用
        Array.copyOf 完成复制数组
        3）currentTimeMilens：返回当前时间距离1970-1-1的毫秒数
        4）gc：运行垃圾回收机制
         */

        //1）exit：退出当前程序
//        System.out.println("ok1");
//        System.exit(0);//0是一个状态意味着正常退出
//        System.out.println("ok2");//程序已经退出，不再执行

        //2）arraycopy：复制数组元素，比较适合底层调用
        int[] src = {1,2,3,4,5};
        int[] dest = new int[7];
        System.arraycopy(src,1,dest,1,3);
        System.out.println(Arrays.toString(dest));
        /*五个参数解读
         * @param      src      the source array. 源数组
         * @param      srcPos   starting position in the source array.  源数组的开始拷贝位置索引
         * @param      dest     the destination array.  目标数组，即源数组拷贝到哪个数组
         * @param      destPos  starting position in the destination data.  把源数组的数据拷贝到目标数组的开始索引
         * @param      length   the number of array elements to be copied.  拷贝个数
         */
//        Array.copyOf 完成复制数组
        //底层源码多不用，一般使用Array.copyOf

        //3）currentTimeMilens：返回当前时间距离1970-1-1的毫秒数
        System.out.println(System.currentTimeMillis());

        //4）gc：运行垃圾回收机制

    }
}
