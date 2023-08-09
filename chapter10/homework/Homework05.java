package chapter10.homework;

/**
 * @author H lx
 * @vision 1.0
 * 编程题：内部类测试题
 */
public class Homework05 {
    public static void main(String[] args) {
        new A();
    }
}
class A{
    private String name = "tracy";
    public A() {
        class B{
            private String name = "nancy";
            public void show(){
                System.out.println("B.name = " + name);
                System.out.println("A.name = " + A.this.name);
            }
        }
        new B().show();
    }
}
