package chapter10.interface_.interface01;

public class Interface01 {
    //接口的快速入门
    public static void main(String[] args) {
        //创建手机、相机对象
        Phone phone = new Phone();
        Camera camera = new Camera();
        //创建计算机
        Computer computer = new Computer();
        //把手机、相机接入到计算机
        computer.work(phone);
        System.out.println("=================");
        computer.work(camera);
    }
}
