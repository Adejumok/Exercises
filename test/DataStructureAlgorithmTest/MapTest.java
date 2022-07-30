package DataStructureAlgorithmTest;

import DataStructureAlgorithm.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {
    Map map;

    @BeforeEach
    void setUp(){
        map= new Map();
    }

    @Test
    public void testThatMapIsCreated(){
        assertNotNull(map);
    }

    @Test
    public void testThatMapIsEmpty(){
        assertTrue(map.isEmpty());
    }

    @Test
    public void testThatMapContainKeyAndValue(){
        map.put("Adamawa", "Yola");
        assertTrue(map.containsKey("Adamawa"));
        assertTrue(map.containsValue("Yola"));
    }

    @Test
    public void addMoreThanOneMap_getSizeTest(){
        map.put("Adamawa", "Yola");
        map.put("Abia", "Umuahia");
        assertEquals(2,map.getSize());
    }

    @Test
    public void addMoreThanOneMap_getOneValueIfSameKeyTest(){
        map.put("Jummie", "Pride");
        map.put("Jummie", "Buga");

        assertEquals("Buga",map.get("Jummie"));
    }

    @Test
    public void addMoreThanOneMap_removeOne_getSizeTest(){
        map.put("Jummie", "Pride");
        map.put("Love", "Buga");
        map.put("Abia", "Umuahia");

        map.remove("Jummie");

        assertEquals(2,map.getSize());
    }
}
