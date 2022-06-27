package DataStructureAlgorithmTest;

import DataStructureAlgorithm.ArrayList;
import DataStructureAlgorithm.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {
    List list;


    @BeforeEach
    void setUp(){
        list=new ArrayList();
    }

    @Test
    void newListEmptyTest(){
        assertTrue(list.isEmpty());
    }

    @Test
    void addItem_ListIsNotEmptyTest(){
        list.add("Milk");
        assertFalse(list.isEmpty());
    }

    @Test
    void removeItem_ListIsEmptyTest(){
        list.add("Milk");
        list.remove("Milk");
        assertTrue(list.isEmpty());
    }

    @Test
    void addItem_sizeIncreasesTest(){
        list.add("Pounded Eba");
        assertEquals(1, list.size());
    }

    @Test
    void addMoreThanOneItem_sizeIncreasesTest(){
        list.add("Pounded Eba");
        list.add("Flake");
        assertEquals(2, list.size());
    }

    @Test
    void addMoreThanOneItem_removeOne_sizeDecreasesTest(){
        list.add("Pounded Eba");
        list.add("Flake");
        list.remove("Flake");
        assertEquals(1, list.size());
    }

    @Test
    void addMoreThanOneItem_removeOne_listIsNotEmptyTest(){
        list.add("Pounded Eba");
        list.add("Flake");
        list.remove("Flake");
        assertFalse(list.isEmpty());
    }

    @Test
    void retrieveFirstAddedItemTest(){
        list.add("Flake");
        list.add("Pounded Eba");
        String gotten = list.get(0);
        assertEquals("Flake", gotten);
    }

    @Test
    void retrieveSecondAddedItemTest(){
        list.add("Flake");
        list.add("Pounded Eba");
        String gotten = list.get(1);
        assertEquals("Pounded Eba", gotten);
    }

    @Test
    void addF_GandH_removeF_getF_shouldReturnGTest(){
        list.add("Flake");
        list.add("Pounded Eba");
        list.add("Darling Hair");

        list.remove("Flake");
        String gotten = list.get(0);
        assertEquals("Pounded Eba", gotten);
    }

    @Test
    void addF_G_HandI_removeG_getG_shouldReturnHTest(){
        list.add("Flake");
        list.add("Pounded Eba");
        list.add("Darling Hair");
        list.add("Coffee");

        list.remove("Pounded Eba");
        String gotten = list.get(1);
        assertEquals("Darling Hair", gotten);
    }

    @Test
    void addSixElements_capacityShouldBeDoubled(){
        assertEquals(5, list.capacity());
        list.add("Flake");
        list.add("Pounded Eba");
        list.add("Darling Hair");
        list.add("Coffee");
        list.add("Shrub");
        list.add("Groundnut");

        assertEquals(10, list.capacity());
    }

    @Test
    void addTwelveElements_capacityShouldBeDoubled(){
        assertEquals(5, list.capacity());
        list.add("Flake");
        list.add("Pounded Eba");
        list.add("Darling Hair");
        list.add("Coffee");
        list.add("Shrub");
        list.add("Groundnut");
        list.add("Flake");
        list.add("Pounded Eba");
        list.add("Darling Hair");
        list.add("Coffee");
        list.add("Shrub");
        list.add("Groundnut");

        assertEquals(20, list.capacity());
    }
}
