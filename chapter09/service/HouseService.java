package chapter09.service;

import chapter09.domain.House;

//业务层
//响应HouseService的调用，完成对房屋的各种操作（增删改查crud）
public class HouseService {
    private House[] houses;
    private int houseNum;//记录当前有多少个房屋
    private int idCount;
    public HouseService(int size){
        houses = new House[size];

    }

    //接收一个House对象，将新对象的houses数组
    public boolean add(House newHouse){
        if (houseNum == houses.length){
            System.out.println("数组已满，不能再添加");
            return false;
        }
        newHouse.setId(++idCount);
        houses[houseNum++] = newHouse;

        return true;
    }
    //查找房屋
    public House find(int findID){
        for (int i = 0; i < houseNum; i++) {
            if (findID == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
    //删除房屋信息
    public boolean delete(int deleteID){
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (deleteID == houses[i].getId()){
                index = i;
            }
        }
        if (index == -1){
            System.out.println("未找到该编号对应房屋");
            return false;
        }
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNum] = null;
        return true;
    }
    //返回所有的房屋信息
    public House[] list(){
        return houses;
    }
}
