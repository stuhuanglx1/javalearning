package chapter10.innerclass_;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        /*
        解读：
        1、传递的是实现了Bell接口的匿名内部类
        2、重写了ring方法
        3、Bell中alarmclock方法的参数列表中中的形参bell接受了匿名内部类
        总结：创建了匿名内部类并创建了实例
         */
        cellphone.alarmcolck(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了。。。");
            }
        });
        cellphone.alarmcolck(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
interface Bell{
    void ring();
}
class Cellphone{
    public void alarmcolck(Bell bell){
        bell.ring();
    }
}
