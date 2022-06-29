package DataStructureAlgorithmTest;

import DataStructureAlgorithm.ArrayList;
import DataStructureAlgorithm.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queue queue;

    @BeforeEach
    void setUp(){
        queue=new Queue();
    }

    @Test
    public void queueIsEmptyTest(){
        assertTrue(queue.isEmpty());
    }

    @Test
    public void addOneItem_queueIsNotEmptyTest(){
        queue.add("Cookie");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void addMoreThanOneItem_removeOne_queueIsNotEmptyTest(){
        queue.add("Cookie");
        queue.add("Chips");
        queue.offer("Cookie");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void addMoreThanOneItem_removeOne_getSizeTest(){
        queue.add("Cookie");
        queue.add("Chips");
        queue.add("Peanut");
        queue.offer("Cookie");
        assertEquals(2, queue.size());
    }

    @Test
    public void addMoreThanOneItem_checkItemUsingPeekTest(){
        queue.add("Cookie");
        queue.add("Chips");
        queue.add("Peanut");
        String checked=queue.peek();
        assertEquals("Peanut", checked);
    }

    @Test
    public void addMoreThanOneItem_checkItemUsingPollTest(){
        queue.add("Cookie");
        queue.add("Chips");
        queue.add("Peanut");
        String checked=queue.poll();
        assertEquals("Peanut", checked);
    }

    @Test
    public void emptyList_checkItemUsingPeekTest(){
        assertThrows(NoSuchElementException.class,()->queue.peek());
    }

    @Test
    public void emptyList_checkItemUsingPollTest(){
        String checked=queue.poll();
        assertEquals(null, checked);
    }

    @Test
    public void addMoreThanOneItem_removeFirstItemTest(){
        queue.add("Cookie");
        queue.add("Chips");
        assertEquals("Chips",queue.remove());
    }
}
