package DiaryM;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String name;
    private int id;
    private ArrayList<Entry> theEntries= new ArrayList<>();
    public Diary(String name){
        this.name=name;
    }

    public void setName(String name){
        this.name= name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return String.format("""
                Name: %s
                """, name);
    }

    public void addEntry(Entry entry) {
        if (theEntries.contains(entry)){
            throw new RuntimeException("Huush! Entry already exist");
        }else {
            theEntries.add(entry);
        }
    }

    public int getEntriesSize() {
        return theEntries.size();
    }

    public Entry getEntry(int id) {
        return theEntries.get(id-1);
    }
    
    private int getEntryIndex(String entryTitle){
        for (int index=0;index< theEntries.size();index++) {
            Entry theEntry=theEntries.get(index);
            if (theEntry.getTitle().equalsIgnoreCase(entryTitle)){
                return index;
            }
        }
        return -1;
    }

    public void editEntryTitle(String entryTitle,String newTitle) {
        int position=getEntryIndex(entryTitle);
        if (position>=0){
            theEntries.get(position).setTitle(newTitle);
        }
        else{
        System.out.println("This entry does not exist!");}
    }

    public void editEntryBody(String oldEntryTitle,String newBody) {
        int position=getEntryIndex(oldEntryTitle);
        if (position>=0){
            theEntries.get(position).setBody(newBody);
        }
        else{
            System.out.println("This entry does not exist!");}
    }

    public void deleteEntry(String entryTitle) {
        int position=getEntryIndex(entryTitle);
        if (position>=0){
            theEntries.remove(position);
        }
        else{
        System.out.println("This entry does not exist!");}
    }
    public List<Entry> printAllEntries() {
        if (theEntries.isEmpty()){
            System.out.println("There is no entry in this diary!");
        }
        return theEntries;
    }
}
