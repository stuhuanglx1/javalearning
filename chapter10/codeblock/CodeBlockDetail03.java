package chapter10.codeblock;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBBB();
        /*
        AAAA构造器被调用
        BBBB的普通代码块
        BBBB构造器被调用
         */
    }
}
//class A{
//    public A(){
//        //构造器中隐藏的语法
//        //（1）super();
//        //（2）调用普通代码块
//        System.out.println();
//    }
//}
class AAAA{
    public AAAA(){
        System.out.println("AAAA构造器被调用");
    }
}
class BBBB extends AAAA{
    {
        System.out.println("BBBB的普通代码块");
    }
    public BBBB(){
        System.out.println("BBBB构造器被调用");
    }
}
