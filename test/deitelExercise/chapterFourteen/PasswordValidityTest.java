package deitelExercise.chapterFourteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidityTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void startWithLetters_isValidPasswordTest(){
        String password="d@hlHER94";
        assertTrue(PasswordValidity.isValidPassword(password));
    }

    @Test
    public void startNotLetter_passwordInvalidTest(){
        String password="9hlHER94";
        assertFalse(PasswordValidity.isValidPassword(password));
    }

    @Test
    public void exceedLength8To15_passwordInvalidTest(){
        String password="dhlHER9llhiyffDRF765";
        assertFalse(PasswordValidity.isValidPassword(password));
    }

    @Test
    public void lessThanLength8To15_passwordInvalidTest(){
        String password="d89*HM";
        assertFalse(PasswordValidity.isValidPassword(password));
    }

    @Test
    public void startWithCapitalLetter_passwordValidTest(){
        String password="A?d89*HM0";
        assertTrue(PasswordValidity.isValidPassword(password));
    }
}