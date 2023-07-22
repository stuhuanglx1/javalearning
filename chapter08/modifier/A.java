package chapter08.modifier;

public class A {
    //四个修饰符
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    //本类可以访问四个属性
    public void m1(){
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println("n3=" + n3);
        System.out.println("n4=" + n4);
    }
    protected void m2(){}
    void m3(){}
    private void m4(){}
}
