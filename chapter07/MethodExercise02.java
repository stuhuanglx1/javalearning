package chapter07;

public class MethodExercise02 {
    public static void main(String[] args){
        //编写一个copyP的方法，可以复制一个Person3对象--克隆对象
        /*
        编写思路：
        1、方法返回类型：Person3
        2、方法名字：copyP
        3、方法形参：Person3 p
        4、方法体：创建一个新对象，并复制属性，并返回
         */

        Person3 p = new Person3();
        p.age = 30;
        p.name = "xiaohaung";

        MyTools tools = new MyTools();
        Person3 p2 = tools.copyP(p);
        p.name = "9";//克隆的String变量的地址不同
        System.out.println("p的属性  " + p.name + " ," + p.age);
        System.out.println("p2的属性  " + p2.name + " ," + p2.age);

        System.out.println(p + " \n" + p2);//p和p2地址不同

    }
}

class MyTools{
    public void printArr(int[][] a){
        for (int i = 0;i < a.length;i++){
            for (int j = 0;j < a[i].length;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Person3 copyP(Person3 p){
        Person3 pp = new Person3();
        pp.name = p.name;
        pp.age = p.age;
        return pp;
    }
}

class Person3{
    String name;
    int age;

}
