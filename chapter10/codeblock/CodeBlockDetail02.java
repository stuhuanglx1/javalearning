package chapter10.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        /*
        getN1被调用
        AAA 静态代码块
         */

        BBB bbb = new BBB();
        /*
        BBB 静态代码块
        getN2被调用
         */

        CCC ccc = new CCC();
        /*
        调用getN3.。。
        CCC的普通代码块
         */

        System.out.println("=============");
        DDD ddd = new DDD();
        /*
        getNum1方法--静态属性初始化
        DDD的静态代码块
        getNum2方法--普通属性初始化
        DDD的普通代码块
        DDD的无参构造器
         */
    }
}
class AAA{
    private static int n1 = getN1();

    static {
        System.out.println("AAA 静态代码块");
    }
    public static int getN1(){
        System.out.println("getN1被调用");
        return 20;
    }
}
class BBB{

    static {
        System.out.println("BBB 静态代码块");
    }

    private static int n2 = getN2();

    public static int getN2(){
        System.out.println("getN2被调用");
        return 20;
    }
}
class CCC{
    private int n3 = getN3();

    {
        System.out.println("CCC的普通代码块");
    }

    public int getN3() {
        System.out.println("调用getN3.。。");
        return 30;
    }
}
class DDD{
    private static int num1 = getNum1();
    private int num2 = getNum2();

    {
        System.out.println("DDD的普通代码块");
    }
    static {
        System.out.println("DDD的静态代码块");
    }

    public DDD(){
        System.out.println("DDD的无参构造器");
    }

    public static int getNum1() {
        System.out.println("getNum1方法--静态属性初始化");
        return 2;
    }

    public int getNum2() {
        System.out.println("getNum2方法--普通属性初始化");
        return 34;
    }
}
