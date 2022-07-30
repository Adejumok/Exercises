package DataStructureAlgorithm;

import java.util.EmptyStackException;

public class Stack {
    private int stackLimit=10;
    private ArrayList stack=new ArrayList();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String push(String item) {
        stack.add(item);
        return item;

    }

    public String pop() {
        if (!isEmpty()){
            String item;
            item=peek();
            stack.remove(stack.get(size()-1));
            return item;
        }
        throw new EmptyStackException();
    }

    public int size() {
        if (stack.size()<stackLimit){
            return stack.size();
        }
        throw new IndexOutOfBoundsException("You don pass stack limit!");
    }

    public String peek() {
        if (!isEmpty()){
            return stack.get(stack.size()-1);
        }
        throw new EmptyStackException();
    }

}
