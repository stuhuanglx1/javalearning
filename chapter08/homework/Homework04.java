package chapter08.homework;

//通过继承实现员工工资核算打印功能

public class Homework04 {
    public static void main(String[] args) {

        Worker04 w1 = new Worker04("小二", 100, 28, 1.0);
        w1.printSal();
        Manager04 m1 = new Manager04("大富翁", 200, 20, 1.2);
        m1.setBonus(1000);
        m1.printSal();
    }
}
class Employee04{
    private String name;
    private double salary;
    private int workDays;
    private double grade;

    public Employee04(String name, double salary, int workDays, double grade) {
        this.name = name;
        this.salary = salary;
        this.workDays = workDays;
        this.grade = grade;
    }
    public void printSal(){
        System.out.println(name + "的本月工资是" + salary * workDays * grade);
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

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
class Worker04 extends Employee04{
    public Worker04(String name, double salary, int workDays, double grade) {
        super(name, salary, workDays, grade);
    }

    @Override
    public void printSal() {
        System.out.print("普通员工");
        super.printSal();
    }
}
class Manager04 extends Employee04{
    private double bonus;

    public Manager04(String name, double salary, int workDays, double grade) {
        super(name, salary, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("经理" + getName() + "的本月工资是" + (bonus + getSalary() * getWorkDays() * getGrade()));
    }
}

