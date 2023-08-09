package chapter11.annotation_;

/**
 * @author H lx
 * @vision 1.0
 */
public class Deprecated01 {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.num);

    }
}

//该类过时，但过时不代表不能使用
@Deprecated
class A{
    @Deprecated
    public int num = 10;
    @Deprecated
    public void hi(){

    }
}
