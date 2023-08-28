package chapter13.string_;

/**
 * @author H lx
 * @vision 1.0
 */
public class StringMethod02 {
    public static void main(String[] args) {
        String str1 = "hello HHH";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        String str2 = "宝玉";
        System.out.println(str2.concat("林黛玉").concat("薛宝钗"));
        System.out.println(str2);

        System.out.println(str1.replace('h','o'));//oello HHH
        System.out.println(str1);//hello HHH  替换值并不直接针对str4的值

        String peom = "床前明月光，疑是地上霜，举头望明月，低头思故乡";
        String[] splits = peom.split("，");
        for (int i = 0; i < splits.length; i++) {
            System.out.println(splits[i]);
        }
        String filePath = "C:\\aa\\bb.txt";
        String[] spRes = filePath.split("\\\\");//记住转义字符的使用--特殊字符
        for (int i = 0; i < spRes.length ; i++) {
            System.out.print(spRes[i] + "  ");
        }

        str1 = "happy";
        char[] chs = str1.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + "\t");
        }

        System.out.println();
        String a = "jab";
        String b = "jcd";
        String c = "hab";
        String d = "hzb";
        String e = "jabchl";
        System.out.println(a.compareTo(b));//负数-2，前者大
        System.out.println(a.compareTo(c));//正数2，后者大
        System.out.println(a.compareTo(d));//正数2，后者大，和上行代码结果一样，是j与h比较
        System.out.println(a.compareTo(e));//-3,前者字符串长度-后者字符串长度
//        compareTo会先找最小长度，然后遇到不一样的字符就会直接比较，返回长度的差值，前者-后者，数字比较大小，字母比较ascⅡ码

        String name = "张三";
        int age = 23;
        double score = 88.1;
        char gender = '男';
        //方式1
        String info = String.format("我的姓名是%s，年龄是%d，成绩为%.2f，性别为%c",name,age,score,gender);
        System.out.println(info);
        //方式2
        String info1 = "我的姓名是%s，年龄是%d，成绩为%.2f，性别为%c";
        String info2 = String.format(info1, name,age,score,gender);
        System.out.println(info2);
        //%为占位符，由后边的变量来替换
    }
}
