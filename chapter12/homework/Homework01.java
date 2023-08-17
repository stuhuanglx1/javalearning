package chapter12.homework;

/**
 * @author H lx
 * @vision 1.0
 * 编程题
 */
public class Homework01 {
    public static void main(String[] args) {
        try {
            if (args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1,n2);//该方法很有可以抛出算术异常
            System.out.println("计算结果是：" + res);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("参数格式不正确，需要输入整数");
        } catch (ArithmeticException e){
            System.out.println("出现除零异常");
        }
    }
    public static int cal(int n1,int n2){
        return n1 / n2;
    }
}
