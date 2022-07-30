package DataStructureAlgorithmTest;

import DataStructureAlgorithm.LinkedList;
import DataStructureAlgorithm.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    Node node;
    Node next;
    Node previous;

    LinkedList linkedList;

    @BeforeEach
    void setUp() {
        node=new Node(previous,"Cookie",next);
        linkedList=new LinkedList();
    }

    @Test
    public void addFirstTest(){
        linkedList.addFirst("Key");
        assertEquals(1,linkedList.size());
    }

    @Test
    public void addLastTest(){
        linkedList.addLast("Key");
        assertEquals(1,linkedList.size());
    }

    @Test
    public void removeFirstTest(){
        linkedList.addFirst("Key");
        linkedList.addLast("Ice");
        linkedList.addLast("Cookies");

        linkedList.removeFirst("Key");
        assertEquals(3,linkedList.size());
    }


}