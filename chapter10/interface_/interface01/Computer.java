package chapter10.interface_.interface01;

public class Computer {
    public void work(USBinterface usbinterface){
        //规定相关接口的规范
        usbinterface.start();
        usbinterface.stop();
    }
}
