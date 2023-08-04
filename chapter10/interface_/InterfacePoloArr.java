package chapter10.interface_;

public class InterfacePoloArr {
    public static void main(String[] args) {
        //多态数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new MyPhone();
        usbs[1] = new MyCamera();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if (usbs[i] instanceof MyPhone){
                ((MyPhone) usbs[i]).call();
            }
        }
    }
}
interface Usb{
    void work();
}
class MyPhone implements Usb{
    public void call(){
        System.out.println("手机可以打电话");
    }

    @Override
    public void work() {
        System.out.println("手机工作中");
    }
}
class MyCamera implements Usb{
    @Override
    public void work() {
        System.out.println("相机工作中");
    }
}
