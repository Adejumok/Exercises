package MiniProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntryTest {
    @Test
    public void entryCreatedTest(){
        EntryD entry = new EntryD("024", "Work Entry",
                "How work went today", "12-06-2021");
        String result = entry.getId();
        assertEquals("024", result);
        assertEquals("Work Entry", entry.getTitle());
        assertEquals("How work went today", entry.getBody());
        assertEquals("12-06-2021", entry.getDateCreated());

    }

    @Test
    public void entryEditTest(){
        EntryD entry = new EntryD("024", "Work Entry",
                "How work went today", "12-06-2021");
        entry.setId("009");
        assertEquals("009", entry.getId());

        entry.setTitle("Priest Entry");
        assertEquals("Priest Entry", entry.getTitle());

        entry.setBody("Did i document today?");
        assertEquals("Did i document today?", entry.getBody());

        entry.setDateCreated("04-05-22");
        assertEquals("04-05-22", entry.getDateCreated());
    }

    @Test
    public void entryRequiredArgsConstructorTest(){
        EntryD entry = new EntryD("024", "Work Entry","12-06-2021");
        assertEquals(null, entry.getBody());
    }
}
