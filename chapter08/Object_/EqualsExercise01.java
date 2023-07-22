package chapter08.Object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        //没有重写equals方法输出false
        Person person1 = new Person("tom", 10, '男');
        Person person2 = new Person("tom", 10, '男');
        System.out.println(person1.equals(person2));//true
        Person person3 = new Person("jia", 10, '男');
        System.out.println(person1.equals(person3));//false

    }
}
class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //重写equals
    public boolean equals(Object obj){
        //如果比较的对象是同一个对象，直接返回true
        if (this == obj){
            return true;
        }
        //类型判断
        if (obj instanceof Person){
            //向下转型
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
