package DiaryM;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Diary {
    private String name;

    private LocalDateTime localDateTime;
    private int id=0;
    private ArrayList<Entry> theEntries= new ArrayList<>();
    public Diary(String name){
        this.name=name;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("""
                Name: %s
                """, name);
    }

    private String generateId(String title){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            stringBuilder.append(title.charAt(i));
        }
        return stringBuilder.toString();
    }

    public void addEntry(Entry entry) {
        if (theEntries.contains(entry)){
            throw new RuntimeException("Huush! Entry already exist");
        }else {
            entry.setId(++id);
            theEntries.add(entry);
        }
    }

    public int getNumberOfEntries() {
        return theEntries.size();
    }

    public String getEntry(int id) {
        for (Entry findEntry:theEntries){
            if (id==(findEntry.getId())){
                return findEntry.getTitle();
            }
        }throw new RuntimeException("Kai! Entry does not exist.");

    }

    public int getAllEntries() {
        return theEntries.size();
    }

    public void editEntry(Entry entry, int id) {
        if (!theEntries.contains(entry)) {
            throw new RuntimeException();
        } else {
            theEntries.set(id-1,entry);
        }
    }

    public void deleteEntry(Entry entry) {
        if (!theEntries.contains(entry)) {
            throw new RuntimeException();
        } else {
            theEntries.remove(entry);
        }

    }
}
