package chapter10.homework;

/**
 * @author H lx
 * @vision 1.0
 * 编程题：内部类
 */
public class Homework07 {
    public static void main(String[] args) {
        Car7 car7 = new Car7(39);
        car7.new Air().flow();
        car7.setTemperature(51);
        car7.new Air().flow();
    }
}
class Car7{
    private double temperature;

    public Car7(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if (temperature > 40){
                System.out.println("温度高于40℃，吹冷气");
            }else if (temperature < 0){
                System.out.println("温度低于0℃，吹暖气");
            }else {
                System.out.println("温度合适，关掉空调");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
