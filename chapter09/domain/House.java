package chapter09.domain;

//实体类（domain、model）
//一个House对象就表示一个房屋信息
public class House {
    private int id;
    private String name;
    private String telNum;
    private String address;
    private int rent;
    private String state;

    public House(int id, String name, String telNum, String address, int rent, String state) {
        this.id = id;
        this.name = name;
        this.telNum = telNum;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return id + "\t\t" + name + "\t\t" + telNum + "\t\t" + address + "\t\t" + rent + "\t\t" + state;
    }
}
