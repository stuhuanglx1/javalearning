package chapter11.enumeration_;

public class Enumeration01 {
    //枚举的快速导入
    public static void main(String[] args) {
        Season spring = new Season("春天", "温暖");
        Season summer = new Season("夏天", "炎热");
        Season autumn = new Season("秋天", "凉爽");
        Season winter = new Season("冬天", "寒冷");
        //对于季节而言，是固定的四个季节，不会有更多
        //现在的设计方案的思路不能体现季节是固定的四个季节，不好 ==> 枚举类（一个个列举）
        autumn.setDescribe("很热");
        Season other = new Season("红天", "~~");
    }
}
//创建季节对象
/*
season对象的特点：①季节的值是有限的 ②只读，不需要修改
 */
class Season{
    private String name;
    private String describe;

    public Season(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", describe='" + describe + '\'';
    }
}