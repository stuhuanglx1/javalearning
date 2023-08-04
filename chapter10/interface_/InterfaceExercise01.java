package chapter10.interface_;


public class InterfaceExercise01 {
    public static void main(String[] args) {
        B01 b01 = new B01();
        System.out.println(b01.a);//ok
        System.out.println(A01.a);//ok
        System.out.println(B01.a);//ok
    }
}
interface A01{
    int a = 12;
}
class B01 implements A01{

}
