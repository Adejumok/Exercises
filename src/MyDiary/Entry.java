package MyDiary;

import java.util.Date;

public class Entry {

   Date dateCreated;
    private int id;
    private static int uniqueId;
    private String title;
    private String body;


    public Entry(){
        dateCreated = new Date();
        id = ++uniqueId;
    }

    public static void setUniqueId() {
        uniqueId =0;
    }

    public int getId(){
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public Date getDate() {
        return dateCreated;
    }
    @Override
    public String toString(){
        String output=" ";
            String data= """
                    id-> %d
                    title-> %s
                    body-> %s
                    date-> %s
                    """;
            data=data.formatted(getId(),getTitle(),getBody(),getDate());
            output+=data;

        return output;
    }


}
