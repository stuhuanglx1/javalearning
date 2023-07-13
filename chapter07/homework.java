package chapter07;

import java.util.Random;
import java.util.Scanner;

public class homework {
    public static void main(String[] args){

        //homework01--求最大值
        System.out.println("作业01==================");
        A01 a01 = new A01();
        double[] arr01 = {1.1,6.7,89.8,343,4.2,-2.3};
        Double res01 = a01.max(arr01);
        if (res01 != null){
            System.out.println("a01的最大值：" + res01);
        }else {
            System.out.println("a01输入有误");
        }

        //homework02--考察默认值
        System.out.println("作业02==================");
        A02 a02 = new A02();
        String[] strs02 = {"c","hello","23","45"};
        String s02 = "23";
        int i02 = a02.find(strs02,s02);
        if (i02 == -1){
            System.out.println("没有在strs02字符串数组找到" + s02);
        }else {
            System.out.println(s02 + "在str02字符串数组中的下标索引为" + i02);
        }

        //homework03
        System.out.println("作业03==================");
        Book b03 = new Book("好书",145);
        b03.printInfo();
        System.out.println("价格更新后：");
        b03.updataPrice();
        b03.printInfo();

        //homework04
        System.out.println("作业04==================");
        A04 a04 = new A04();
        double[] arr04 = {3.2,5.4};
        double[] arr04New = a04.copyArr(arr04);
        for (int i = 0;i < arr04New.length;i++){
            System.out.print(arr04New[i] + "\t");
        }

        //homework05
        System.out.println("\n作业05==================");
        Circle c05 = new Circle(9);
        System.out.println("周长为" + c05.len());
        System.out.println("面积为" + c05.area());

        //homework06
        System.out.println("作业06==================");
        Cale c06 = new Cale(23,6);
        System.out.println("和为" + c06.sum());
        System.out.println("差为" + c06.minus());
        System.out.println("乘积为" + c06.mul());
        if (c06.div() == null){
            System.out.println("除数为0，不符合除法要求");
        }else {
            System.out.println("商为" + c06.div());
        }

        //homework07
        System.out.println("作业07==================");
        A07 a07 = new A07("大黄","五彩斑斓的黑",5);
        a07.show();

        //homework08
        System.out.println("作业08==================");
        new A08().count1();  //输出 count1 = 10  ==>这个对象称为匿名对象，只使用一次
        A08 a08 = new A08();
        a08.count2();  //输出 count2 = 9
        a08.count2();  //输出 count2 = 10
        System.out.println("此时count = " + a08.count);//count = 11

        //homework09
        System.out.println("作业09==================");
        Music m09 = new Music("not shy",2.3);
        m09.play();
        System.out.println(m09.getInfo());

        //homework10
        System.out.println("作业10==================");
        A10 a101 = new A10();
        A10 a102 = a101;
        a102.m();  //输出为 i = 101  j = 100
        System.out.println(a101.i);  //101
        System.out.println(a102.i);  //101

        //homework11
        System.out.println("作业11==================");
//        public double m(double num1,double num2){
//            return 0;
//        }

        //homework12
        System.out.println("作业12==================");
        new A12("huang",'女',10,"无业游民",20.0);

        //homework13--将对象作为参数传递给方法
        System.out.println("作业13==================");
        Circle13 c13 = new Circle13();
        Object13 o13 = new Object13();
        o13.printAreas(c13,4);

        //homework14
        System.out.println("作业14==================");
        A14 a14 = new A14();
        Scanner myScanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入你想输入的值：（0石头 1剪刀 2布）");
            int n = myScanner.nextInt();
            if (n > 2 || n < 0){
                System.out.println("输入不规范，请重新输入");
                continue;
            }
            a14.setTomNum(n);
            a14.fingerPlay();
            a14.showInfo();
            System.out.println("是否继续游戏（y或者n）");
            char c = myScanner.next().charAt(0);
            if (c == 'y'){
                continue;
            }else if (c == 'n'){
                break;
            }else {
                System.out.println("您的输入有误");
                break;
            }
        }
    }
}

