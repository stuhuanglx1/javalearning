package chapter10.innerclass_;

//    经典使用场景：当作实参直接传参，间接高效

public class InnerClassExercise01 {
    public static void main(String[] args) {
        /*
        传统方法：  -- 硬编码（编程领域）
        1、创建一个类，实现接口IL（重写方法）
        2、new一个对象
        3、再调用方法
         */
        f1(new IL(){
            @Override
            public void show() {
                System.out.println("这是一幅名画");
            }
        });
    }
    //静态方法
    public static void f1(IL il){
        il.show();
    }

}
interface IL{
    void show();
}
