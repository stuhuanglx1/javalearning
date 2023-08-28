package chapter13.bigNum_;

import java.math.BigInteger;

/**
 * @author H lx
 * @vision 1.0
 */
public class BigInteger_ {
    /*
    BigInteger和BigDecimal
    [应用场景]
    1）BigInteger适合保存较大的整型
    2）BigDecimal适合保存精度更高的浮点数（小数）
    BigInteger：
    当编程中需要处理很大的数，long不够用，此时就可以使用BigInteger
    加减乘除，需要使用对应方法，不能直接使用+-，使用add、substrct、multiply、divide方法
    BigDecimal
    当我们需要保存精度很高的小数，double已经不够用了，此时可以使用BigDecimal
    加减乘除，需要使用对应方法，不能直接使用+-，使用add、substrct、multiply、divide方法
    除法可能抛出异常ArithmeticException:Non-terminating decimal expansion
    除法结果是无限循环小数就会抛出异常，解决方法：在divide方法时指定精度
    BigDecimal.ROUND_CEILING指的是保留分子精度
     */
    public static void main(String[] args) {
        long l = 233333333;
        System.out.println("l=" + l);
        //当编程中需要处理很大的数，long不够用，此时就可以使用BigInteger
        BigInteger b1 = new BigInteger("233333333333333333333");
        System.out.println(b1);
        //加减乘除，需要使用对应方法，不能直接使用+-*/
        BigInteger b2 = new BigInteger("10");
        BigInteger addRes = b1.add(b2);
        System.out.println(addRes);
        BigInteger subRes = b1.subtract(b2);
        System.out.println(subRes);
        BigInteger mulRes = b1.multiply(b2);
        System.out.println(mulRes);
        BigInteger divRes = b1.divide(b2);
        System.out.println(divRes);

    }
}
