package chapter07;

public class overload {
    //Java中允许同一个类中，有多个同名方法的存在，但形参列表不一致
    public static void main(String[] args){

        //overload01--方法名相同\形参列表必须不同\返回类型没有要求
        System.out.println();
        System.out.println(100);
        System.out.println("hello world");
        System.out.println('h');
        System.out.println(true);
        //重载的好处：减轻了起名、记名的麻烦，方便；利于接口编程
        MyCalculator1 mc = new MyCalculator1();
        System.out.println(mc.sum(1,2));//形参列表为int,int
        System.out.println(mc.sum(1.0,2));//形参列表为double,int
        System.out.println(mc.sum(1,2.0));//形参列表为int,double
        System.out.println(mc.sum(1,2,4));//形参列表为int,int,int
        //注意：区别重载和方法的重复定义
        /*课堂练习：
        1、判断题：与void show(int a,char b,double c){}构成重载的有：b,c,d,e
        a)void show(int x,char y,double z){} -->错误，属于方法的重复定义（形参名不同）
        b)int show(int a,double c,char b){}  -->正确，形参列表不同
        c)void show(int a,double c,char b){}  -->正确，形参列表不同
        d)boolean show(int c,char b){}  -->正确，形参个数不同
        e)void show(double c){}  -->正确，形参个数不同
        f)double show(int a,char y,double z){}  -->错误，完全相同
        g)void shows(){}  -->错误，另一个方法，不是方法重载
         */
        //方法的重载--练习1
        mc.m(2);
        mc.m(2,5);
        mc.m("78");
        //方法的重载--练习2
        System.out.println("max(int n1,int n2)的结果：" + mc.max(2,4));//4
        System.out.println("max(double n1,double n2)的结果：" + mc.max(2,1.5));//2.0
        System.out.println("max(double n1,double n2,double n3)的结果：" + mc.max(2.4,6,1.5));//6.0


    }


}
class MyCalculator1{
    public int sum(int n1,int n2){
        return n1 + n2;
    }
    public double sum(int n1,double n2){
        return n1 + n2;
    }
    public double sum(double n1,int n2){
        return n1 + n2;
    }
    public int sum(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }

    //方法的重载--练习1
    public void m(int n1){
        System.out.println("m(int n1)方法的结果：" + Math.pow(n1,2));
    }
    public void m(int n1,int n2){
        System.out.println("m(int n1,int n2)方法的结果：" + n1 * n2);
    }
    public void m(String n1){
        System.out.println("m(String n1)方法的结果：" + n1);
    }

    //方法的重载--练习2
    public int max(int n1,int n2){
        return n1 > n2 ? n1 : n2;
    }
    public double max(double n1,double n2){
        return n1 > n2 ? n1 : n2;
    }
    public double max(double n1,double n2,double n3){
        return (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
    }
}
