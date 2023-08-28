package chapter13.wrapper_;

/**
 * @author H lx
 * @vision 1.0
 * 课堂测试题
 */
public class WrapperExercise01 {
    public static void main(String[] args) {
        //1、判断下面代码是否正确？
        Double d = 100d;//Double.valueOf(100d)
        Float f = 1.5f;//Float.valueOf(1.5f)
        //这种写法是正确的，体现的是自动装箱

        //2、下面语句输出结果一样吗？
        Object obj1 = true ? new Integer(1) : new Double(2.0);
        //三元运算符：条件为真，输出第一个值，为假输出第二个值
        //三元运算符是一个整体，会提升精度，看最高精度
        System.out.println(obj1);//输出的是1.0

        Object obj2;
        if(true){
            obj2 = new Integer(1);
        }else {
            obj2 = new Double(2.0);
        }//if-else是独立的，会分别计算
        System.out.println(obj2);//输出为1
        //答：不一样，前者为1.0，后者为1
    }
}
