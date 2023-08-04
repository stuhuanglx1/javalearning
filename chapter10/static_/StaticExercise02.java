package chapter10.static_;

public class StaticExercise02 {
    public static void main(String[] args) {
        System.out.println("Number of total is" + Person.getTotalPerson());//0
        Person person = new Person();
        System.out.println("Number of total is" + Person.getTotalPerson());//1
    }

}
class Person{
    private int id;
    private static int total = 0;
    public static int getTotalPerson(){
//        id++;//静态方法中不能使用非静态属性
        return total;
    }

    public Person() {
        total++;
        id = total;
    }
}
