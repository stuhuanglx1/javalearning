package chapter10.innerclass_;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer06 outer06 = new Outer06();
        outer06.f1();
        //外部其他类访问成员内部类
        //方法1--new Inner06()看成outer06的成员
        Outer06.Inner06 inner06 = outer06.new Inner06();
        //方法2--在外部类中编写一个方法，可以返回Inner08对象
        Outer06.Inner06 inner06Instance = outer06.getInner06Instance();
        //方法3--类似方法1
        Outer06.Inner06 inner061 = new Outer06().new Inner06();
    }
}
class Outer06{//外部类
    private int num = 10;
    public String name = "tom";

    //注意：成员内部类，是定义在外部类的成员位置
    class Inner06{ //类的修饰符都可以使用
        public int num = 66;
        public void say(){
            //在成员内部类中可以使用外部类的所有成员，包括私有属性
            System.out.println("Inner的num = " + num + " , name = " + name);
            System.out.println("Outer的num = " + Outer06.this.num + " , name = " + name);
        }
    }

    public void f1(){
        //使用成员内部类
        Inner06 inner06 = new Inner06();
        inner06.say();
    }

    //返回成员内部类实例
    public Inner06 getInner06Instance(){
        return new Inner06();
    }
}
