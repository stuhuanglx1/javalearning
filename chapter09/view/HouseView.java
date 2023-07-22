package chapter09.view;

import chapter09.domain.House;
import chapter09.service.HouseService;
import chapter09.utils.Utility;

//界面
// 1\显示界面
// 2\接收用户输入，
// 3\调用HouseServise类，完成房屋信息的各类操作
public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);//设置数组大小为10


    //接收用户输入，增加房屋
    public void addHouse(){
        System.out.println("-----------------添加房屋---------------");
        System.out.print("姓名:");
        String name = Utility.readString(8);
        System.out.print("电话:");
        String telNum = Utility.readString(12);
        System.out.print("地址:");
        String address = Utility.readString(16);
        System.out.print("月租:");
        int rent = Utility.readInt();
        System.out.print("状态（未出租/已出租）:");
        String state = Utility.readString(3);
        //创建一个House对象
        House house = new House(0, name, telNum, address, rent, state);
        if (houseService.add(house)){
            System.out.println("添加房屋成功");
        }else {
            System.out.println("添加房屋失败");
        }
        System.out.println("----------------添加房屋完毕---------------");
    }
    //查找房屋
    public void findHouse(){
        System.out.println("-----------------查找房屋---------------");
        System.out.print("请输入需查找房屋的编号：");
        int findID = Utility.readInt();
        House house = houseService.find(findID);
        if (house != null){
            System.out.println(house);
            System.out.println("---------------查找房屋完成--------------");
        }else {
            System.out.println("-------------查找房屋id不存在-------------");
        }
    }

    //删除房屋
    public void deleteHouse(){
        System.out.println("-----------------删除房屋---------------");
        System.out.print("请输入需删除房屋的编号(-1退出)：");
        int deleteID = Utility.readInt();
        if (deleteID == -1){
            System.out.println("放弃删除");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            if (houseService.delete(deleteID)){
                System.out.println("---------------删除房屋完成--------------");
            }else {
                System.out.println("---------------删除房屋失败--------------");
            }
        }else {
            System.out.println("你放弃删除");
        }

    }
    //修改房屋信息
    public void updataHouse(){
        System.out.println("-----------------修改房屋信息---------------");
        System.out.print("请输入需要修改房屋信息的编号（-1表示退出）：");
        int updateID = Utility.readInt();
        if (updateID == -1){
            System.out.println("-------------放弃修改房屋信息-------------");
            return;
        }
        House house = houseService.find(updateID);
        if (house == null){
            System.out.println("------------修改房屋信息不存在-------------");
            return;
        }
        System.out.print("姓名（" + house.getName() + "）：");
        String name = Utility.readString(8,"");//如果直接回车，表示不该该信息
        if (!"".equals(name)){
            house.setName(name);
        }
        System.out.print("电话（" + house.getTelNum() + "）：");
        String telNum = Utility.readString(12,"");//如果直接回车，表示不该该信息
        if (!"".equals(telNum)){
            house.setTelNum(telNum);
        }
        System.out.print("地址（" + house.getAddress() + "）：");
        String address = Utility.readString(16,"");//如果直接回车，表示不该该信息
        if (!"".equals(address)){
            house.setAddress(address);
        }
        System.out.print("月租（" + house.getRent() + "）：");
        int rent = Utility.readInt(-1);//如果直接回车，表示不该该信息
        if (rent != -1){
            house.setRent(rent);
        }
        System.out.print("状态（" + house.getState() + "）：");
        String state = Utility.readString(3,"");//如果直接回车，表示不该该信息
        if (!"".equals(state)){
            house.setState(state);
        }
        System.out.println("---------------修改房屋信息完成--------------");

    }

    //listHouse显示房屋列表
    public void listHouses(){
        System.out.println("----------------------房屋列表------------------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("----------------------房屋列表完成-----------------------");
    }
    //确认退出方法
    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }

    public void mainMenu(){

        do {
            System.out.println("================房屋出租系统菜单================");
            System.out.println("\t\t\t1\t新增房源");
            System.out.println("\t\t\t2\t查找房屋");
            System.out.println("\t\t\t3\t删除房屋");
            System.out.println("\t\t\t4\t修改房屋信息");
            System.out.println("\t\t\t5\t房屋列表");
            System.out.println("\t\t\t6\t退出");
            System.out.println("请输入你的选择（1-6）");
            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    deleteHouse();
                    break;
                case '4':
                    updataHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("输入错误,请重新输入");
                    break;
            }

        }while (loop);
    }
}

