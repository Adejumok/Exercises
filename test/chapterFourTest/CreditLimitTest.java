package chapterFourTest;

import chapterFour.CreditLimitCalculator;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditLimitTest {

    CreditLimitCalculator customer;

    @Test
    public void accountNumberExistTest(){
        customer = new CreditLimitCalculator();
        customer.setAccountNumber("0125678435");
        assertEquals("0125678435", customer.getAccountNumber());
    }

    @Test
    public void allowedCreditLimitTest(){
        customer = new CreditLimitCalculator();
        customer.setAllowedCreditLimit(15_000.00);
        assertEquals(15_000.00, customer.getAllowedCreditLimit());
    }

    @Test
    public void checkBalanceTest(){
        customer = new CreditLimitCalculator();
        customer.setBeginMonthBalance(1_200.00);
        assertEquals(1_200.00, customer.getBeginMonthBalance());
    }

    @Test
    public void confirmTotalItemsChargedTest(){
        customer = new CreditLimitCalculator();
        customer.setTotalItemsCharged(8);
        assertEquals(8,customer.getTotalItemsCharged());
    }

    @Test
    public void confirmTotalCreditsAppliedTest(){
        customer = new CreditLimitCalculator();
        customer.setTotalCreditsApplied(20_000.00);
        assertEquals(20_000.00, customer.getTotalCreditsApplied());
    }

    @Test
    public void newBalanceCalculationTest(){
        customer = new CreditLimitCalculator();
        double result = customer.newBalance(1_200.00, 200.00, 100.00);
        assertEquals(1300, result);
    }

    @Test
    public void determineIfNewBalanceExceedCreditLimit(){
        customer = new CreditLimitCalculator();
        customer.setAllowedCreditLimit(20_000);
        assertEquals("Credit limit exceeded!", customer.creditLimitExceed(12_000));

        customer = new CreditLimitCalculator();
        customer.setAllowedCreditLimit(11_000);
        assertEquals("Credit limit is not exceeded", customer.creditLimitExceed(12_000));
    }
}
