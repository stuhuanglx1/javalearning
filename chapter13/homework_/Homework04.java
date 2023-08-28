package chapter13.homework_;

/**
 * @author H lx
 * @vision 1.0
 */
public class Homework04 {
    public static void strCount(String str){
        int countUpper = 0;
        int countLowwer = 0;
        int countNum = 0;
        int other = 0;

        if (str == null){
            throw new RuntimeException("字符串不能为空");
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                countNum++;
            }else if (Character.isUpperCase(str.charAt(i))){
                countUpper++;
            }else if (Character.isLowerCase(str.charAt(i))){
                countLowwer++;
            }else {
                other++;
            }
        }
        System.out.println(countLowwer);
        System.out.println(countUpper);
        System.out.println(countNum);
        System.out.println(other);
    }
    public static void main(String[] args) {
        try {
            strCount("780hkSf5A");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
