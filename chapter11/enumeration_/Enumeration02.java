package chapter11.enumeration_;

/**
 * @author H lx
 * @vision 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season1.SUMMER);
        System.out.println(Season1.AUTUMN);
        System.out.println(Season1.SPRING);
        System.out.println(Season1.WINTER);
    }
}
/*
season对象的特点：①季节的值是有限的 ②只读，不需要修改
自定义枚举【演示】：
1、将构造器私有化，防止直接被new
2、去掉set方法，防止属性被修改
3、在该类内部直接创建固定的对象
4、优化：加入final修饰符
 */

class Season1{
    private String name;
    private String describe;

    //个人解读：类似饿汉式
    //定义的对象就固定下来了
    public static final Season1 SPRING = new Season1("春天","温暖");
    public static final Season1 SUMMER = new Season1("夏天","炎热");
    public static final Season1 AUTUMN = new Season1("秋天","凉爽");
    public static final Season1 WINTER = new Season1("冬天","寒冷");

    private Season1(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' + ", describe='" + describe;
    }
}
