package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void accountCanBeCreatedTest() {
        //given i have created an account
        Account nepaAccount = new Account();
        //when i check my balance
        int balance = nepaAccount.getBalance();
        //confirm that my balance is zero
        assertEquals(0, balance);
    }

    @Test
    public void depositMoneyTest() {
        //given i have an account
        Account jummyAccount = new Account();
        //when i deposit money
        jummyAccount.deposit(1_500);
        //check that my balance has changed
        assertEquals(1_500, jummyAccount.getBalance());

    }

    @Test
    public void withdrawMoneyTest() {
        //given i have an account
        Account asakeAccount = new Account();
        //when i withdraw money
        asakeAccount.deposit(0);
        //check that my balance has changed
        asakeAccount.withdraw(-5_000);
        assertEquals(0, asakeAccount.getBalance());
    }


}