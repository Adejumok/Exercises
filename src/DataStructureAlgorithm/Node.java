package DataStructureAlgorithm;

public class Node {
    private String item;
    private Node next;
    private Node previous;

    public Node(Node previous,String item, Node next) {
        this.item = item;
        this.next = next;
        this.previous=previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
