package DataStructureAlgorithm;

import java.util.Objects;

public class Map {
    private Set keys=new Set();
    private ArrayList values=new ArrayList();

    public boolean isEmpty() {
        return keys.isEmpty();
    }

    public boolean containsKey(String key) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.contain(key)){
                return true;
            }
        }
        return false;
    }

    public void put(String key, String value) {
        for (int i = 0; i < keys.size(); i++) {
            if (Objects.equals(keys.get(i), key)){
                values.set(i,value);
            }
        }
        keys.add(key);
        values.add(value);
    }


    public boolean containsValue(String value) {
        for (int i = 0; i < values.size(); i++) {
            if (Objects.equals(values.get(i), value)){
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return keys.size();
    }

    public void remove(String key) {
        for (int i = 0; i < keys.size(); i++) {
            if (Objects.equals(keys.get(i), key)) {
                keys.remove(key);
                values.remove(get(key));
            }
            }
    }

    public String get(String key) {
        for (int i = 0; i < keys.size(); i++) {
            if (Objects.equals(keys.get(i), key)) {
                return values.get(i);
            }
        }
        return null;
    }

}
