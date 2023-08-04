package chapter10.innerclass_;

public class InnerClass01 {//外部其他类
    //内部类的快速入门
}
class Outer{//外部类
    private int n1 = 100;//属性

    public Outer(int n1) {
        this.n1 = n1;
    }

    public void m1(){//方法
        System.out.println("m1()");
        Inner inner = new Inner();
        inner.hi();
    }

    {
        System.out.println("Outer代码块");
    }


    class Inner{//内部类
        public void hi(){
            System.out.println("hi...");
        }
    }
}
