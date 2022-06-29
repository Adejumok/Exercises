package DiaryMTest;

import DiaryM.Diary;
import DiaryM.Entry;
import DiaryM.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserDiaryETest {
    User DotunU;
    Diary Work;
    Diary Love;
    Entry FirstDay;
    Entry Breakfast;


    @BeforeEach
    void setUp(){
        DotunU = new User("Dotun");
        Work = new Diary("Work");
        Love = new Diary("Love");
        FirstDay = new Entry(1, "First Day in Semicolon", "The story goes thus...");
        Breakfast = new Entry(2, "Who is Suppose to Serve Breakfast", "The story goes thus...");
    }

    @Test
    void userExistTest(){
        assertNotNull(DotunU);
    }

    @Test
    void testThatUserCanCreatDiary(){
        DotunU.createDiary(Work);
        assertEquals(Work, DotunU.viewDiary(1));

    }

    @Test
    void testThatUserCanGetTheNumberOfDiaries(){
        DotunU.createDiary(Work);
        DotunU.createDiary(Love);

        assertEquals(2, DotunU.getNumberOfDiaries());
    }

    @Test
    void userCanEditDiaryDetailsTest(){
        DotunU.createDiary(Work);
        DotunU.editDiary(Work, 1);

        assertEquals(Work, DotunU.viewDiary(1));
    }

    @Test
    void testThatUserCanDeleteDiariesTest(){
        DotunU.createDiary(Work);
        DotunU.createDiary(Love);
        DotunU.deleteDiary(Love);

        assertEquals(1, DotunU.getNumberOfDiaries());
    }

    @Test
    void diaryCanAddEntryTest(){
        Work.addEntry(FirstDay);
        assertEquals(1, Work.getNumberOfEntries());
    }

    @Test
    void diaryCanGetSingleEntryTest(){
        Work.addEntry(FirstDay);
        assertEquals("First Day in Semicolon", Work.getEntry(1));
    }

    @Test
    void diaryCanGetAllEntriesTest(){
        Work.addEntry(FirstDay);
        Work.addEntry(Breakfast);
        assertEquals(2, Work.getAllEntries());
    }

    @Test
    void diaryCanEditEntryTest(){
        Work.addEntry(Breakfast);
        Work.editEntry(Breakfast, 1);
        assertEquals("Who is Suppose to Serve Breakfast", Work.getEntry(1));
    }

    @Test
    void diaryCanDeleteEntryTest(){
        Work.addEntry(Breakfast);
        Work.addEntry(FirstDay);
        Work.deleteEntry(FirstDay);
        assertEquals(1, Work.getAllEntries());
    }

}
