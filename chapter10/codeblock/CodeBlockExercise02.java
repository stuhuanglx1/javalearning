package chapter10.codeblock;

public class CodeBlockExercise02 {
    Sample sam1 = new Sample("sam1成员初始化");
    static Sample sam2 = new Sample("静态成员sam2初始化");
    static {
        System.out.println("static块执行");
        if (sam2 == null){
            System.out.println("sam2 is null");
        }
    }
    CodeBlockExercise02() {
        System.out.println("codeblockexercise02默认构造函数被调用");
    }

    public static void main(String[] args) {
        new CodeBlockExercise02();
        /*
        静态成员sam2初始化
        static块执行
        sam1成员初始化
        codeblockexercise02默认构造函数被调用
         */
    }

}
class Sample{
    Sample(String s){
        System.out.println(s);
    }
    Sample(){
        System.out.println("Sample默认构造函数被调用");
    }
}
