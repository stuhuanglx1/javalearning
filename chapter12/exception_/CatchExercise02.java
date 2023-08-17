package chapter12.exception_;

/**
 * @author H lx
 * @vision 1.0
 */
public class CatchExercise02 {
    public static int method() {
        int i = 1;
        try {
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
            return ++i;
        }finally {
            return ++i;
        }
        /*
        分析：
        1、明显的异常：14行下标越界
        2、隐藏的异常：names数组在创建时并未赋值，默认初始值为null，在运行到11行时便会报空指针异常
        3、运行到11行时便会抱空指针异常错误进入catch，之后的异常不予理会，此时i = 2
        4、finally的优先返回权最高，所以finally语句块一定被执行，i++是先增后返回，所以返回的是i+1=3
         */
    }

    public static void main(String[] args) {
        System.out.println(method());//输出3
    }
}
