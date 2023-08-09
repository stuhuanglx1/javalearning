package chapter10.homework;

/**
 * @author H lx
 * @vision 1.0
 * 编程题
 */
public class Homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧",new Horse());
        tang.coming();
        tang.passRiver();
        tang.passRiver();
        tang.coming();
        tang.passMountain();
    }
}
interface Vehicles{
    public void work();
}
class Plane implements Vehicles{
    @Override
    public void work() {
        System.out.println("乘坐飞机");
    }
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("骑马");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("划船");
    }
}
class VehicleCompany{

    public static Horse horse = new Horse();
    private VehicleCompany(){}

    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Plane getPlane(){
        return new Plane();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;
//在创建对象时，会自动分配交通工具
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    //过河，划船
    public void passRiver(){
        if (!(vehicles instanceof Boat)){
            vehicles = VehicleCompany.getBoat();
        }
        vehicles.work();
    }
    //过火焰山，坐飞机
    public void passMountain(){
        if (!(vehicles instanceof Plane)){
            vehicles = VehicleCompany.getPlane();
        }
        vehicles.work();
    }
    //一般情况下，赶路，骑马
    public void coming(){
        if (!(vehicles instanceof Horse)){
            vehicles = VehicleCompany.getHorse();
        }
        vehicles.work();
    }
}
