package chapter08.poly_.exercise_;

public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;//正确
        long l = (long)d;//正确，强制转换
        System.out.println(l);//输出13
        int in = 5;//正确
//        boolean b = (boolean) in;//错误，boolean->int无法强转
        Object obj = "Hello";//正确,向上转型 编译类型是Object，运行类型是String
        String objStr = (String) obj;//正确，向下转型  编译类型是String，运行类型是String
        System.out.println(objStr);//输出为Hello

        Object objPri = new Integer(5);//正确，向上转型
        String str = (String) objPri;//错误，向下转型 ClassCastException 指向Integer的父类引用转成String类型，显然不可以
        Integer str1 = (Integer) objPri;//正确，标准向下转型
    }
}
