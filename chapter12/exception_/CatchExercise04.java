package chapter12.exception_;

import java.util.Scanner;

/**
 * @author H lx
 * @vision 1.0
 */
public class CatchExercise04 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num = 0;
        System.out.println("请输入一个整数");
        while (true){
            try {
                num = Integer.parseInt(myScanner.next());
                break;
            }catch (Exception e){
                System.out.println("输入有误，请重新输入一个整数");
            }
        }
    }
}
