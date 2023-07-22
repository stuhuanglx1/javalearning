package chapter08.poly_.exercise_;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);//20  访问属性看编译类型
        s.display();//20
        Base b = s;//向上转型
        System.out.println(b == s);//true  编译类型相同，地址相同，指向一个空间
        System.out.println(b.count);//10  访问属性看编译类型
        b.display();//20  b的运行类型是Sub
    }
}
class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}
class Sub extends Base{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}
