package chapter12.exception_;

/**
 * @author H lx
 * @vision 1.0
 */
public class CustomException01 {
    public static void main(String[] args) {
        int age = 180;
        if(!(age >= 18 && age <= 120)){
            //可以通过构造器，设置信息
            throw new AgeException("年龄需要在18~120之间");
        }
        System.out.println("你的年龄在正常范围内");
    }
}
//自定义异常
//一般情况下，自定义异常继承RuntiomeException
//即把自定义异常做成运行时异常，好处：可以使用默认的处理机制
class AgeException extends RuntimeException{
    public AgeException(String message) {//构造器
        super(message);
    }
}
