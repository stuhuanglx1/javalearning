package chapter08.homework;

public class Homework11 {
    public static void main(String[] args) {
        Person11 p = new Student11();
        p.eat();//person eat
        p.run();//student run

        Student11 p1 = (Student11) p;
        p1.run();//student run
        p1.eat();//person eat
        p1.study();//person study...
    }
}
class Person11{
    public void run(){
        System.out.println("person run");
    }
    public void eat(){
        System.out.println("person eat");
    }
}
class Student11 extends Person11{
    public void run(){
        System.out.println("student run");
    }
    public void study(){
        System.out.println("student study...");
    }
}
