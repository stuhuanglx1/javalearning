package chapter10.single_;

public class SingleTon01 {
    //单例设计模式--饿汉式
    public static void main(String[] args) {
        //通过静态方法获取
        System.out.println("num = " + GirlFriend.num);
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);
        //instance和instance2指向的是同一个实例
    }
}
//对象只能有一个
class GirlFriend{
    private String name;
    public static int num = 0;
    private static GirlFriend girlFriend = new GirlFriend("mary");

    private GirlFriend(String name){
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
