package BankOOPTest;

import BankOOP.AccountC;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountCTest {

    @Test
    public void accountCanWithdrawTest(){
        AccountC accountC = new AccountC(1,"KI","1234");
        accountC.deposit(950);
        accountC.withdraw(50, "1234");
        assertEquals(BigDecimal.valueOf(900),accountC.getBalance());
    }
}
