package chapter04;
import java.util.Scanner;//Scanner是简单的文本扫描器

public class exercise03_TernaryOperator_Input {
    public static void main(String[] args){

        //三元运算符的使用
        int a = 3;
        int b = 17;
        int result = a > b ? a++ : b--;
        System.out.println("result=" + result);//17
        System.out.println("a=" + a);//3
        System.out.println("b=" + b);//16
        result = a < b ? a++ : b--;
        System.out.println("result=" + result);//3
        System.out.println("a=" + a);//4
        System.out.println("b=" + b);//16

        //案例：求三个数中的最大数
        int a1 = 33;
        int a2 = 65;
        int a3 = 54;
        int max1 = a1 > a2 ? a1 : a2;
        int max2 = max1 > a3 ? max1 : a3;
        System.out.println("最大值为" + max2);
        //使用一条语句--嵌套(不清晰，且效率低，不建议)
        int max = (a1 > a2 ? a1 : a2) > a3 ? (a1 > a2 ? a1 : a2) : a3;
        System.out.println("最大值2为" + max);

        /*
        运算符优先级（多用多熟）：
        1、(),{}等
        2、单目运算符  ++  --
        3、算术运算符
        4、位移运算符
        5、比较运算符
        6、逻辑运算符
        7、三元运算符
        8、赋值运算符
         */

        //标识符
        /*
        标识符：
        1、26英文字母大小写+0-9+_+$
        2、不能以数字开头
        3、不可以使用关键字和保留字，但可以包含
        4、区分大小写，长度不限
        5、不包括空格
         */
        System.out.println("================标识符练习题");
        /*
        hsp对;hsp12对;1hsp错;h-s错;x h错;h$4对;class错;int错;double错;
        static错;goto错（保留字）;stu_name对
         */

        /*
        规范：
        1、包名：所有字母小写
        2、类名，接口名：多单词时，所有单词首字母大写
        3、变量名，方法名：第一个单词首字母小写，后面单词首字母大写xxxYyyZzz
        4、常量名：所有字母大写，单词间用下划线_连接
         */

        //键盘输入语句
        /*
        1 导包
        2 创建类对象
        3 接收用户输入
        */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入名字");
        String name = myScanner.next();
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        System.out.println("请输入薪水");
        double salary = myScanner.nextDouble();
        System.out.println("姓名： " + name + " 年龄： " + age + " 薪水： " + salary);



    }
}
