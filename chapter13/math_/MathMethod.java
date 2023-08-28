package chapter13.math_;

/**
 * @author H lx
 * @vision 1.0
 */
public class MathMethod {
    //Math
    /*
    math类中的方法都是静态方法
    【常用方法】
    ①abs绝对值 ②pow求幂 ③ceil向上取整 ④floor向下取整 ⑤round四舍五入 ⑥sqrt求开方
    ⑦random求随机值 ⑧max求最大值 ⑨min求最小值
     */
    public static void main(String[] args) {
        // ①abs绝对值
        int abs = Math.abs(-2);
        System.out.println(abs);//2
        // ②pow求幂
        double pow = Math.pow(2,4);//2的4次方
        System.out.println(pow);//16.0
        // ③ceil向上取整--大于等于该参数的最小整数
        double ceil = Math.ceil(3.12);
        System.out.println(ceil);//4.0
        ceil = Math.ceil(-2.3);
        System.out.println(ceil);//-2.0
        ceil = Math.ceil(2.0);
        System.out.println(ceil);//2.0
        // ④floor向下取整--小于等于该参数的最大整数
        double floor = Math.floor(2.8);
        System.out.println(floor);//2
        floor = Math.floor(-4.1);
        System.out.println(floor);//-5
        floor = Math.floor(2);
        System.out.println(floor);//2
        // ⑤round四舍五入
        long round = Math.round(-5.002);
        System.out.println(round);//-5
        round = Math.round(-5.5);
        System.out.println(round);//-5
        round = Math.round(5.5);
        System.out.println(round);//6
        // ⑥sqrt求开平方
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);//3
//        sqrt = Math.sqrt(-3);//NAN
        // ⑦random求随机值 --0 <= Math.random() < 1
        int a = 8;
        int b = 18;
        int rand = (int)(Math.random() * (b - a + 1) + a);
        System.out.println(rand);
        // ⑧max求最大值
        int max = Math.max(1,3);
        System.out.println(max);//3
        // ⑨min求最小值
        int min = Math.min(3,-9);
        System.out.println(min);//-9
    }
}
