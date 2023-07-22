package chapter08.Object_;

public class toString_ {
    public static void main(String[] args) {
        Monster monster = new Monster("cute", "巡山", 300);
        System.out.println(monster.toString() + " " + monster.hashCode());
        //没有重写输出的是  chapter08.Object_.Monster@1b6d3586 460141958
        //重写后输出的是  Monster{name='cute', job='巡山', sal=300.0} 460141958
        System.out.println(monster);//等价于monster.toString

    }

}
class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }
    //重写toString方法，输出对象属性

    @Override
    public String toString() {
        return "Monster{" +
                "名字='" + name + '\'' +
                ", 工作='" + job + '\'' +
                ", 薪水=" + sal +
                '}';
    }
}
