package chapter13.homework_;

/**
 * @author H lx
 * @vision 1.0
 * 编程题
 * 字符串反转
 */
public class Homework01 {
    public static String reverse(String str,int start,int end){
        //对输入数组做一个验证
        //编程技巧：①写出正确的情况②然后取反
        if (!(str != null && start >= 0 && end < str.length() && start < end)){
            throw new RuntimeException("参数不正确");
        }

        char[] chars = str.toCharArray();
        char temp = ' ';

        for (int i = start,j = end; i < j; i++,j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "2bn4hw8999";
        System.out.println(reverse(s,3,5));
        try {
            System.out.println(reverse(s,3,3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
