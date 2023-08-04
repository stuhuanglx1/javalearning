package chapter10.innerclass_;

/**
 * 演示局部内部类的使用
 */

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("outer02的hashcode：" + outer02);
    }
}
class Outer02{
    private int n1 = 100;
    private void m2(){
        System.out.println("m2方法");
    }//私有方法

    public void m1(){//方法
        //局部内部类是定义在外部类的局部位置，通常在方法
        class Inner02{//局部内部类(本质仍然是类)

            //7、重名时的解决方法
            private int n1 = 192;

            //可以直接访问外部类的所有成员
            public void f1(){
                System.out.println("内部类的n1 = " + n1);
                System.out.println("外部类的n1 = " + Outer02.this.n1);
                System.out.println("Outer02.this的hashcode：" + Outer02.this);
                m2();//也可以使用私有方法


            }
        }
        //不能添加修饰符，但可以使用final修饰
        final class Inner03{
            //该类无法被继承
        }
        //外部类访问局部内部类：创建对象再调用
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }

    {
        class Inner03{
            //代码块中也可以有局部内部类
        }
    }
}