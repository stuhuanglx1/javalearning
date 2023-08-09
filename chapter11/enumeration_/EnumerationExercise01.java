package chapter11.enumeration_;

/**
 * @author H lx
 * @vision 1.0
 * 练习题
 * 声明枚举类Week，包含周一-周日的定义
 * 使用values返回枚举数组
 */
public class EnumerationExercise01 {
    public static void main(String[] args) {
        System.out.println("===所有星期的信息如下===");
        for(Week week : Week.values()){
            System.out.println(week);
        }
    }
}
enum Week{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天");

    private String name;

    private Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

