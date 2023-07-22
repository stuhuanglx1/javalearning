package chapter08.homework.Homework13;

public class Homework13 {
    public static void main(String[] args) {
        Person13[] persons = new Person13[4];
        persons[0] = new Student13("小花", '女', 12, "2020112");
        persons[1] = new Student13("小李", '男', 11, "2020113");
        persons[2] = new Teacher13("黄老师", '男', 35, 10);
        persons[3] = new Teacher13("美美老师", '女', 25, 3);


        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }
        System.out.println("===================================");
        Homework13 homework = new Homework13();
        persons = homework.sortAge(persons);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
            homework.f(persons[i]);
        }

    }

    public Person13[] sortAge(Person13[] p){
        Person13 temp = null;
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[j].getAge() > p[j + 1].getAge()){
                    temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
        return p;
    }

    public void f(Person13 pp) {
        if (pp instanceof Student13) {
            ((Student13) pp).study();
        } else if (pp instanceof Teacher13) {
            ((Teacher13) pp).teach();
        } else {
            System.out.println("nothing...");
        }
    }
}



