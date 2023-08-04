package chapter10.interface_.interface01;

//Phone实现USB接口
//Phone类需要实现USBinterface接口 规定\声明 的方法
public class Phone implements USBinterface {
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
