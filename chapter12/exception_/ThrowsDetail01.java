package chapter12.exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author H lx
 * @vision 1.0
 */
public class ThrowsDetail01 {
    public static void main(String[] args) {
        f2();
    }
    public static void f2()/* throws ArithmeticException*/{
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
        //默认throws处理方式
    }
    public static void f1(){
        //在f1中调用f3方法会报错 --> 抛出的编译异常未被处理，这时需要f1方法必须处理该方法
        //方法：throws或者try-catch-finally
        try {
            f3();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
    public static void f4(){
        f5();//不会有错，因为运算异常是运行时异常，java对运行异常有默认处理机制
        //FileNotFoundException等编译异常一定要进行显示处理
    }
    public static void f5() throws ArithmeticException{

    }
}

//父类、子类都有method方法，构成重写
class Father{//父类
    public void method() throws RuntimeException{}
}
//该例子中NullPointerException是RuntimeException的子类，符号要求
class Son extends Father{//子类
    @Override
    public void method()throws NullPointerException{}
    //如果此处异常类型改为Exception、FileNotFoundException，则会报错
}
