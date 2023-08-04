package chapter10.codeblock;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new B04();
        /*
        getN1--A04
        A04的静态代码块
        getN3--B04
        B04的静态代码块
        A04的普通代码块
        getN2--A04
        A02的构造器
        B04的普通代码块
        getN4--B04
        B02的构造器
         */
        //就算属性初始化方法构成重写，按照继承的查找规则进行查找就好
    }
}
class A04{
    private static int n1 = getN1();
    static {
        System.out.println("A04的静态代码块");//②
    }
    {
        System.out.println("A04的普通代码块");//⑤
    }
    public int n2 = getN2();
    public static int getN1(){
        System.out.println("getN1--A04");//①
        return 10;
    }

    public int getN2() {
        System.out.println("getN2--A04");//⑥
        return 20;
    }

    public A04(){
        System.out.println("A02的构造器");//⑦
    }
}
class B04 extends A04{
    private static int n1 = getN1();
    static {
        System.out.println("B04的静态代码块");//④
    }
    {
        System.out.println("B04的普通代码块");//⑧
    }
    public int n2 = getN2();
    public static int getN1(){
        System.out.println("getN1--B04");//③
        return 10;
    }

    public int getN2() {
        System.out.println("getN2--B04");//⑨
        return 20;
    }

    public B04(){
        System.out.println("B02的构造器");//⑩
    }

}
