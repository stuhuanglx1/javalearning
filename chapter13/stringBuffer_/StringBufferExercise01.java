package chapter13.stringBuffer_;

/**
 * @author H lx
 * @vision 1.0
 */
public class StringBufferExercise01 {
    public static void method01(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);//传入一个null字符串时，将null变成一个null字符存入value
        System.out.println(sb.length());//4
        System.out.println(sb);//null

//        StringBuffer sb1 = new StringBuffer(str);
//        //因为该构造器在对象创建时，需要str.length()方法，而null.length()会报空指针异常
//        System.out.println(sb1);//报错--空指针异常

    }
    //小数位数
    public static void method02(){
        String price = "12345678.987";
        StringBuffer sb = new StringBuffer(price);
        //找到小数点位置
        int index = sb.lastIndexOf(".");
        //计算需要几个逗号,以及从第几位开始加，
        int num = index / 3;
        int start = index % 3;
        for (int i = 0; i < num; i++) {
            sb.insert(start + 4 * i,",");
        }
        if (start == 0){
            sb.delete(0,1);
        }
        System.out.println(sb);
    }
    //小数、整数位数分割
    public static void method02_2(){
        String price = "123456789.99";
        StringBuffer sb = new StringBuffer(price);
        int index = sb.lastIndexOf(".");
        if (index != -1){
            for (int i = index; i > 3; i -= 3) {
                sb = sb.insert(i-3,",");
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
//        method01();
//        method02();
        method02_2();
    }
}
