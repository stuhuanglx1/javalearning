package chapter08.poly_.PolyDetail;

public class detail02 {
    public static void main(String[] args) {
        //属性不重写，属性看编译类型
        Base b = new Sub();
        System.out.println(b.count);//10
        System.out.println(b.name);//base
        //属性结果和父类（编译类型）一致

        //instaceOf使用--判断对象的运行类型是否是xx类型或xx类型的子类
        Sub sub = new Sub();
        System.out.println(sub instanceof Sub);//true
        System.out.println(sub instanceof Base);//true

        System.out.println(b instanceof Sub);//true
        System.out.println(b instanceof Base);//true

        Object obj = new Object();
        System.out.println(obj instanceof Base);//false
        String str = new String();
        System.out.println(str instanceof Object);//true

    }
}
class Base{
    int count = 10;
    String name = "base";
}
class Sub extends Base{
    int count = 20;
    String name = "sub";
}
