package DataStructureAlgorithm;

public class LinkedList {

    private Node first;
    private Node last;
    int count;
    private ArrayList list=new ArrayList();

    public void addFirst(String item) {
        linkFirst(item);
    }

    public int size() {
        return count;
    }

    private void linkFirst(String item) {
        Node f=first;
        Node newNode=new Node(null,item,f);
        first=newNode;
        if (f==null){
            last=newNode;
        }
        else {
            f.setPrevious(newNode);
        }
        count++;
    }

    private void linkLast(String item) {
        Node l=last;
        Node newNode=new Node(l,item,null);
        last=newNode;
        if (l==null){
            first=newNode;
        }
        else {
            l.setNext(newNode);
        }
        count++;
    }

    private void unLinkFirst(Node one){

    }

    public void addLast(String item) {
        linkLast(item);
    }

    public void removeFirst(String item) {
    }
}
