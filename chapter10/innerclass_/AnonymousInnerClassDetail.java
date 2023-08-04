package chapter10.innerclass_;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        System.out.println("main的outer05的hashcode：" + outer05);
    }
}
class Outer05{
    private int num = 98;
    public void f1(){
        //匿名内部类 写法1
        new Person(){
            private int num = 9;
            @Override
            public void hi() {
                System.out.println("访问匿名内部类的私有属性num = " + num);
                System.out.println("访问外部类的私有属性num = " + Outer05.this.num);
                //Outer05.this 就是调用f1方法的对象
                System.out.println("Outer05.this的hashcode：" + Outer05.this);
                System.out.println("匿名内部类重写hi方法");
            }
        }.hi();
        //匿名内部类 写法2
        Person p = new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写hi方法(写法2)");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        };
        p.hi();
        p.ok("123");

    }
}

class Person{
    public void hi(){
        System.out.println("hi...(Person)");
    }
    public void ok(String str){
        System.out.println("ok..(Person) " + str);
    }
}
