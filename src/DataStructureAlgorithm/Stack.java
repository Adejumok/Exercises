package DataStructureAlgorithm;

public class Stack {
    private ArrayList stack=new ArrayList();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(String item) {
        stack.add(item);

    }

    public void pop(String item) {
        stack.remove(item);
    }

    public int size() {
        return stack.size();
    }

    public String peek() {
        return stack.get(stack.size()-1);
    }
}
