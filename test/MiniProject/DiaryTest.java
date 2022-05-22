package MiniProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {

    @Test
    public void diaryCreatedTest(){
        Diary babeDiary = new Diary("Pride Piper", "02-07-2021");
        assertEquals("Pride Piper", babeDiary.getName());
        assertEquals("02-07-2021", babeDiary.getDateCreated());
    }

    public void addEntryTest(){
        Diary babeDiary = new Diary();
        //babeDiary.setTheEntries();
        assertEquals("Bob Daddy", babeDiary.getTheEntries());
    }


}
