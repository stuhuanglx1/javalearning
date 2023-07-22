package chapter08.homework;

public class Homework05 {
    public static void main(String[] args) {
        Worker05 jack = new Worker05("jack", 10000);
        jack.printSal();
        Farmer05 tom = new Farmer05("tom", 20000);
        tom.setSalMonth(8);
        tom.printSal();
        Waiter05 jimmy = new Waiter05("jimmy", 3000);
        jimmy.printSal();
        Teacher05 steve = new Teacher05("steve", 5000);
        steve.setClassSal(1000);
        steve.setDays(200);
        steve.printSal();
        Scienstist05 mary = new Scienstist05("mary", 8000);
        mary.setBonus(500000);
        mary.printSal();
    }
}
class Employee05{
    private String name;
    private double salary;
    private int salMonth = 12;

    public Employee05(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public void printSal(){
        System.out.println(name + "的全年工资为" + (salary * salMonth));
    }
}
class Worker05 extends Employee05{
    public Worker05(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSal() {
        System.out.print("工人");
        super.printSal();
    }
}
class Farmer05 extends Employee05{
    public Farmer05(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSal() {
        System.out.print("农民");
        super.printSal();
    }
}
class Waiter05 extends Employee05{
    public Waiter05(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSal() {
        System.out.print("服务员");
        super.printSal();
    }
}
class Teacher05 extends Employee05{
    private double classSal;
    private int days;

    public Teacher05(String name, double salary) {
        super(name, salary);
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public void printSal() {
        System.out.println("老师" + getName() + "的全年工资为" + (getSalary() * getSalMonth() + classSal * days));
    }
}
class Scienstist05 extends Employee05{
    private double bonus;

    public Scienstist05(String name, double salary) {
        super(name, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("科学家" + getName() + "的全年工资为" + (getSalary() * getSalMonth() + bonus));
    }
}