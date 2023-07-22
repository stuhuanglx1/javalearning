package chapter08.SmallChangeSys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner myScanner = new Scanner(System.in);
    String option = "";
    String detail = "----------零钱通明细----------";
    double money = 0;
    double balance = 0;
    Date data = null;//data是java.util.data的包
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";

    public void func(){
        do {
            this.showMenu();
            switch (option){
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("菜单选择有误，请重新选择");
            }
        }while (this.loop);
        System.out.println("退出零钱通。。。");
    }

    public void showMenu(){
        //菜单
        System.out.println("=============菜单=============");
        System.out.println("\t\t\t\t1\t零钱通明细");
        System.out.println("\t\t\t\t2\t收益入账");
        System.out.println("\t\t\t\t3\t消费");
        System.out.println("\t\t\t\t4\t退出");
        //输入菜单选项
        System.out.println("请选择（1-4）：");
        option = myScanner.next();
    }

    public void detail(){
        System.out.println(detail);
    }
    public void income(){
        System.out.println("请输入入账金额：");
        money = myScanner.nextDouble();
        if (money <= 0){
            System.out.println("收益入账金额需要大于0");
            return;//退出方法，不再执行
        }
        balance += money;
        data = new Date();//获取当前日期
        detail += "\n收益入账\t+" + money + "\t" + sdf.format(data) + "\t余额" + balance;
    }
    public void pay(){
        System.out.println("请输入消费金额：");
        money = myScanner.nextDouble();
        //在进行判断时，找出不正确金额条件，然后给出提示，直接break
        //减少分支，代码更清爽
        if (money > balance || money <= 0){
            System.out.println("您的消费金额应该在0-" + balance + "之间");
            return;
        }
        System.out.println("消费说明：");
        note = myScanner.next();
        balance -= money;
        data = new Date();//获取当前日期
        detail += "\n" + note +"\t-" + money + "\t" + sdf.format(data) + "\t余额" + balance;
    }
    public void exit(){
        String choice = "";
        //每一段代码尽可能按功能拆分，扩展性好，可读性强，耦合性小
        //建议一段代码，完成一个小功能，尽量不要混在一起
        while (true){
            System.out.println("你确定要退出吗？y/n");
            choice = myScanner.next();
            if ("y".equals(choice) || "n".equals(choice)){
                break;
            }
        }
        if ("y".equals(choice)){
            loop = false;
        }
    }

}
