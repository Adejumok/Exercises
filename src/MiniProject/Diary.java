package MiniProject;

import java.util.ArrayList;

public class Diary {

    private String name;
    private String dateCreated;
    private String id;
    private ArrayList<EntryD> theEntries;


    public Diary(){
        theEntries = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Diary(String name, String dateCreated, String id) {
        this.name = name;
        this.dateCreated = dateCreated;
        this.id = id;
    }

    public void addEntry(EntryD newEntry){
        theEntries.add(newEntry);
    }

    public void deleteEntry(int index){
        theEntries.remove(index);
    }
    public void editEntry(int index) {
        this.theEntries = theEntries;
    }

    public EntryD getEntry(int index) {
        return theEntries.get(index);
    }

    public ArrayList<EntryD> getAllEntries() {
        return theEntries;
    }

    public String getName() {
        return name;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String toString(){
        return "Diary name is "+getName();
    }



}
