package chapter10.homework;

/**
 * @author H lx
 * @vision 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new ICalculator() {
            @Override
            public double work(double n1, double n2) {
                System.out.println("计算n1+n2的值");
                return n1 + n2;
            }
        },4,66);
        cellphone.testWork(new ICalculator() {
            @Override
            public double work(double n1, double n2) {
                System.out.println("计算n1×n2的值");
                return n1 * n2;
            }
        },4,66);
    }
}
interface ICalculator{
    public double work(double n1,double n2);
}
class Cellphone {

    public void testWork(ICalculator i,double n1,double n2){
        double res = i.work(n1,n2);
        System.out.println("计算后的结果是" + res);

    }
}
