package chapter08.homework;

public class Homework10 {
    public static void main(String[] args) {
        Doctor10 doctor1 = new Doctor10("do", 45, "主任医师", '男', 10000);
        Doctor10 doctor2 = new Doctor10("do", 45, "主任医师", '男', 10000);
        System.out.println(doctor1.equals(doctor2));//true
        Doctor10 doctor3 = new Doctor10("do", 45, "主任医师", '男', 10000);
        Doctor10 doctor4 = new Doctor10("do", 34, "主任医师", '男', 10000);
        System.out.println(doctor1.equals(doctor2));//false
    }
}
class Doctor10{
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor10(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (! (o instanceof Doctor10)) {
            return false;
        }
        Doctor10 doctor10 = (Doctor10) o;
        return age == doctor10.age && gender == doctor10.gender &&
                sal == doctor10.sal && name.equals(doctor10.name) &&
                job.equals(doctor10.job);
    }

}
