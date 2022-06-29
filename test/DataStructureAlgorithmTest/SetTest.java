package DataStructureAlgorithmTest;

import DataStructureAlgorithm.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    Set set;

    @BeforeEach
    void setUp(){
        set= new Set();
    }

    @Test
    void newSetIsEmptyTest(){
        assertTrue(set.isEmpty());
    }

    @Test
    void newSetIsNotEmpty(){
        set.add("Roll-on");
        assertFalse(set.isEmpty());
    }

    @Test
    void removeItem_newSetIsEmpty(){
        set.add("Roll-on");
        set.remove("Roll-on");
        assertTrue(set.isEmpty());
    }

    @Test
    void addMoreThanOne_getSize(){
        set.add("Roll-on");
        set.add("Roll-on");
        assertEquals(2,set.size());
    }

    @Test
    void addMoreThanOne_removeOne_getSize(){
        set.add("Roll-on");
        set.add("Chicken-pie");
        set.remove("Roll-on");
        assertEquals(1,set.size());
    }

    @Test
    void addMoreThanOne_removeOne_getStatus(){
        set.add("Roll-on");
        set.add("Chicken-pie");
        set.remove("Roll-on");
        assertFalse(set.isEmpty());
    }

    @Test
    void sameItemAddedMoreThanOnce_getOneIt(){
        set.add("Roll-on");
        set.add("Chicken-pie");
        set.add("Roll-on");
        assertEquals(2,set.size());


    }


}
