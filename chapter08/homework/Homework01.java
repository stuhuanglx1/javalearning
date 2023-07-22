package chapter08.homework;

public class Homework01 {
    public static void main(String[] args) {
        Person01 person01 = new Person01("p1", 34, "程序员");
        Person01 person02 = new Person01("p2", 28, "hr");
        Person01 person03 = new Person01("p3", 25, "经理");
        Person01[] persons = {person01,person02,person03};
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }
        System.out.println("=======================");
        persons = person01.sortAge(persons);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }
    }
}
class Person01{
    private String name;
    private int age;
    private String job;

    public Person01(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public Person01[] sortAge(Person01[] p){
        Person01 temp = null;//临时变量，用于交换
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - i - 1; j++) {
                //按照age从小到大排序
                if (p[j].getAge() > p[j + 1].getAge()){
                    temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
//                //按照name长度从小到大排序
//                if (p[j].getName().length() > p[j + 1].getName().length()){
//                    temp = p[j];
//                    p[j] = p[j + 1];
//                    p[j + 1] = temp;
//                }
            }
        }
        return p;
    }

    @Override
    public String toString() {
        return "Person01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
