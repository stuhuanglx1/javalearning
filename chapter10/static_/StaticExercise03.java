package chapter10.static_;

public class StaticExercise03 {
    public static void main(String[] args) {
        Person03.setTotalPerson(3);//3
        Person03.showTotal();
        new Person03();
        Person03.showTotal();//此时total=4
        new Person03();
        Person03.showTotal();//此时total=5
    }
}
class Person03{
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total){
//        this.total = total;//报错，静态方法中不能使用this关键字
        Person03.total = total;
    }
    public Person03(){
        total++;
        id = total;
    }
    public static void showTotal(){
        System.out.println("total = " + total);
    }
}
