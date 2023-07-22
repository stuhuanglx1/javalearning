package chapter08.encapsulation;

public class Exercise02_AccountTest {
    public static void main(String[] args){
        Exercise02_Account account = new Exercise02_Account();
        account.setName("dalin");
        account.setBalance(26);
        account.setPassword("878787");
        System.out.println(account.showInfo("878787"));

        Exercise02_Account hansome = new Exercise02_Account("hansome", 63, "123456");
        System.out.println(hansome.showInfo("123456"));

    }
}

