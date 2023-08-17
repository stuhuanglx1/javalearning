package chapter12.exception_;

/**
 * @author H lx
 * @vision 1.0
 */
public class Exception_ {
    //异常
    /*
    【异常的概念】程序执行中发生的不正常情况。（注意：开发过程中，语法错误和逻辑错误不是异常）
    执行过程中所发生的异常事件可以分为两类：
    ①Error（错误）：java虚拟机无法解决的严重。[JVM系统内部错误、资源耗尽等（栈溢出）] --严重错误，会崩溃
    ②Excepetion（异常）：其他因编程错误或偶然外在因素导致的一般性问题，可以使用针对性代码进行处理。
    [空指针访问、试图读取不存在文件、网络连接中断等] --分为 运行时异常(程序运行时发生的异常) 和 编译时异常(编译时，编译器检查出的异常) 两类。
    **【异常体系图】详见文档，罗列异常事件的基本关系以及常见的异常
    运行时异常，编译器不能检查出来，可以不做处理，这类异常很常见，若全处理会对程序的可读性和运行效率产生影响；
    编译时异常，是编译器要求必须处理的异常
    【常见的异常】
    运行时异常：
    ①空指针异常NullPointException：当程序试图在需要对象的地方使用null时，抛出该异常
    ②算术异常ArithmeticException：当出现异常的运算条件时，抛出此异常，案例见Exception01
    ③数组下标越界异常ArrayIndexOfBoundsException：用非法索引访问数组时抛出的异常
    ④类型转换异常ClassCastException：将试图将对象强转为不是实例的子类时，抛异常
    ⑤数字格式异常NumberFormatException：当应用程序试图将字符串转化为一种数值类型，但该字符串不能转为合适格式时则报异常
    =>使用该异常处理，能使确保输入内容是满足条件数字
    编译时异常：
    在编译期间，就必须处理的异常，否则代码不能通过编译
    SQLException操作数据库时，查询表可以发生异常
    IOExcepton操作文件时发生异常
    ClassNotFoundException操作一个不存在文件时发生异常
    ~~~练习~~~
    String friends[] = {"tom","jack","milan"};
    for(int i = 0;i < 4;i++){System.out.println(friends[i])}
    //ArrayIndexOfBoundsException
    Cat c = new Cat();
    cat = null;
    System.out.println(cat.name);
    //NullPointException
    public class AAA{
        int x;
        public static void main(String[] args){
            int y;
            AAA a = new AAA();
            y = 3/a.x;
            System.out.println("program ends ok!")
        }
    }//ArithmeticException
    class Person{
        public static void main(String[] args){
            Object obj = new Data();
            Person person;
            person = (Person)obj;
            System.out.println(person);
        }
    }//ClassCastException
    【异常处理】两种方式，二选一
    1)try-catch-finally
    在代码中捕获发生的异常，自行处理
     public static void main(String[] args) {
        try{
            可能有异常的代码块
        }catch (Exception e){
            捕获到异常：当异常发生时，系统将异常封装成Exception对象e，传递给catch，得到异常对象后，程序员自行处理，增加业务逻辑
        }finally{
            不管try代码块是否有异常发生，始终要执行finally
            没有finally语法也可以执行
            --通常是释放资源的代码（关闭数据库、文件、网络等）
        }
    }
    [细节]
    1、如果异常发生了，则异常发生后的代码不会执行，直接进入catch块
    2、如果异常没有发生，则顺利执行try的代码块，不会进入catch
    3、如果希望不管是否发生异常，都执行代码（关闭连接、释放资源），则使用finally
    4、可以有多个catch语句，捕获不同的异常（进行不同的业务处理），要求父类异常在后，子类异常在前
    5、可以直接进行try-finally配合使用，相当于没有捕获异常，程序会崩掉，但可以执行资源被释放（不管是否发生异常，都必须执行的业务逻辑）
    [总结]
    ①如果没有出现异常，则执行try块中的所有语句，不执行catch语句，如果有finally，最后还需要执行finally中语句
    ②如果出现异常，则try块中异常发生后，try块剩下的语句不再执行，执行catch语句，如有finally，则还要执行finally
    2)throws
    将发生的异常抛出，交给调用者来处理，最顶级的处理者就是JVM
    如果抛给了JVM，JVM处理异常机制就是输出异常信息并退出程序
    没有显示处理异常，默认采用throws方法
    在方法声明中用throws语句可以抛出异常的列表，throws后面的异常类型可以是方法中产生的异常类型，也可以是其父类
    [细节]
    1、对于编译异常，程序中一定需要处理，try-catch或throws
    2、对于运行时异常，程序中如果没有处理，默认是throws处理方式
    3、子类重写父类方法时，对抛出异常的规定：子类重写的方法所抛出的异常类型要么和父类一致，要么为父类抛出异常类型的子类
    4、在throws过程中，如果有try-catch，则相当于处理异常，就可以不throws
    5、运算异常是运行时异常，java对运行异常有默认处理机制
    6、FileNotFoundException等编译异常一定要进行显示处理
    【自定义异常】
    步骤：
    1）定义类：自定义异常类名，继承Exception或者RuntimeException
    2）继承Exception，属于编译异常
    3）继承RuntimeException，属于运行异常
    一般情况下，自定义异常继承RuntiomeException，即把自定义异常做成运行时异常，好处：可以使用默认的处理机制
    【throw VS throws】
              ||  意义              ||  位置       ||  后面跟的东西
    -------------------------------------------------------------
    throws    || 异常处理的一种方式    ||方法声明处    ||异常类型
    throw     ||手动生成异常对象的关键字||方法体中      ||异常对象
     */

}
