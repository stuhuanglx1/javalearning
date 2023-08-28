package chapter13.wrapper_;

/**
 * @author H lx
 * @vision 1.0
 */
public class WrapperExercise02 {
    public static void method1(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false,两个不同对象

        Integer m = 1;//底层是Integer.valueOf -> ！阅读源码！
        Integer n = 1;
        System.out.println(m == n);//true

        //Integer.valueOf(int i)解读
        //This method will always cache values in the range -128 to 127
        //底层源码显示在-128~127范围内是选取cache数组中的值直接返回，范围外则是new一个，即Integer在类加载时就已经创建了-128 to 127范围256个整数

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false
    }
    public static void method2(){
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);//false

        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);//false

        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5 == i6);//true

        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);//false

        Integer i9 = 127;//cache数组中取出
        Integer i10 = new Integer(127);//重新new的
        System.out.println(i9 == i10);//false

        //只要有基本数据类型，==判断的是值是否相等
        Integer i11 = 127;
        int i12 = 127;
        System.out.println(i11 == i12);//true

        Integer i13 = 128;
        int i14 = 128;
        System.out.println(i13 == i14);//true

    }
    public static void main(String[] args) {
//        method1();
        method2();
    }
}
