package chapter11.enumeration_;

/**
 * @author H lx
 * @vision 1.0
 * 演示Enum类中各种方法使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season3进行演示，创建一个对象
        Season3 autumn = Season3.AUTUMN;
        //name--得到当前常量名称，建议优先使用toString()
        System.out.println(autumn.name());//AUTUMN
        //ordinal--输出该枚举对象的次序\编号，从0开始编号
        System.out.println(autumn.ordinal());//2(枚举对象是第三)
        //values--（反编译）返回枚举对象数组，含有定义的所有枚举对象
        Season3[] values = Season3.values();
        for (Season3 season: values) {//增强for循环
            System.out.println(season);
        }
        //valueOf--将字符串转换成枚举对象,字符串必须是已有常量名
        Season3 autumn1 = Season3.valueOf("AUTUMN");
//        Season3 autumn2 = Season3.valueOf("AU");//报错
        System.out.println("autumn1 = " + autumn1);//AUTUMN
        //compareTo--比较两个枚举常量的编号
        //返回值return self.ordinal - other.ordinal，即编号差
        System.out.println(Season3.AUTUMN.compareTo(Season3.WINTER));//-1，因为2-3
        System.out.println(Season3.AUTUMN.compareTo(Season3.SPRING));//2，因为2-0

    }
}
enum Season3{
    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷");//使用无参构造器

    private String name;
    private String describe;

    private Season3(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }
    private Season3(){}//无参构造器

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }
}
