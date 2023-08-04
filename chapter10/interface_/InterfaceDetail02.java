package chapter10.interface_;

public class InterfaceDetail02 {

    public static void main(String[] args) {
        //接口中的属性public static final
        System.out.println(AAA.n1);//能通过接口类进行访问，是静态属性static
//        AAA.n1 = 30;//报错，n1不能被赋值，是final

    }
}

interface AAA{
    //接口中的属性都是final，且是public static final修饰的
    int n1 = 10;//==>public static final int n1 = 10;
    //属性的修饰改成protected和private都会报错，n1在其他包也能使用，证明是public
    void hi();
}
interface BBB{
    void say();
}
interface CCC{}
//一个类可以实现多个接口
class Pig implements AAA,BBB,CCC{
    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}
//（8）接口不能继承别的类，但可以继承多个别的接口
interface DDD extends AAA,BBB{}