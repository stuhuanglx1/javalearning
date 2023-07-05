package chapter02;

public class homework {
    public static void main(String[] args){
        //1、编写hello，world程序
        System.out.println("Hello,world!");

        //2、打印个人信息（姓名、性别、籍贯、住址）
        System.out.println("姓名\t\t性别\t\t籍贯\t\t住址\n黄林煊\t女\t\t浙江玉环\t玉城街道");

        //3、JDK、JRE、JVM的关系
        /*
        * JDK是java开发工具包，JRE + java开发工具
        * JRE是java运行环境， JVM + java核心类库 （运行一个程序仅需要JRE）
        * JVM是java虚拟机
        */

        //4、环境变量path配置及作用
        /*
        * 作用:在dos任意目录下使用javac和java命令
        * 步骤：①我的电脑-属性-高级系统配置-环境变量
        *      ②增加JAVA_HOME环境变量，指向JDK安装主目录
        *      ③编辑path环境变量，增加%JAVA_HOME%\bin
        *      ④在dos上敲入javac，确定是否配置成功
        */

        //5、java编写步骤
        /*
        * ①编写源代码②javac编译，获得字节码文件.class③java运行（加载到JVM）
        */

        //6、java编写规范
        /*
        * ①类、方法的注释要用javadoc来写
        * ②非javadoc的注释，是对代码的说明，给程序维护者看，包括如何修改以及注意事项
        * ③tab：整体右移，shift+tab：整体左移
        * ④运算符左右留出空格
        * ⑤源码文件使用utf-8编码
        * ⑥行宽字符不超过80
        * ⑦编程风格：次行风格和行尾风格（推荐使用）
        * */

        //7、初学者易犯错误
        /*
        * ①编译或运行时找不到源文件 -> 再次确认目录、文件名
        * ②主类和文件名不一致 -> 修改成一致
        * ③缺少分号; 而且一定是英文字符
        * ④拼写错误
        * */

    }
}
