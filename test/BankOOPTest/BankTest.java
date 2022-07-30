package BankOOPTest;

import BankOOP.AccountC;
import BankOOP.Bank;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    @Test public void bankCanCreateAccountTest(){
        Bank ogaBank = new Bank("Oga Bank Plc");
        ogaBank.register("Bukky", "9806");
        ogaBank.register("Meka", "4409");
        assertEquals(2, ogaBank.getNumberOfCustomer());
    }

    @Test public void newAccountHaveAccountNumber(){
        Bank ogaBank = new Bank("Oga Bank Plc");
        ogaBank.register("Bukky", "9806");
        ogaBank.register("Lucky", "3441");
        AccountC savedAccount = ogaBank.getAccountByAccountNumber(2);
        assertEquals("Lucky",savedAccount.getAccountName());
        assertEquals(2,savedAccount.getAccountNumber());
    }

    @Test public void newAccountHaveByAccountNumber() {
        Bank ogaBank = new Bank("Oga Bank Plc");
        ogaBank.register("Bukky", "9806");
        ogaBank.deposit(1,100);
        assertEquals(BigDecimal.valueOf(100),ogaBank.getBalance(1));
    }
}
