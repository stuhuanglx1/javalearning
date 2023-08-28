package chapter13.data_;

import java.util.Calendar;

/**
 * @author H lx
 * @vision 1.0
 */
public class Calendar_ {
    public static void main(String[] args) {
        //第二代日期类 ———— Calendar
        //是一个抽象类,并且构造器私有化,提供大量的方法和字段
//        Calendar calendar = new Calendar();//构造器protected-->获取实例用getInstance方法
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println("年" + calendar.get(Calendar.YEAR));
        //获取月份时记得加一，从0开始计数
        System.out.println("月" + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("日" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时" + calendar.get(Calendar.HOUR));
        System.out.println("分钟" + calendar.get(Calendar.MINUTE));
        System.out.println("秒" + calendar.get(Calendar.SECOND));
        //没有专门的格式，输出需要自己组合
        System.out.println(calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH) + 1)+
                "-" + calendar.get(Calendar.DAY_OF_MONTH));

        //24小时进制，获取小时
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));

        //Calendar的不足：1、可变性；2、偏移性；3、格式化；4、不线程安全，不能处理闰秒
    }
}
