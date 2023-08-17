package chapter12.exception_;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author H lx
 * @vision 1.0
 */
public class Exception02 {
    public static void main(String[] args) {
        try{
            FileInputStream fis;
            fis = new FileInputStream("d:\\a.jpg");//Unhandled exception: java.io.FileNotFoundException
            //编译时异常
            int len;
            while ((len = fis.read()) != -1){
                System.out.println(len);
            }
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
