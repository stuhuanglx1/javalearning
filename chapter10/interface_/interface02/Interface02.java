package chapter10.interface_.interface02;

public class Interface02 {
    public static void main(String[] args) {
        A a = new A();
        work(a);
    }
    public static void work(AInterface aInterface){
        aInterface.hi();
        aInterface.say();
        AInterface.cry();
    }
}
