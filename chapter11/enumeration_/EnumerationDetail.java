package chapter11.enumeration_;

/**
 * @author H lx
 * @vision 1.0
 */
public class EnumerationDetail {
    public static void main(String[] args) {
        Music.KPOP.playing();
    }
}
//①不能继承其他类
//enum Season4 extends A1 {//不能写extends，不能继承
//
//}
//class A1{}
//②可以实现接口
interface IPlay{
    public void playing();
}
enum Music implements IPlay{
    CLASSIC,KPOP;

    @Override
    public void playing() {
        System.out.println("播放音乐。。");
    }
}
