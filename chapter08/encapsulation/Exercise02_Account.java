package chapter08.encapsulation;

public class Exercise02_Account {
    private String name;
    private double balance;
    private String password;

    public Exercise02_Account() {
    }

    public Exercise02_Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 8){
            this.name = name;
        } else {
            System.out.println("名字长度不符合规定，先将名字给予一个默认值");
            this.name = "张三";
        }
    }

    public double getYue() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20){
            this.balance = balance;

        }else {
            this.balance = 0;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6){
            this.password = password;
        } else {
            System.out.println("密码必须是六位，给予默认密码");
            this.password = "000000";
        }
    }

    public String showInfo(String password){
        if (password == this.password){
            return "信息为 name=" + name + " balance=" + balance;
        } else {
            return "你无权查看余额";
        }
    }
}
