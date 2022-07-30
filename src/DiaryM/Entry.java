package DiaryM;

public class Entry {
    private int id=0;
    private String title;
    private String body;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public void setId(int id) {
        this.id=id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return String.format("""
                Id: %s
                Title: %s
                Body: %s
                """, id,title,body);
    }
}
