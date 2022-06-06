package MyDiary;

import java.util.ArrayList;
import java.util.Date;

public class Diary {
    private int id;
    private static int uniqueId;
    private String name;
    private Date dateCreated;

    private ArrayList<Entry> theEntries;



    public Diary(){
        theEntries = new ArrayList<>();
        dateCreated =  new Date();
        id = uniqueId++;
    }

    public static void setUniqueId(){
        uniqueId=0;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void createEntry(Entry newEntry) {
        theEntries.add(newEntry);
    }

    public Entry getEntry(int id) {
        return theEntries.get(id-1);
    }
    @Override
    public String toString(){
        String output=" ";
        for (int i = 0; i <theEntries.size(); i++) {
            Entry entry = theEntries.get(i);
            String data= """
                    id-> %d
                    title-> %s
                    body-> %s
                    date-> %d
                    """;
            data=data.formatted(entry.getId(),entry.getTitle(),entry.getBody(),entry.getDate());
            output+=data;
        }
        return output;
    }

    public void addEntry(Entry newEntry) {
        theEntries.add(newEntry);
    }

    public Entry getAllEntries() {
        return theEntries.get(getId());
    }
}
