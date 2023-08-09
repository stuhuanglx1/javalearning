package chapter11.enumeration_;

/**
 * @author H lx
 * @vision 1.0
 */
public class Enumeration03 {
    //enum关键字实现枚举
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
    }
}
//演示使用enum关键字实现枚举类
/*
1、使用enum代替class
2、public static final Season2 SPRING = new Season2("春天","温暖");用SPRING("春天","温暖");代替
3、如果有多个常量，使用,间隔
4、如果使用enum关键字进行枚举，需要将定义的常量对象写在最前面
 */
enum Season2{

//    //定义的对象就固定下来了
//    public static final Season2 SPRING = new Season2("春天","温暖");
//    public static final Season2 SUMMER = new Season2("夏天","炎热");
//    public static final Season2 AUTUMN = new Season2("秋天","凉爽");
//    public static final Season2 WINTER = new Season2("冬天","寒冷");
    //如果使用enum关键字来实现枚举类，可以直接用以下方法进行枚举
    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷"),
    WHAT(),HOW;//使用无参构造器

    private String name;
    private String describe;

    private Season2(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }
    private Season2(){}//无参构造器

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

