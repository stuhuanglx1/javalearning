package chapter13.string_;

/**
 * @author H lx
 * @vision 1.0
 */
public class StringEvercise03 {
    String str = new String("hhh");
    final char[] ch = {'j','a','v','a'};//数组是引用类型，final修饰的是引用类型地址不能更改

    public void change(String str,char[] ch){
        str = "java";//此处仅对局部变量进行改变，实例的属性并没有更改
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        StringEvercise03 test = new StringEvercise03();
        test.change(test.str, test.ch);
        System.out.print(test.str + " and ");
        System.out.println(test.ch);
        //输出为hhh and hava
    }
}
