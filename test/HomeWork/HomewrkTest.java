package HomeWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Homewrk;

import static org.junit.jupiter.api.Assertions.*;

public class HomewrkTest {

    Homewrk homewrk = new Homewrk();

    @Test
    public void sumFirst10Test(){
        int result = homewrk.firstTenSum(10);
        assertEquals(55, result);
    }

    @Test
    public void factorialValueTest(){
        int result = homewrk.factorialNumber(5);
        assertEquals(120, result);
    }


    @Test
    public void differentArrayLengthTest(){
        String[] firstArray = {"Rice","Beans","Garri"};
        String[] secondArray = {"Rice","Beans","Garri","Bread"};
        boolean result = homewrk.getBoolean(firstArray,secondArray);
        assertFalse(result);
    }

    @Test
    public void sameArrayLengthDifferentElementsTest(){
        String[] array1 = {"Monday", "Tuesday", "Friday", "Thursdays"};
        String[] array2 = {"Wednesday", "Thursday", "Friday", "Sunday"};
        boolean result = homewrk.getBoolean(array1,array2);
        assertFalse(result);
    }

    @Test
    public void sameArrayLengthSameElementTest(){
        String[] x = {"Chief", "Elders", "Ancestors"};
        String[] y = {"Chief", "Elders", "Ancestors"};
        boolean result = homewrk.getBoolean(x, y);
        assertTrue(result);
    }

    @Test
    public void sameElementDifferentCases(){
        String[] firstSet = {"Cake", "chocolate", "Doughnut"};
        String[] secondSet = {"cake", "Chocolate", "Doughnut"};
        boolean result = homewrk.getBoolean(firstSet, secondSet);
        assertTrue(result);
    }


}
