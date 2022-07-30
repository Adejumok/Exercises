package DataStructureAlgorithm;

public class ArrayList implements List {
    private int size;
    private String[] elements= new String[5];


    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public void add(String item){
        if (size==elements.length){
            String[] tempElements= new String[elements.length*2];
            for (int i = 0; i < elements.length; i++) {
                tempElements[i]=elements[i];
            }
            elements=tempElements;
        }
        elements[size] = item;
        size++;
    }

    @Override
    public void remove(String item){
        --size;
        for (int i = 0; i < elements.length-1; i++) {
            elements[i]= elements[i+1];
        }
    }

    @Override
    public int size(){
        return size;
    }

    public void set(int index, String item){
        for (int i = 0; i < elements.length; i++) {
            if (i==index){
                elements[i]=item;
            }
        }
    }

    public String get(int index) {
        return elements[index];
    }

    @Override
    public int capacity() {
        return elements.length;
    }

}
