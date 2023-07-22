package chapter08.extend_;
//子类
public class Sub extends Base{
    public Sub(){
//        super();//默认调用父类的无参构造器，写和不写都存在
        super("smith");
        System.out.println("Sub构造器");
    }
    public Sub(String name){
        super("tom");
        System.out.println("Sub(String name)构造器被调用。。。");
    }
    public void sayOK(){
        //子类的特有方法
        //在子类可以调用非私有属性 此时n4就不可以使用
        System.out.println(n1 + " " + n2 + " " + n3);
        //在子类可以调用非私有方法 此时test400就不可以使用
        test100();
        test200();
        test300();
//        test400();  //无法访问，没有访问权限
        //通过父类的公共方法去访问
        System.out.println("n4=" + getN4());
        call400();
    }
}
