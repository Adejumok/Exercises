package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomewrkTest {

    @Test
    public void sumFirst10(){
        Homewrk total = new Homewrk();
        int result = total.firstTenSum(10);
        assertEquals(55, result);
    }

    @Test
    public void factorialValue(){
        Homewrk maths = new Homewrk();
        int result = maths.factorialNumber(5);
        assertEquals(120, result);
    }


}
