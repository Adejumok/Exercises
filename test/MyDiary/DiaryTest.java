package MyDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {


    Date date;

    @BeforeEach
    void beforeEach() {
        Diary.setUniqueId();
    }

    @Test
    public void createDiaryTest(){
         Diary diary = new Diary();
         assertNotNull(diary);
    }

    @Test
    public void confirmIdTest(){
        Diary diary = new Diary();
        assertEquals(0, diary.getId());

        diary = new Diary();
        assertEquals(1, diary.getId());
    }

    @Test
    public void createNameTest(){
        Diary diary = new Diary();
        diary.setName("Anna");
        assertEquals("Anna", diary.getName());
    }

    @Test
    public void confirmDateCreated(){
        Diary diary = new Diary();
        date = new Date();
        assertEquals(date, diary.getDateCreated());
    }

    @Test
    public void createEntryTest(){
        Diary diary = new Diary();
        Entry entry = new  Entry();
        entry.setTitle("Talk my own");
        entry.setBody("Nawa oo");
        diary.createEntry(entry);
        assertEquals(entry, diary.getEntry(1));
        System.out.println(entry);
    }

    @Test
    public void testThatWeCanAddEntry(){
        Diary diary = new Diary();
        Entry entry = new  Entry();
        diary.addEntry(entry);
        assertEquals(entry, diary.getEntry(1));
    }

    @Test
    public void testThatWeGetAddEntries(){
        Diary diary = new Diary();
        Entry entry = new  Entry();
        diary.addEntry(entry);
        assertEquals(entry, diary.getAllEntries());
    }
}
