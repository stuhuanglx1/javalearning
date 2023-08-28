package chapter13.string_;

/**
 * @author H lx
 * @vision 1.0
 */
public class StringMethod01 {
    public static void main(String[] args) {
        String str = "23a";
        String str2 = "23A";
        System.out.println(str.equals(str2));//false
        System.out.println(str.equalsIgnoreCase(str2));//true

        System.out.println("字符串长度\t" + str.length());//3
        String str3 = "2872a";
        System.out.println("第一次出现2的索引:" + str3.indexOf('2'));//0
        System.out.println("第一次出现87的索引" + str3.indexOf("87"));//1
        System.out.println("最后一次出现2的索引:" + str3.lastIndexOf('2'));//3
        System.out.println("最后一次出现87的索引：" + str3.lastIndexOf("87"));//1
        //在查找字符串的索引时，输出的是第一个字符所在的索引
        System.out.println("截取子串：" + str3.substring(2,4));//左闭右开，子串长度为2

        String str4 = "   7 8 ";
        System.out.println("str4的长度：" + str4.length());//7
        System.out.println("去掉空格str4:" + str4.trim());//7 8
        System.out.println("此时str4的长度:" + str4.length());//7
        String str5 = str4.trim();
        System.out.println("str5的长度:" + str5.length());//3

        for (int i = 0; i < str3.length(); i++) {
            System.out.print(str3.charAt(i) + "\t");
        }


    }
}
