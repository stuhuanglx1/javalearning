package chapter12.exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author H lx
 * @vision 1.0
 */
public class Throws01 {
    public static void main(String[] args) {

    }
    public void m1() throws FileNotFoundException {//也可以写成父类Exception
        //创建一个文件流对象
        FileInputStream fis = new FileInputStream("d://aa.txt");
        //FileNotFoundException属于编译异常
        //使用throws，让调用m1方法的调用者处理


    }
}
