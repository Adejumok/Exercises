package PhoneBook;

import java.util.ArrayList;

public class PhoneBookEntries {
    private ArrayList<AnEntry> entries=new ArrayList<>();

    public void addEntry(AnEntry entry) {
        entries.add(entry);
    }

    public AnEntry getEntry(int id) {
        return entries.get(id-1);
    }

    public AnEntry getEntry(String name) {
        return entries.get(locateEntry(name));
    }

    public int getEntrySize() {
        return entries.size();
    }

    public void printOutEntries() {
        System.out.println("The entries present are: ");
        for(int i=0;i<entries.size();i++){
            System.out.println(entries.get(i));
        }
    }

    private int locateEntry(String name){
        for (int i = 0; i < entries.size(); i++) {
            AnEntry entry=entries.get(i);
            if (entry.getName().equalsIgnoreCase(name)){
                return i;
            }
        }return -1;
    }

    public void deleteEntry(String name) {
        int index=locateEntry(name);
        if (index>=0){
            deleteEntry(index);
        }
        else {
            System.out.println("This entry does not exist.");
        }
    }

    private void deleteEntry(int index) {
        entries.remove(index);
    }
}
