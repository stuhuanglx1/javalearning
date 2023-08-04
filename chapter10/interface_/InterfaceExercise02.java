package chapter10.interface_;

public class InterfaceExercise02 extends B implements A {
    public static void main(String[] args) {
        new InterfaceExercise02().pX();
    }
    public void pX(){
//        System.out.println(x);//属性x不明确
        //明确x
        //调用接口类的x和父类的x
        System.out.println(A.x + " , " + super.x);
    }
}
interface A{
    int x = 10;//等价于 public static final int x = 0;
}
class B{
    int x = 11;//普通属性
}

