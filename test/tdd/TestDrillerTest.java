package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {


    @Test
    public void firstSetOfCopiesTest(){
        TestDriller utme = new TestDriller();
        utme.copy(4);
        int result = utme.pricePerCopy(2_000);
        assertEquals(2_000, result);

    }

    @Test
    public void secondSetOfCopiesTest(){
        TestDriller utme = new TestDriller();
        utme.copy(7);
        int result = utme.pricePerCopy(1_800);
        assertEquals(1_800, result);

    }

    @Test
    public void thirdSetOfCopiesTest(){
        TestDriller utme = new TestDriller();
        utme.copy(29);
        int result = utme.pricePerCopy(1_600);
        assertEquals(1_600, result);

    }

    @Test
    public void fourthSetOfCopiesTest(){
        TestDriller utme = new TestDriller();
        utme.copy(49);
        int result = utme.pricePerCopy(1_500);
        assertEquals(1_500, result);

    }

    @Test
    public void fifthSetOfCopiesTest(){
        TestDriller utme = new TestDriller();
        utme.copy(99);
        int result = utme.pricePerCopy(1_300);
        assertEquals(1_300, result);

    }

    @Test
    public void sixthSetOfCopiesTest(){
        TestDriller utme = new TestDriller();
        utme.copy(199);
        int result = utme.pricePerCopy(1_200);
        assertEquals(1_200, result);

    }

    @Test
    public void seventhSetOfCopiesTest(){
        TestDriller utme = new TestDriller();
        utme.copy(499);
        int result = utme.pricePerCopy(1_100);
        assertEquals(1_100, result);

    }

    @Test
    public void eightSetOfCopiesTest(){
        TestDriller utme = new TestDriller();
        utme.copy(500);
        int result = utme.pricePerCopy(1_000);
        assertEquals(1_000, result);

    }

}
