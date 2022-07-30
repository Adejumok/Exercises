package DataStructureAlgorithm;

public class Set{
    private boolean isEmpty=true;
    private ArrayList set= new ArrayList();

    public boolean isEmpty() {
        if(set.size()==0){
            return true;
        }
        return false;
    }

    public void add(String item) {
        if (!contain(item)){
            set.add(item);
        }

    }

    public void remove(String item) {
        set.remove(item);
    }

    public int size() {
        return set.size();
    }

    public boolean contain(String item){
        for (int i = 0; i < set.size(); i++) {
            if (item.equalsIgnoreCase(set.get(i))){
                return true;
            }
        }
        return false;
    }

    public String get(int index){
        return set.get(index);
    }
}
