package chapter08.homework;

public class Homework09 {
    public static void main(String[] args) {
        new LabeledPoint09("Black Sea",200,30);
    }
}
class Point09{
    private double x;
    private double y;

    public Point09(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
class LabeledPoint09 extends Point09{
    private String label;

    public LabeledPoint09(String label , double x, double y) {
        super(x, y);
        this.label = label;
    }

}
