package chapter13.data_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author H lx
 * @vision 1.0
 */
public class Data_ {

    public static void main(String[] args)throws ParseException {
        //第一代日期 ———— Data
        Date d1 = new Date();//引得是java.util包下的的Date类
        System.out.println("当前时间：" + d1);
        //默认输出格式是国外格式
        Date d2 = new Date(98888888);
        System.out.println("98888888对应的时间日期：" + d2);
        //对格式进行转换
        //格式规定字母都是提前规定好的
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月 hh:mm:ss E");
        String format = simpleDateFormat.format(d1);
        System.out.println(format);

        //可以把一个格式化的字符串转成对应的Date
        String s = "2023年08月 04:02:24 星期五";
        Date parse = simpleDateFormat.parse(s);
        System.out.println("parse = " + parse);//输出时仍按照国外默认格式，若想转换形式同上
    }
}
