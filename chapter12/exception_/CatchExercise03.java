package chapter12.exception_;

/**
 * @author H lx
 * @vision 1.0
 */
public class CatchExercise03 {
    public static int method() {
        int i = 1;
        try {
            i++;//i=2
            String[] names = new String[3];
            if (names[1].equals("Tom")){
                System.out.println(names[1]);
            }else {
                names[3] = "111";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        }catch (NullPointerException e){
            return ++i;//i=3,返回值也是3
        }finally {
            ++i;//i=4
            System.out.println("i=" + i);
        }
        /*
        分析：
        1、明显的异常：14行下标越界
        2、隐藏的异常：names数组在创建时并未赋值，默认初始值为null，在运行到11行时便会报空指针异常
        3、运行到11行时便会抱空指针异常错误进入catch，之后的异常不予理会，此时的返回值为3，i=3
        4、finally的优先返回权最高，所以finally语句块一定被执行，返回的值是3，i=4
         */
    }

    public static void main(String[] args) {
        System.out.println(method());//输出3
    }
}
