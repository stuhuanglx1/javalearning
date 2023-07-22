package chapter08.extend_;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

//    public Base(){
//        System.out.println("Base无参构造器。。。。。");
//    }
    public Base(String name){
        System.out.println("Base(String name)构造器。。。。。");
    }
    //父类提供公共方法
    public int getN4(){
        return n4;
    }
    public void call400(){
        test400();
    }
    public void test100(){
        System.out.println("test100...");
    }
    protected void test200(){
        System.out.println("test200...");
    }
    void test300(){
        System.out.println("test300...");
    }
    private void test400(){
        System.out.println("test400...");
    }

}
