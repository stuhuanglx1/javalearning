package chapter08.poly_;

public class PolyArr {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("p",31);
        persons[1] = new Student("stu1",12,70);
        persons[2] = new Student("stu2",13,99);
        persons[3] = new Teacher("t1",25,9900);
        persons[4] = new Teacher("t2",32,7800);

        //循环遍历，调用say
        for (int i = 0; i < persons.length; i++) {
            System.out.print(persons[i].say() + " ");//动态绑定机制
            if (persons[i] instanceof Student){
                ((Student) persons[i]).study();
            }else if (persons[i] instanceof Teacher){
                ((Teacher) persons[i]).teach();
            }else if (persons[i] instanceof Person){
                System.out.println();
            }else {
                System.out.println("类型有误，请进行检查。。。");
            }
        }

//        //调用Student类中的特有方法
//        Student stu = (Student) persons[1];
//        stu.study();


    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say(){
        return "姓名：" + name + " 年龄：" + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String say() {
        return "学生  " + super.say() + " 成绩：" + score;
    }

    public void study(){
        System.out.println("正在学习 。 。 。");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String say() {
        return "教师  " + super.say() + " 薪水：" + salary;
    }

    public void teach(){
        System.out.println("正在上课 。 。 。");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
