package chapter08.poly_;

public class PolyParameter {
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e){
        if (e instanceof Manager){
            ((Manager)e).manage();
        }else if (e instanceof Worker){
            ((Worker)e).work();
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Worker("打工人1", 3000);
        employees[1] = new Worker("打工人1", 2000);
        employees[2] = new Worker("打工人1", 4000);
        employees[3] = new Worker("打工人1", 7000);
        employees[4] = new Manager("资本家的狗", 12000, 200000);

        PolyParameter polyParameter = new PolyParameter();
        for (int i = 0; i < employees.length; i++) {
            polyParameter.testWork(employees[i]);
            polyParameter.showEmpAnnual(employees[i]);
        }

    }

}
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getAnnual(){
        return 12 * salary;
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
}
class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.print("普通员工 " + getName() + "努力工作，干掉经理，继承公司    年薪：");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.print("经理    " + getName() + "管理员工，实现年薪百万，欧耶    年薪：");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
