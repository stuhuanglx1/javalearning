package chapter05;

public class exercise07_continue_return {
    public static void main(String[] args){
        //跳转控制语句continue--结束本次循环，继续执行下一次循环
        int i1 = 0;
        while (i1 <= 4){
            i1++;
            if (i1 == 2){
                continue;
            }
            System.out.println("i1 = " + i1);
        }//输出1、3、4、5，没有打印2

        //continue细节案例--标签：规则和break的标签使用规则一致
        label1:
        for (int i = 0;i < 3;i++){
        label2:
            for (int j = 0;j < 5;j++){
                if (j == 2){
                    continue label1;
                }
                System.out.println("i=" +i +"j=" + j);
            }
        }

        //return--在使用方法时，跳出方法；写在main主程序，则意味着退出程序
        for (int i = 1;i <= 5;i++){
            if (i == 3){
                System.out.println("好帅好帅" + i);
                return;
            }
            System.out.println("hello world");
        }
        System.out.println("go on");//go on没有被打印！！！

    }
}
