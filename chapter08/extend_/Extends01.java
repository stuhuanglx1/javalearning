package chapter08.extend_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小黄";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(90);
        pupil.showInfo();

        System.out.println("=====================");
        Graduate graduate = new Graduate();
        graduate.name = "大黄";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(59);
        graduate.showInfo();

        /*
        继承：子类会自动拥有父类定义的属性和方法（注意修饰符）
        父类（基类、超类）--共用属性、共有方法
        子类（派生类）--特有属性、特有方法 （extends关键字）
         */
        //上述代码的继承写法在improve_包里

        //继承的好处：①代码复用性提高 ②代码扩展性和维护性提高了

        /*
        继承的细节：
        ①子类继承了所有属性和方法，但私有属性和方法不能在子类中直接访问（有间接方法），要通过公共方法（父类提供）
        ②子类必须调用父类构造器，完成父类初始化
        ③当创建子类对象时，不管使用子类哪个构造器，都会去调用父类的无参构造器；
        如果父类没有无参构造器，必须在子类用super去指定父类使用的哪个构造器完成对父类构造器的初始化
        ④如果想要调用父类的指定构造器，则需要显示调用：super(参数列表) （无参构造器可省略super关键字）
        （创建子类对象必须要调用父类构造器，默认调用无参构造器，想调用其他构造器需要用super关键字指定）
        ⑤super在使用时必须放在构造器语句块的第一行
        ⑥super和this关键字只能放在构造器语句块第一行，因此这两个方法不能在同一个构造器内共用
        ⑦java所有类都是Object类的子类，Object是所有类的基类  --ctrl + H可以看到所有的继承关系
        ⑧父类构造器的调用不局限于直接父类，将一直往上追溯至Object（顶级父类）
        ⑨子类最多继承一个父类（指的是直接继承），即单继承机制
        如何让A类继承B类和C类？ --A继承B，B继承C
        ⑩不能滥用继承，子类和父类之间必须满足is-a的逻辑关系（从属）
         */

        //继承的本质：当子类对象创建好后，建立查找关系  (视频293)
        /*
        按查找关系来返回信息：
        1)首先看子类是否有该属性；
        2)如果子类有这个属性，并且可以访问，则返回信息
        3)如果子类没有这个属性，就看父类有没有这个属性
        4)如果父类没有这个属性，就按照3)的规则继续找上级父类，直到Obeject
        5)若没有可访问的属性，则会报错;遇到不可访问的属性就会直接报错，不会继续查找
         */


    }
}
