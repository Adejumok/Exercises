package tdd;

public class Account {
    private int balance;
    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance = balance + amount ;
    }


    public void withdraw(int money){
       if(money > 0 && money <= balance){
           balance = balance - money;
       }
       else{balance = balance;}
    }
}