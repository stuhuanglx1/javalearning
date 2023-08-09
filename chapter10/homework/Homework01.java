package chapter10.homework;

/**
 * @author H lx
 * @vision 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        Car c = new Car();
        Car c1 = new Car(100);
        System.out.println(c);//9.0 red
        System.out.println(c1);//100.0 red  解释：类变量是所有类对象共享，静态变量只会在类加载时初始化一次
    }
}
class Car{
    double price = 10;
    static String color = "white";

    @Override
    public String toString() {
        return price + "\t" + color;
    }

    public Car(){
        this.price = 9;
        this.color = "red";
    }

    public Car(double price) {
        this.price = price;
    }
}
