package chapter10.homework;

/**
 * @author H lx
 * @vision 1.0
 * 编程题
 */
public class Homework02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println("frock1的序列号" + frock1.getSerialNumber());
        System.out.println("frock2的序列号" + frock2.getSerialNumber());
        System.out.println("frock3的序列号" + frock3.getSerialNumber());
    }
}
class Frock{
    private static int currentNum = 100000;//衣服出厂序列号的起始值
    private int serialNumber;

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
