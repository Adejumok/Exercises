package MiniProject;

import java.util.ArrayList;

public class Diary {

    private String name;
    private String dateCreated;

    public void setTheEntries(ArrayList<EntryD> theEntries) {
        this.theEntries = theEntries;
    }

    private ArrayList<EntryD> theEntries;

    public Diary(){
        theEntries = new ArrayList<>();
    }

    public Diary(String name, String dateCreated) {
        this.name = name;
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public String getDateCreated() {
        return dateCreated;
    }


    public ArrayList<EntryD> getTheEntries() {
        return theEntries;
    }


}
