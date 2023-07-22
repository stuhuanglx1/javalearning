package chapter09;

import chapter09.view.HouseView;

//程序入口
//创建HouseView对象，调用该对象，显示主菜单
public class HouseRentAPP {
    public static void main(String[] args) {
        new HouseView().mainMenu();
//        new HouseView().listHouses();
        System.out.println("====退出房屋出租系统====");
    }
}
