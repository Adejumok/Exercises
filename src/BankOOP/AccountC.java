package BankOOP;

import java.math.BigDecimal;
import java.util.Objects;

public class AccountC {
    private String pin;
    private BigDecimal balance;
    private String accountName;
    private int accountNumber;

    public AccountC(int number, String name, String pin) {
        this.accountNumber= number;
        this.accountName = name;
        this.pin = pin;
        balance = new BigDecimal(0);
    }

    public void deposit(double amount) {
        BigDecimal depositAmount=new BigDecimal(amount);
        balance = balance.add(depositAmount);
    }

    public void withdraw(int amount, String pin) {
        if (Objects.equals(this.pin,pin)){
            BigDecimal withdrawalDecimalAmount=new BigDecimal(amount);
            balance = balance.subtract(withdrawalDecimalAmount);
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
