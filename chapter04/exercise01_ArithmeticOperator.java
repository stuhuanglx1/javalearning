package chapter04;

public class exercise01_ArithmeticOperator {

    public static void main(String[] args){
        //算术运算符的使用
        //除法
        System.out.println(10 / 4);//2
        System.out.println(10.0 / 4);//2.5
        double d = 10 / 4;//2.0 原因：10/4=2,2->2.0
        //取模
        System.out.println(10 % 3);//1
        System.out.println(-10 % 3);//-1
        System.out.println(10 % -3);//1 !!! %的本质：a%b = a-a/b*b  余数符号与被除数符号一致
        System.out.println(-10 % -3);//-1
        //自增：前和后
        //独立语句中，i++和++i等价
        int i = 10;
        i++;
        System.out.println(i);//11
        ++i;
        System.out.println(i);//12
        /*
         *作为表达式使用
         * i++：先赋值后自增
         * ++i：先自增后赋值
         */
        int j = 8;
        int k = ++j;//k=9,j=9     ==>j=j+1,k=j
        System.out.println("k=" + k + " j=" + j);
        k = j++;//k=9,j=10     ==>k=j,j=j+1
        System.out.println("k=" + k + " j=" + j);

        //练习题
        System.out.println("=============\n题1");
        int a = 1;
        a = a++;
        System.out.println(a);//1  ==>temp=a,a=a+1,a=temp
        System.out.println("=============\n题2");
        a = ++a;
        System.out.println(a);//2  ==>a=a+1,temp=a,a=temp

        System.out.println("=============\n题3");
        int i1 = 10;
        int i2 = 20;
        int i3 = i1++;//i3=i1=10,i1=i1+1=11
        System.out.println("i3=" + i3);//10
        System.out.println("i2=" + i2);//20
        System.out.println("i1=" + i1);//11
        i3 = --i2;//i2=i2-1=19,i3=i2=19
        System.out.println("i3=" + i3);//19
        System.out.println("i2=" + i2);//19

        System.out.println("=============\n题4:59天对应几个星期几天");
        int totalDay = 59;
        int weeks = 59 / 7;
        int days = 59 % 7;
        System.out.println("合" + weeks + "星期" + days + "天");//8 ;3

        System.out.println("=============\n题5:华氏温度转摄氏温度");
        double huashi = 234.6;
        double sheshi = 5.0 / 9.0 * (huashi-100);
        System.out.println("华氏温度" + huashi + "对应摄氏温度" + sheshi);

    }

}
