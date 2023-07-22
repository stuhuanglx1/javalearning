package chapter08.extend_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel",16,512,"IBM");
        pc.printInfo();
        System.out.println("======================");
        NotePad notePad = new NotePad("intel",16,1024,"black");
        notePad.printInfo();
    }
}

class Computor{
    private String cpu;
    private int memory;
    private int disk;

    public Computor(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getDetails(){
        return "电脑基本信息--cpu：" + cpu + " 内存：" + memory + " 硬盘：" + disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}

class PC extends Computor{
    private String brand;

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println(getDetails() + " brand:" + brand);
    }
}
class NotePad extends Computor{
    private String color;

    //继承设计的基本思想：父类构造器完成父类属性的初始化，子类构造器完成子类属性初始化
    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void printInfo(){
        System.out.println(getDetails() + " color:" + color);
    }
}