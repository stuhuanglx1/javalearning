package chapter08.homework;

public class Homework08 {
    public static void main(String[] args) {
        CheckAccount08 checkAccount = new CheckAccount08(1000);
        checkAccount.deposit(10);//1009
        System.out.println(checkAccount.getBalance());
        checkAccount.withdraw(10);//998
        System.out.println(checkAccount.getBalance());

        System.out.println("===================");
        SavingAccount08 savingAccount = new SavingAccount08(300);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());//600
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());//699
        //用定时器定期调用earnMothlyInterst()
        savingAccount.earnMothlyInterst();
        System.out.println(savingAccount.getBalance());//705.99
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());//805.99
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);
        System.out.println(savingAccount.getBalance());//605.99
        savingAccount.withdraw(100);
        System.out.println(savingAccount.getBalance());//604.99

    }
}
class BankAccount08{
    private double balance;
    public BankAccount08(double initialBalance){
        this.balance = initialBalance;
    }
    //存款
    public void deposit(double amount){
        balance += amount;
    }
    //取款
    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class CheckAccount08 extends BankAccount08{
    public CheckAccount08(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
class SavingAccount08 extends BankAccount08{
    private int count = 3;
    private double rate = 0.01;

    public SavingAccount08(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        //判断是否免手续费
        if (count > 0) {
            super.deposit(amount);
            count--;
        }else {
            super.deposit(amount - 1);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0){
            super.withdraw(amount);
            count--;
        }else {
            super.withdraw(amount + 1);
        }
    }
    public void earnMothlyInterst(){//每个月初，统计上个月利息，同时count = 3
        super.deposit(getBalance() * rate);
        count = 3;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
