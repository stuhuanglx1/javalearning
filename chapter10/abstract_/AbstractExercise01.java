package chapter10.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        //题1：abstract final class A{}能通过编译吗？
        /*
        不能，不能和final关键字一起用，无法重写
         */

        //题2：abstract public static void test1();能通过编译吗？
        /*
        不能，不能和static关键字一起用，无法重写
         */

        //题3：abstract private void test3();能通过编译吗？
        /*
        不能，不能和private关键字一起用，无法重写
         */

        //题4：编程题--oop+抽象类
        CommonEmployee commonEmployee = new CommonEmployee("张三", "111", 3000);
        Manager manager = new Manager("李四", "007", 3500, 20000);
        Manager manager2 = new Manager("王五", "008", 7500);
        commonEmployee.work();
        manager.work();
        manager2.setBonus(4000);
        manager2.work();

    }
}

abstract class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public Manager(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

class CommonEmployee extends Employee {

    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "工作中");
    }
}
