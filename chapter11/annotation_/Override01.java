package chapter11.annotation_;

/**
 * @author H lx
 * @vision 1.0
 * 注解Override
 */
public class Override01 {
    public static void main(String[] args) {

    }
}
class Father{
    public void fly(){
        System.out.println("爸爸飞。。。");
    }
}
class Son extends Father{

    @Override  //注解  放在fly方法前表示子类该方法重写了父类（基类）的该方法
    public void fly() {
        System.out.println("儿子飞");
    }
    /*
    如果没有 @Override修饰，也可以表示重写父类方法
    如果写了 @Override注解，编译器就会去检查该方法是否真的重写了父类方法，此时的确重写了，则编译通过，如果没有构成重写，则编译错误
    --编译进行语法校验
    @interface不是接口，是注解类，jdk5.0后加入
     */

//    @Override//报错
//    public void say(){}
}
