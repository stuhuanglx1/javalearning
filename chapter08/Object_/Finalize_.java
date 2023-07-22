package chapter08.Object_;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        //没有任何引用，变成垃圾-->回收（销毁）对象  释放堆空间
        //可重写方法，实现业务逻辑；不重写，则调用Object类的finalize
        bmw = null;  //不是马上回收
        System.gc();//主动调用垃圾回收器
        System.out.println("程序结束。。。");
        /*
        程序结束。。。
        销毁汽车宝马
        释放空间
         */
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }
    //重写finalize
    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁汽车" + name);
        System.out.println("释放空间");
    }
}
