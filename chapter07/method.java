package chapter07;

public class method {
    public static void main(String[] args){

        Person1 p1 = new Person1();
        p1.speak();
        p1.cal01();
        p1.cal02(9);
        int sum = p1.getSum(3,8);
        System.out.println("两个数相加结果：" + sum);
        /*
        方法调用机制：
        ①在栈内开辟空间（main栈），堆内产生对象
        ②程序执行到方法时，会开辟一个独立空间（栈空间）
        ③方法执行完毕后会返回到调用方法的位置
        ④结果出栈后，独立空间被释放
         */
        int[][] a = {{3,5},{6,9,2,2},{4}};
        p1.printArr(a);
        //方法的好处：1)提高代码复用性；2)将实现细节封装起来，可直接调用

        /*
        方法细节：
        ①一个方法最多有一个返回值；如果想要多个返回值，可以使用-数组-数据类型
        ②如果方法要求有返回数据类型，则方法体最后一句必须执行return语句，且返回值类型与return值类型一致或兼容
        ③如果是void，则没有return
        ④方法名一定要有含义
        ⑤调用带参数的方法时，参数列表传入的数据类型一定是相同类型或者可兼容类型
        ⑥把实参赋给形参，保证兼容、个数一致、顺序一致
        ⑦方法体内不能嵌套定义方法

        类内成员方法的调用：
        1、同一个类的方法：直接调用
        2、跨类A调用B类的方法：先在A类方法中创建B类对象,在调用方法即可
        B b = new B();
        b.hi();
        3、跨类调用与访问修饰符以及包相关
         */
        int[] res = p1.getSumAndSub(5,9);
        System.out.println("和："+res[0]+" 差："+res[1]);

    }
}

class Person1{
    String name;
    int age;

    //成员方法
    public void speak(){
        System.out.println("我是一个好人");
    }

    public void cal01(){
        int sum = 0;
        for (int i = 1;i <= 100;i++){
            sum += i;
        }
        System.out.println("累加结果：" + sum);
    }

    public void cal02(int end){
        int sum = 0;
        for (int i = 1;i <= end;i++){
            sum += i;
        }
        System.out.println("累加结果：" + sum);
    }

    public int getSum(int a,int b){
        return a + b;
    }

    public void printArr(int[][] arr){
        for (int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int[] getSumAndSub(int n1,int n2){
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

}
