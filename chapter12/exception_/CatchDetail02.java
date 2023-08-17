package chapter12.exception_;

/**
 * @author H lx
 * @vision 1.0
 */
public class CatchDetail02 {

    public static void main(String[] args) {
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.name);//空指针异常
            int n1 = 10;
            int n2 = 0;
            int res = n1 /n2;//算术异常
        //程序捕获到一个异常会直接跳到catch语句，下面的异常不会被捕捉到
        } catch (NullPointerException e){
            System.out.println("空指针异常" + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("算术异常"+e.getMessage());
        }catch (Exception e) {//父类异常在后
            System.out.println(e.getMessage());
        } finally {
        }
    }
}
class Person{
    String name = "mary";

    public String getName() {
        return name;
    }
}
