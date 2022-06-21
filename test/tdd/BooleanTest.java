package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BooleanTest {
    @Test
    public void differentArrayLengthTest(){
        BooleanLoop boo = new BooleanLoop();
        String[] firstArray = {"Rice","Beans","Garri"};
        String[] secondArray = {"Rice","Beans","Garri","Bread"};
        boolean result = boo.getBoolean(firstArray,secondArray);
        assertFalse(result);
    }

    @Test
    public void sameArrayLengthDifferentElementsTest(){
        BooleanLoop boo = new BooleanLoop();
        String[] array1 = {"Monday", "Tuesday", "Friday", "Thursdays"};
        String[] array2 = {"Wednesday", "Thursday", "Friday", "Sunday"};
        boolean result = boo.getBoolean(array1,array2);
        assertFalse(result);
    }

    @Test
    public void sameArrayLengthSameElementTest(){
        BooleanLoop boo = new BooleanLoop();
        String[] x = {"Chief", "Elders", "Ancestors"};
        String[] y = {"Chief", "Elders", "Ancestors"};
        boolean result = boo.getBoolean(x, y);
        assertTrue(result);
    }

    @Test
    public void sameElementDifferentCases(){
        BooleanLoop boo = new BooleanLoop();
        String[] firstSet = {"Cake", "chocolate", "Doughnut"};
        String[] secondSet = {"cake", "Chocolate", "Doughnut"};
        boolean result = boo.getBoolean(firstSet, secondSet);
        assertTrue(result);
    }
}
