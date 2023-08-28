package chapter13.data_;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author H lx
 * @vision 1.0
 */
public class LocalDate_ {
    public static void main(String[] args) {
        //LocalDate(日期)\LocalTime(时间)\LocalDateTime(日期和时间)--第三代,JDK8后加入
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());//英文
        System.out.println(localDateTime.getMonthValue());//阿拉伯数字
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        LocalDate ld = LocalDate.now();
        System.out.println("年月日" + ld);
        LocalTime lt = LocalTime.now();
        System.out.println("时间" + lt);

        //使用DateTimeFormat
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月 HH:mm:ss ");
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);

        //时间戳
        //类似于Date，提供一系列和Date转换的方式
        //Instant-->Date
//        Date date = Date.from(instant);
        //Date-->Instant
//        Instant instant = data.toInstant();
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);
        Instant instant = date.toInstant();

        //更多方法
        /*
        是否闰年
        增加日期某个部分
        使用plus方法测试增加时间的某个部分
        使用minus方法测试查看一年前和一年后日期
         */
        //看看800天后是什么时候？
        LocalDateTime localDateTime1 = localDateTime.plusDays(800);
        System.out.println("800天后是 " + dateTimeFormatter.format(localDateTime1));

        //看看100分钟前是什么时候？
        LocalDateTime localDateTime2 = localDateTime.minusMinutes(100);
        System.out.println("100分钟前是 " + dateTimeFormatter.format(localDateTime2));

        //尽可能使用第三代！



    }
}
