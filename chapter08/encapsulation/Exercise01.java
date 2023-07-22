package chapter08.encapsulation;

public class Exercise01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("SetAndGet");
        p1.setAge(123);
        p1.setSalary(3400);
        System.out.println(p1.info());

        //使用构造器指定属性--不受set判断限制--我们可以将set方法写在构造器中
        System.out.println("=========================================");
        Person coco = new Person("coco", 345, 9870);
        System.out.println(coco.info());
    }
}

class Person{
    public String name;
    private int age;
    private double salary;

    //封装与构造器

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    //用快捷键alt+insert加载get,set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6){
            this.name = name;
        } else {
            System.out.println("名字长度不对，不在2-6字符范围内，给予一个默认名字");
            this.name = "好人";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120){
            this.age = age;
        }else {
            System.out.println("输入年龄有误，年龄需要在1-120之间，给一个默认年龄20");
            this.age = 20;//给一个默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        //可以在这增加一个权限，密码啥
        this.salary = salary;
    }

    public String info(){
        return "信息为 name=" + name + " age=" + age + " salary=" + salary;
    }
}