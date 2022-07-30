package DataStructureAlgorithm;

import java.util.NoSuchElementException;

public class Queue {
    private int queueLimit=10;
    private ArrayList queue= new ArrayList();

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void add(String item) {
            queue.add(item);
    }

    public void offer(String item) {
        queue.remove(item);
    }

    public int size() {
        if (queue.size() < queueLimit){
            return queue.size();
        }
        throw new IndexOutOfBoundsException("You've exceeded the queue limit!");
    }

    public String peek() {
        if (isEmpty()){
            throw new NoSuchElementException("There is no element in the list");
        }
        return queue.get(0);
    }

    public String poll() {
        if (isEmpty()){
            return null;
        }
        return queue.get(0);
    }

    public String remove() {
        if (isEmpty()){
            return null;
        }
        queue.remove(queue.get(0));
        return queue.get(0);
    }
}
