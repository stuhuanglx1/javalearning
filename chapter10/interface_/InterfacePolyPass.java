package chapter10.interface_;

public class InterfacePolyPass {
    //接口 -- 演示多态传递现象
    public static void main(String[] args) {
        IG ig = new Teacher();
        //多态传递
        IH ih = new Teacher();//若IG没有继承IH，则并没有实现多态这个接口，会报错


    }
}
interface IH{
}
interface IG extends IH{
}
class Teacher implements IG{}