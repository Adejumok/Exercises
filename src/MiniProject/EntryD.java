package MiniProject;

public class EntryD {

    private String id;
    private String title;
    private String body;
    private String dateCreated;
    public EntryD(String id, String title, String body, String dateCreated) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = dateCreated;
    }

    public EntryD(String id, String title, String dateCreated) {
        this.id = id;
        this.title = title;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {

        return title;
    }

    public String getBody() {
        return body;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
