package BankOOP;

import java.math.BigDecimal;

public class Bank {
    private int numberOfCustomer;
    private AccountC[] accountCs= new AccountC[14];
    private BigDecimal balance;

    public Bank(String bankName) {
        balance=new BigDecimal(0);
    }

    public void register(String customerName, String pin) {
        AccountC accountC=new AccountC(++numberOfCustomer,customerName,pin);
        accountCs[numberOfCustomer-1]=accountC;
    }

    public int getNumberOfCustomer() {
            return numberOfCustomer;
    }

    public AccountC getAccountByAccountNumber(int accountNumber) {
        return accountCs[accountNumber-1];
    }

    public void deposit(int accountNumber,int amount){
        AccountC accountC=getAccountByAccountNumber(accountNumber);
        accountC.deposit(amount);
    }

    public void withdraw(int accountNumber,int amount,String pin){
        AccountC accountC=getAccountByAccountNumber(accountNumber);
        accountC.withdraw(amount,pin);
    }

    public BigDecimal getBalance(int accountNumber) {
        if (findAccount(accountNumber)!=null){
            return findAccount(accountNumber).getBalance();
        }
        return null;
    }

    private AccountC findAccount(int accountNumber){
        for (int i = 0; i < accountCs.length; i++) {
            if (accountCs[i].getAccountNumber()==accountNumber){
                return accountCs[i];
            }
        }
        return null;
    }
}
