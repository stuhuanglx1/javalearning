package chapter07;

public class MethodExercise01 {
    public static void main(String[] args){
        AA a1 = new AA();
        int n = 343;
        boolean r = a1.isOod(n);
        System.out.println(n + "是否是奇数？" + r);
        a1.printInfo(3,4,'2');

        //方法传参机制
        /*
        ①基本数据类型：传递的是值（值拷贝），形参的任何改变不影响到实参
        ②引用数据类型：传递的是地址,形参影响实参（）！！！！！！视频211-212，很重要！！！！！！
         */
        int a = 10;
        int b = 20;
        a1.swap(a,b);
        System.out.println("a=" + a + " b=" + b);

        int[] arr1 = {2,4,5,2};
        a1.test100(arr1);//200 4 5 2
        System.out.println("主方法的数组");
        for (int i = 0;i < arr1.length;i++){
            System.out.print(arr1[i] + "\t");
        }//200 4 5 2

        B bb = new B();
        bb.name = "huang";
        bb.age = 30;
        a1.test200(bb);
        System.out.println("\nmain中的bb.age=" + bb.age + "name=" + bb.name);//30 huang  看main栈里的bb对象
    }
}

class AA{
    public boolean isOod(int num){
        return num % 2 != 0 ? true : false;//三元运算符
    }

    public void printInfo(int row,int col,char c){
        for (int i = 0;i < row;i++){
            for (int j = 0;j < col;j++){
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }

    public void swap(int a,int b){
        System.out.println("交换前：a=" + a + " b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后：a=" + a + " b=" + b);
    }

    public void test100(int[] arr){
        arr[0] = 200;
        System.out.println("test100的数组");
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public void test200(B bb){
        bb = new B();//在堆内开辟新空间，p内存放了新地址
        bb.age = 10000;
//        bb = null;
//        bb.age = 20987;//空指针异常
    }


}
class B{
    String name;
    int age;
}
