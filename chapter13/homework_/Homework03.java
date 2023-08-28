package chapter13.homework_;

/**
 * @author H lx
 * @vision 1.0
 */
public class Homework03 {
    public static void formatName(String str){
        if (str == null){
            throw new RuntimeException("字符串不能为空");
        }
        String[] names = str.split(" ");
        if (names.length != 3){
            throw new RuntimeException("输入字符串格式不对");
        }
        String format = String.format("%s,%s.%c",names[2],names[0],names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }

    public static void main(String[] args) {
        formatName("Han Shun Ping");
    }
}
