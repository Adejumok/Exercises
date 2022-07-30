package PhoneBookTest;

import PhoneBook.AnEntry;
import PhoneBook.PhoneBookEntries;
import PhoneBook.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PhoneBookEntriesTest {
    User user;
    PhoneBookEntries phoneBookEntries;
    AnEntry Shola;
    AnEntry Precious;

    @BeforeEach
    void setUp(){
        user= new User();
        phoneBookEntries=new PhoneBookEntries();
        Shola = new AnEntry("Shola","No 14, Ademola Street","09012356462","shola#@gmail.com");
        Precious = new AnEntry("Precious","No 8, Duncan Street","09088791462","precious#@gmail.com");
    }

    @Test
    public void phoneBookExistTest(){
        assertNotNull(phoneBookEntries);
    }

    @Test
    public void phoneBookCanHaveAnEntryTest(){
        phoneBookEntries.addEntry(Shola);
        assertEquals(Shola, phoneBookEntries.getEntry(1));
    }

    @Test
    public void phoneBookCanHaveMultipleEntriesTest(){
        phoneBookEntries.addEntry(Shola);
        phoneBookEntries.addEntry(Precious);
        assertEquals(2, phoneBookEntries.getEntrySize());
    }

    @Test
    public void phoneBookCanEditAnEntryTest(){
        phoneBookEntries.addEntry(Shola);

        phoneBookEntries.getEntry("Shola").setName("Precious");
        assertEquals("Precious",Shola.getName());

        phoneBookEntries.getEntry("Precious").setAddress("No 8, Duncan Street");
        assertEquals("No 8, Duncan Street",Shola.getAddress());

        phoneBookEntries.getEntry("Precious").setTelephone("09088791462");
        assertEquals("09088791462",Shola.getTelephone());

        phoneBookEntries.getEntry("Precious").setEmail("precious#@gmail.com");
        assertEquals("precious#@gmail.com",Shola.getEmail());
    }

    @Test
    public void phoneBookCanDeleteEntryTest(){
        phoneBookEntries.addEntry(Shola);
        phoneBookEntries.addEntry(Precious);
        phoneBookEntries.deleteEntry("Precious");
        System.out.println(phoneBookEntries.getEntry("Shola"));
        assertEquals(1, phoneBookEntries.getEntrySize());
    }

    @Test
    public void setUserTest(){
        user.setUserName("Kelechi");
        assertEquals("Kelechi", user.getUserName());
    }

}
