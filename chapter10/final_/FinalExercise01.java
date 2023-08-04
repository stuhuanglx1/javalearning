package chapter10.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(2);
        System.out.println(circle1.getArea());
        Circle2 circle2 = new Circle2(20);
        System.out.println(circle2.getArea());
        Circle3 circle3 = new Circle3(200);
        System.out.println(circle3.getArea());
    }
}
class Circle1{
    private double radius;
    private final double PI = 3.14;

    public Circle1() {
    }

    public Circle1(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI * radius * radius;
    }
}
class Circle2{
    private double radius;
    private final double PI;

    public Circle2() {
        PI = 3.14;
    }

    public Circle2(double radius){
        PI = 3.14;
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI * radius * radius;
    }
}
class Circle3{
    private double radius;
    private final double PI;

    {
        PI = 3.14;
    }

    public Circle3() {
    }

    public Circle3(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI * radius * radius;
    }
}
