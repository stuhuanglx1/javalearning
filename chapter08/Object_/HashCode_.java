package chapter08.Object_;

public class HashCode_ {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = obj1;
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
        //obj1和obj2的hashcode值不一样
        //obj1和obj3的hashcode值一样
    }
}

