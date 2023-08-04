package chapter10.abstract_;

public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calTime();
        BB bb = new BB();
        bb.calTime();
    }
}
abstract class Calculator{
    public void calTime(){
        //得到开始时间
        long start = System.currentTimeMillis();

        job();//动态绑定机制

        //得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("持续时间：" + (end - start) + "毫秒");
    }
    public abstract void job();
}
class AA extends Calculator{
    //计算任务
    public void job(){//实现父类的抽象方法，重写了job方法
        //得到开始时间
//        long start = System.currentTimeMillis();

        System.out.println("累加");
        int sum = 0;
        for (int i = 0; i <= 100000; i++) {
            sum += i;
        }

        //得到结束时间
//        long end = System.currentTimeMillis();
//        System.out.println("持续时间：" + (end - start) + "毫秒");
    }

}
class BB extends Calculator{
    //计算任务
    public void job(){//实现父类的抽象方法，重写了job方法
        //得到开始时间
//        long start = System.currentTimeMillis();

        System.out.println("累乘");
        long mul = 1;
        for (int i = 0; i <= 100000; i++) {
            mul *= i;
        }

        //得到结束时间
//        long end = System.currentTimeMillis();
//        System.out.println("持续时间：" + (end - start) + "毫秒");
    }
}
