package chapter11.enumeration_;

public class Enumeration_ {
    //枚举
    /*
    基本概念：1）枚举是一组常量的集合；2）属于一种特殊的类，里面只包含一组有限的特定的对象
    实现方式：①自定义类实现枚举；②使用enum关键字实现枚举
    【自定义枚举】
1、构造器私有化，防止直接被new
2、本类内部创建一组对象
3、对外暴露对象 public final static修饰符
4、可以提供get方法，但不要提供set方法
    特点：
    ①不需要set方法，因为枚举对象值通常只读
    ②对枚举对象、属性使用final+static共同修饰，实现底层优化
    ③枚举对象名通常都使用全部大写，常量的命名规范
    ④枚举对象根据需要，也可以有多个属性
    【enum关键字实现枚举】
    enum 类名{
        定义的常量对象【格式：对象名(参数列表)】 --多个参数列表之间用,隔开
        构造器、get方法等
    }
    注意事项：
    1、使用enum关键字开发一个枚举类时，默认继承Enum类（javap反编译来查看）
    2、传统的public static final 类名 对象名 = new 类名(实参);简化为 对象名(实参列表);
    3、如果使用无参构造器创建枚举对象，则实参列表和小括号都可以省略
    4、当有多个枚举对象时，用,间隔，最后一个对象带对象
    5、枚举对象一定要放在类的最前面，即定义的常量对象写在最前面
    6、构造器默认私有
    【练习1】
    enum Gender{
        BOY,GIRL;
    }//正确，创建了两个枚举对象，调用的是无参构造器
    【练习2】
    enum Gender2{
        BOY,GIRL;
    }
    Gender2 boy = Gender2.BOY;
    Gender2 boy2 = Gender2.BOY;
    System.out.println(boy);//boy的toString（父类Enum类的toString方法：返回name），输出BOY
    System.out.println(boy2 == boy);//输出true
    【常用方法说明】
    使用关键字enum时会隐式的继承Enum类，即在使用enum时可以调用父类Enum的方法
    public abstract class Enum<E extends Enum<E>> implments Comparable<E>,Serialiazable{}
     -- 可以这样理解Enum类：独立于Object类的存在，与Object类是同一级别
    valueOf:将字符串转换成枚举对象,字符串必须是已有常量名
    values:（反编译）返回枚举对象数组，含有定义的所有枚举对象
    toString:返回的是当前对象的名字，子类可以重写该方法，用于返回对象属性信息
    name:返回当前对象名（常量名），子类不能重写,建议优先使用toString()
    ordinal:输出该枚举对象的次序\编号，从0开始编号
    compareTo:比较两个枚举常量的编号，返回值return self.ordinal - other.ordinal，即编号差
    equals、hashCode、getDeclaringClass、clone
    【细节和注意事项】
    1、使用enum关键字后就不能继承了，enum会隐式继承Enum类，而java是单继承机制
    2、枚举类和普通类一样，都可以使用接口
    enum 类名 implements 接口1，接口2{}
     */
}
