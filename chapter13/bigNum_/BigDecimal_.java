package chapter13.bigNum_;

import java.math.BigDecimal;

/**
 * @author H lx
 * @vision 1.0
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        double d = 199.22222222222222;
        System.out.println(d);
        //当我们需要保存精度很高的小数，double已经不够用了，此时可以使用BigDecimal
        BigDecimal b1 = new BigDecimal("1111111111111.22222222222222222222");
        BigDecimal b2 = new BigDecimal("1.2");
        //加减乘除，需要使用对应方法，不能直接使用+-，使用add、substrct、multiply、divide方法
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
//        System.out.println(b1.divide(b2));//除法可能抛出异常ArithmeticException:Non-terminating decimal expansion
        //除法结果是无限循环小数就会抛出异常，解决方法：在divide方法时指定精度
        System.out.println(b1.divide(b2,BigDecimal.ROUND_CEILING));
//        BigDecimal.ROUND_CEILING指的是保留分子精度


    }
}
