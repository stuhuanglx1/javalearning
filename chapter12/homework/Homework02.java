package chapter12.homework;

/**
 * @author H lx
 * @vision 1.0
 * 查找异常题
 */
public class Homework02 {
    public static void main(String[] args) {
        //length=0时会报数组越界异常
        if (args[4].equals("john")){ //此处有args[4] = null时，可能发生空指针异常
            System.out.println("AA");
        }else {
            System.out.println("BB");
        }
        Object o = args[2];//String->Object，向上转型
        Integer i = (Integer) o;//错误，类型转换异常ClassCastException
    }
}