class A01{
    public Double max(double[] arr){//Double类--包中类
        if (arr != null && arr.length > 0){ //健壮性 -- arr数组为0和为null的情况都考虑到了
            double max = arr[0];
            int index = 0;
            for (int i = 1;i < arr.length;i++){
                if (arr[i] > max){
                    max = arr[i];
                    index = i;
                }
            }
            return max;
        }else {
            return null;
        }
    }
}
class A02{
    public int find(String[] strs,String s){
        int index = -1;
        for (int i = 0;i < strs.length;i++){
            if (strs[i].equals(s)){
                index = i;
                break;
            }
        }
        return index;
    }
}
class Book{
    String name;
    double price;
    public Book(String name,double price){
        this.name = name;
        this.price = price;
    }
    public void updataPrice(){
        if (this.price > 150){
            this.price = 150;
        }else if (this.price > 100){
            this.price = 100;
        }
    }
    public void printInfo(){
        System.out.println("《" + this.name+"》这本书的价格是" + price);
    }
}
class A04{
    public double[] copyArr(double[] arr){
        double[] arr2 = new double[arr.length];
        for (int i = 0;i < arr.length;i++){
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
class Circle{
    double rad;
    public Circle(double rad){
        this.rad = rad;
    }
    public double area(){
        return Math.pow(this.rad,2) * Math.PI;
    }
    public double len(){
        return 2 * Math.PI * this.rad;
    }
}
class Cale{
    double num1;
    double num2;
    public Cale(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double sum(){
        return num1 + num2;
    }
    public double minus(){
        return num1 - num2;
    }
    public double mul(){
        return num1 * num2;
    }
    public Double div(){
        if (num2 != 0){
            return num1 / num2;
        }else {
            return null;
        }
    }
}
class A07{
    String name;
    String color;
    int age;
    public A07(String name,String color,int age){
        this.age = age;
        this.name = name;
        this.color = color;
    }
    public void show(){
        System.out.println("该狗的基本信息： \n名字：" + this.name + " 颜色：" +
                this.color + " 年龄：" + this.age);
    }
}
class A08{
    int count = 9;
    public void count1(){
        count = 10;
        System.out.println("count1 = " + count);
    }
    public void count2(){
        System.out.println("count2 = " + count++);
    }
}
class Music{
    String name;
    double times;

    public Music(String name,double times){
        this.name = name;
        this.times = times;
    }
    public void play(){
        System.out.println(this.name + "正在播放..... 总时长为" + this.times);
    }
    public String getInfo(){
        return "音乐" + this.name + " 播放时长为" + this.times;
    }
}
class A10{
    int i = 100;
    public void m(){
        int j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
class A12{
    String name;
    char sex;
    int age;
    String job;
    double sal;
    public A12(String name,char sex,int age,String job,double sal){
        this(name,sex,age);//this复用构造器只能复用一次，且是语句块第一句
        this.job = job;
        this.sal = sal;
    }
    public A12(String name,char sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public A12(String job,double sal){
        this.job = job;
        this.sal = sal;
    }
}
class Circle13{
    double radius;
    public double findArea(){
        return Math.pow(this.radius,2) * Math.PI;
    }
    public void setradius(double radius){
        this.radius = radius;
    }
}
class Object13{
    public void printAreas(Circle13 c,int times){
        for (int i = 1;i <= times;i++){
            c.setradius(i);
            System.out.println("半径为" + (double)i + " ， 面积为" + c.findArea());
        }
    }
}
class A14{
    int pcNum;
    int tomNum;
    int victoryNum;
    int defeatNum;
    int drawNum;
    int gameNum;
    public void getRandomNum(){
        Random r = new Random();
        pcNum = r.nextInt(3);//返回0-2的随机整数
    }
    public void setTomNum(int tomNum){
        this.tomNum = tomNum;
    }
    public void fingerPlay(){
        gameNum++;
        getRandomNum();
        if (tomNum == pcNum){
            System.out.println("哈哈，打成平手");
            drawNum += 1;
        }else if (tomNum == 0 && pcNum == 1){
            System.out.println("电脑输了");
            victoryNum += 1;
        }else if (tomNum == 1 && pcNum == 2){
            System.out.println("电脑输了");
            victoryNum += 1;
        }else if (tomNum == 2 && pcNum == 0){
            System.out.println("电脑输了");
            victoryNum += 1;
        }else {
            System.out.println("tom输了");
            defeatNum += 1;
        }
    }

    public void showInfo(){
        System.out.println("总局数：" + gameNum + " 电脑胜局："+defeatNum + " tom胜局：" + victoryNum + " 平局：" + drawNum);
    }
}

