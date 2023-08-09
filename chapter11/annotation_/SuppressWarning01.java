package chapter11.annotation_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author H lx
 * @vision 1.0
 */
public class SuppressWarning01 {
    public static void main(String[] args) {
        //有些时候不希望看到警告的时候，可以使用SuppressWarning的注解来抑制警告信息
        //{""}内可以写入希望不显示的警告
        @SuppressWarnings({"rawtypes","unchecked","unused"})//抑制警告范围是main
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        int i;
        System.out.println(list.get(1));
    }
}
