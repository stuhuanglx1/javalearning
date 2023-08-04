package chapter10.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        //接口多态--参数多态（类似向上转型） ==>可以指向实现了IF接口的对象实例
        IF if01 = new Car();
        if01 = new Monster();
        IF if02 = new Monster();

        //继承的多态
        FF f01 = new HH();
        f01 = new II();

    }
}
interface IF{}
class Car implements IF{}
class Monster implements IF{}

class FF{}
class HH extends FF{}
class II extends FF{}