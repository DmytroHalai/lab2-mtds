package main;

public class Node {
    public char data;
    public Node next;
    Node prev;

    public Node(char data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
