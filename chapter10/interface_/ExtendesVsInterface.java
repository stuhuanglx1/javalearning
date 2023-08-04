package chapter10.interface_;

public class ExtendesVsInterface {
    public static void main(String[] args) {
        LittleMonkey wuKong = new LittleMonkey("悟空");
        wuKong.climbing();
        wuKong.fly();
        wuKong.swimming();
    }
}
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name + "会爬树");
    }

    public String getName() {
        return name;
    }
}
//继承 -- 子类继承父类，就自动拥有父类的功能
class LittleMonkey extends Monkey implements Fish,Bird{
    public LittleMonkey(String name) {
        super(name);
    }


    @Override
    public void fly() {
        System.out.println("通过学习，" + getName() + "能像鸟一样飞");
    }

    @Override
    public void swimming() {
        System.out.println("通过学习，" + getName() + "能像鱼一样游泳");
    }
}
//接口 -- 如果子类需要扩展功能，可以通过实现接口的方式扩展
//java单继承的补充
interface Bird{
    void fly();
}
interface Fish{
    void swimming();
}
