package chapter10.innerclass_;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.m1();
        //外部其他类访问内部类
        //方式1  --静态内部类可以直接通过类名访问（访问权限范围内）
        Outer08.Inner inner = new Outer08.Inner();
        inner.say();
        //方式2
        Outer08.Inner innerInstance = outer08.getInnerInstance();
        System.out.println("=======");
        innerInstance.say();

        //将get方法变成静态方法，就可以直接使用类名调用范围
        Outer08.Inner innerInstance_ = Outer08.getInnerInstance_();
        System.out.println("========");
        innerInstance_.say();
    }
}
class Outer08{
    private static int num = 999;
    private String name = "jessica";
    private static int age = 29;
    static class Inner{//静态内部类
        //可以增加任意的修饰符（四个任选）
        /*
        1、外部类的成员位置
        2、static关键词修饰
         */
        private static int age = 89;
        public void say(){
            //静态内部类方法不能访问非静态成员
//            System.out.println(name);
            System.out.println(num);
            hi();
//            ok();
            System.out.println("Inner的age = " + age);
            System.out.println("Outer的age = " + Outer08.age);
        }
    }
    public static void hi(){}
    public void ok(){}
    public void m1(){
        Inner inner = new Inner();
        inner.say();
    }
    public void show(){
        //外部类使用内部类
        new Inner().say();
    }

    //获得内部类实例
    public Inner getInnerInstance(){
        return new Inner();
    }
    public static Inner getInnerInstance_(){
        return new Inner();
    }
}
