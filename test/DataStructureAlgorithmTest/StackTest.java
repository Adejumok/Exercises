package DataStructureAlgorithmTest;

import DataStructureAlgorithm.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack;

    @BeforeEach
    void setUp(){
        stack = new Stack();
    }

    @Test
    public void stackIsEmptyTest(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void stackIsNotEmptyTest(){
        stack.push("Java Textbook");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void notEmptyPushMoreThanOneItem_removeOneTest(){
        stack.push("Java Textbook");
        stack.push("DataBase Textbook");
        stack.pop("Java Textbook");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushMoreThanOneItem_removeOne_getSizeTest(){
        stack.push("Java Textbook");
        stack.push("DataBase Textbook");
        stack.push("Python Textbook");
        stack.pop("Java Textbook");

        assertEquals(2, stack.size());
    }

    @Test
    public void checkLastItemInTest(){
        stack.push("Java Textbook");
        stack.push("DataBase Textbook");
        stack.push("Python Textbook");
        assertEquals("Python Textbook", stack.peek());
    }
}
