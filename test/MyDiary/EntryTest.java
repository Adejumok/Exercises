package MyDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntryTest {
    Date date;

    @BeforeEach
    void setUp() {
        Entry.setUniqueId();

    }

    @Test
    public void createEntryTest(){
        Entry entry = new Entry();
        assertNotNull(entry);
    }

    @Test
    public void createIdTest(){
        Entry entry = new Entry();
        assertEquals(1,entry.getId());

        entry = new Entry();
        assertEquals(2,entry.getId());


    }

    @Test
    public void createTitleTest(){
        Entry entry = new Entry();
        entry.setTitle("My Diary");
        assertEquals("My Diary", entry.getTitle());

    }

    @Test
    public void writeBodyTest(){
        Entry entry = new Entry();
        entry.setBody("On my way to the village");
        assertEquals("On my way to the village", entry.getBody());
    }

    @Test
    public void checkDateCreatedTest(){
        Entry entry = new Entry();
        date = new Date();
        assertEquals(date,entry.getDate());
    }


}
