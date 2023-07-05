package chapter03;

public class exercise01 {

    public static void main(String[] args) {

        //声明变量
        int a;
        a = 100;
        System.out.println(a);
        //一步到位
        int b = 200;
        System.out.println(b);

        //记录个人信息
        int age = 20;
        double score = 99;
        char sex = '男';
        String name = "smith";
        System.out.println("个人信息如下：");
        System.out.println("年龄:\t" + age);
        System.out.println("分数:\t" + score);
        System.out.println("性别:\t" + sex);
        System.out.println("名字:\t" + name);

        //加号使用--数值做加法运算，存在字符串做拼接运算
        System.out.println(100 + 98);
        System.out.println("100" + 98);
        System.out.println(100 + 3 + "hello");
        System.out.println("hello" + 100 + 3);

        //数据类型（基本数据类型和引用数据类型）
        //数值型--整数类型
        byte n1 = 10;  //1个字节(-128~127)
        short n2 = 10;  //2个字节(-32768~32767)
        int n3 = 10;  //4个字节(-2^31~2^31-1)
        long n4 = 10;  //8个字节(-2^63~2^63-1)
        /*
        思考题：①long类型有几个字节，有几bit？  答：8个字节，64bit
        ②long n = 3在内存中的形式  答：00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000011
         */
        //数值型--浮点类型（小数都是近似值）
        double num1 = 2.123876979;
        float num2 = 2.123876979f;
        System.out.println("double型：" + num1 + "\t\tfloat型：" + num2);
        //浮点陷阱--小数是近似值  对运算结果是小数的数进行相等判断时需要小心！！！==>是两个数的差值的绝对值在某个精度范围进行比较
        double num3 = 2.7;
        double num4 = 8.1 / 3;  //是一个接近2.7的小数2.6999999999999997
        System.out.println("num3 = " + num3 + "\t\tnum4 = " + num4);
        //对运算结果是小数的数进行相等判断时需要小心！！！==>是两个数的差值的绝对值在某个精度范围进行比较
        if(num3 == num4){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
        //准确写法
        if(Math.abs(num3 - num4) < 0.00001){
            System.out.println("差值很小，认为相等");
        }
        //字符类型
        char c1 = '好';
        char c2 = '\t';
        char c3 = 'a';
        char c4 = 98;//字符类型可以存放一个数字，输出是该数字对应的编码值 98对应‘b’
        System.out.println("c1:" + c1 + "\nc2:" + c2 + "\nc3:" + c3 +"\nc4:" + c4);//好 【】 a b
        char c5 = 97;
        char c6 = 'a';
        System.out.println("c5:" + c5 + "\nc6对应unicode码:" + (int)c6);//a  97
        System.out.println('a' + 10);//107
        System.out.println("a" + 10);//a10
        System.out.println(c3 + 10);//107
        char c7 = 'a' + 10;
        System.out.println(c7);//k
        //布尔类型  true和false  只有2个值

        //基本数据类型转换
        // 自动转换autoConvert
        int num = 'a';//√ char→int
        double d1 = 80;//√ int→double
        //多种数据类型混合
        int n5 = 10;
        double d2 = n5 + 1.1;
        float f1 = n5 + 1.1f;
        System.out.println("n5:" + n5 + "\td2:" + d2 + "\tf1:" + f1);//10  11.1  11.1
        //byte、short、char不管是单类型还是多类型计算，都转成int
        byte b2 = 1;
        short s1 = 1;
        int n7 = b2 + s1;
        System.out.println(n7);//2
        //强制转换forceConvert
        int n8 = (int)1.7;
        System.out.println(n8);//1  精度损失
        int n9 = 2000;
        byte b3 = (byte) n9;
        System.out.println(b3);//-48  数据溢出
        //练习题
        /*
        * 1、错（int->short）2、错（int->byte）3、对 4、错（int->short）
        */

        //基本数据类型和字符串
        //基本数据类型->String
        int n10 = 100;
        float f2 = 11.0f;
        double d3 = 2.3;
        boolean bool1 = true;
        String s01 = n10 + "";
        String s02 = f2 + "";
        String s03 = d3 + "";
        String s04 = bool1 + "";
        System.out.println(s01 + " " + s02 + " " + s03 + " " + s04);
        //String-> 基本数据类型
        String s5 = "123";
        int n11 = Integer.parseInt(s5);
        float f3 = Float.parseFloat(s5);
        double d4 = Double.parseDouble(s5);
        System.out.println("=======================================");
        System.out.println(n11 + " " + f3 + " " + d4);
        char c8 = s5.charAt(2);
        System.out.println("字符串转字符的结果："+c8);




    }

}
