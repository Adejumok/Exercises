package tdd.chapterEight;

import chapterEight.RectangleClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class RectangleClassTest {

    RectangleClass rectangle = new RectangleClass();

    @Test
    public void perimeterTest(){
        rectangle.setLength(7);
        rectangle.setWidth(5);
        double perimeter = rectangle.perimeter();
        assertEquals(24.0, perimeter);
    }



    @Test
    public void areaTest() {
        rectangle.setLength(7);
        rectangle.setWidth(5);
        double area = rectangle.area();
        assertEquals(35.0, area);
    }


    @Test
    void testThatExceptionIsThrownWhenIllegalValueProvided(){
        assertThrows(IllegalArgumentException.class,() -> {rectangle.setLength(150);}
        );
    }
}
