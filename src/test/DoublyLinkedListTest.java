package test;

import main.DoublyLinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {

    @Test
    public void testAppend() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append('A');
        list.append('B');
        list.append('C');

        assertEquals(3, list.length(), "Length should be 3 after appending elements");
    }

    @Test
    void testInsertAtStart() throws Exception {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append('A');
        list.insert('B', 0);

        assertEquals(2, list.length(), "Length should be 2 after inserting at the start");
        assertEquals('B', list.head.data, "Head should be 'B' after insertion at start");
    }

    @Test
    void testInsertAtEnd() throws Exception {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append('A');
        list.append('B');
        list.insert('C', 2);

        assertEquals(3, list.length(), "Length should be 3 after inserting at the end");
        assertEquals('C', list.tail.data, "Tail should be 'C' after insertion at end");
    }

    @Test
    void testInsertAtMiddle() throws Exception {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append('A');
        list.append('C');
        list.insert('B', 1);

        assertEquals(3, list.length(), "Length should be 3 after inserting in the middle");
        assertEquals('B', list.head.next.data, "Second element should be 'B' after middle insertion");
    }

    @Test
    void testDelete() throws Exception {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append('A');
        list.append('B');
        list.append('C');

        char deleted = list.delete(1);

        assertEquals('B', deleted, "Deleted element should be 'B'");
        assertEquals(2, list.length(), "Length should be 2 after deletion");
    }

    @Test
    void testDeleteAll() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append('A');
        list.append('B');
        list.append('A');
        list.append('C');

        list.deleteAll('A');

        assertEquals(2, list.length(), "Length should be 2 after deleting all 'A's");
    }

    @Test
    void testLength() {
        DoublyLinkedList list = new DoublyLinkedList();
        assertEquals(0, list.length(), "Length should be 0 for an empty list");

        list.append('A');
        assertEquals(1, list.length(), "Length should be 1 after appending 1 element");
    }

    @Test
    void testCheckIndex() {
        DoublyLinkedList list = new DoublyLinkedList();

        Exception exception = assertThrows(Exception.class, () -> list.insert('A', 1));

        String expectedMessage = "Index is not valid";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage), "Exception message should contain 'Index is not valid'");
    }
}
