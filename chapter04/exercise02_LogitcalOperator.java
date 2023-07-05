package chapter04;

public class exercise02_LogitcalOperator {
    public static void main(String[] args){
        //逻辑运算符的使用
        int age = 50;
        if(age > 10 && age < 90){
            System.out.println("ok&&");
        }
        if(age > 10 & age < 90){
            System.out.println("ok&");
        }
        //&&和&的区别
        int a = 4;
        int b = 9;
        if (a < 1 && ++b < 50){
            System.out.println("ok&&");
        }
        System.out.println("a=" + a + "b=" +b);//4;9
        if (a < 1 & ++b < 50){
            System.out.println("ok&");
        }
        System.out.println("a=" + a + "b=" +b);//4;10

        //||和|的区别
        if (a > 1 || ++b < 50){
            System.out.println("ok||");
        }
        System.out.println("a=" + a + "b=" +b);//4;10
        if (a > 1 | ++b < 50){
            System.out.println("ok|");
        }
        System.out.println("a=" + a + "b=" +b);//4;11

        //异或^
        boolean bool1 = (10 > 1) ^ (3 > 5);
        System.out.println("bool1 = " + bool1);

        //练习题
        System.out.println("=============\n题1");
        int x = 5;
        int y = 5;
        if (x++ == 6 & ++y ==6){
            x = 11;
        }
        System.out.println("x=" + x + "y=" + y);//x=6,y=6

        x = 5;
        y = 5;
        if (x++ == 6 && ++y ==6){
            x = 11;
        }
        System.out.println("x=" + x + "y=" + y);//x=6,y=5

        x = 5;
        y = 5;
        if (x++ == 5 | ++y ==5){
            x = 11;
        }
        System.out.println("x=" + x + "y=" + y);//x=11,y=6

        x = 5;
        y = 5;
        if (x++ == 5 || ++y ==5){
            x = 11;
        }
        System.out.println("x=" + x + "y=" + y);//x=11,y=5

        System.out.println("=============\n题2");
        //注意：by = true和bx = false是赋值语句
        boolean bx = true;
        boolean by = false;
        short z = 46;
        if ((z++ == 46) && (by = true)){  //z == 46为true,z=z+1=47,true && true->true
            z++; //z=48
        }
        if ((bx = false) || (++z == 49)){  //前一个条件为false，z=z+1=49,z == 49为true，false||true->true
            z++;//z=50
        }
        System.out.println("z=" + z);//z=50

    }
}
