package chapter10.innerclass_;

public class InnerClassExercise03 {
    public InnerClassExercise03() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }
    class Inner{
        public int a = 5;
    }

    public static void main(String[] args) {
        InnerClassExercise03 i = new InnerClassExercise03();
        Inner r = i.new Inner();
        System.out.println(r.a);
        /*
        输出：
        5
        5
         */

    }
}
