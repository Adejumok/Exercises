package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    private Turtle bubu;
    private Position buga;
    private SketchPad sc;

    @BeforeEach
    public void setUp(){
        bubu = new Turtle();
        buga = new Position(0,5);
        sc = new SketchPad(5,5);
    }

    @Test
    public void turtleCanBeCreatedTest(){
        assertNotNull(bubu);
    }

    @Test
    public void penIsUpByDefault(){
        assertTrue(bubu.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest(){
        assertTrue(bubu.isPenUp());
        bubu.penDown();
        assertFalse(bubu.isPenUp());
    }

    @Test
    public void turtleCanMovePenUpAgainTest(){
        bubu.penDown();
        assertFalse(bubu.isPenUp());

        bubu.penUp();
        assertTrue(bubu.isPenUp());
    }

    @Test
    public void whenFacingEast_turtleCanTurnRightTest(){
        assertSame(EAST, bubu.getCurrentDirection());

        bubu.turnRight();
        assertEquals(SOUTH, bubu.getCurrentDirection());
    }

    @Test
    public void whenFacingSouth_turtleCanTurnRightTest(){
        bubu.turnRight();
        assertEquals(SOUTH, bubu.getCurrentDirection());

        bubu.turnRight();
        assertSame(WEST, bubu.getCurrentDirection());
    }

    @Test
    public void whenFacingWest_turtleCanTurnRightTest(){
        bubu.turnRight();
        bubu.turnRight();

        assertEquals(WEST, bubu.getCurrentDirection());

        bubu.turnRight();
        assertSame(NORTH, bubu.getCurrentDirection());
    }

    @Test
    public void whenFacingNorth_turtleCanTurnRightTest(){
        bubu.turnRight();
        bubu.turnRight();
        bubu.turnRight();

        assertEquals(NORTH, bubu.getCurrentDirection());

        bubu.turnRight();
        assertSame(EAST, bubu.getCurrentDirection());
    }

    @Test
    public void whenFacingEast_turtleCanTurnLeftTest(){
        assertSame(EAST, bubu.getCurrentDirection());

        bubu.turnLeft();
        assertEquals(NORTH, bubu.getCurrentDirection());
    }

    @Test
    public void whenFacingNorth_turtleCanTurnLeftTest(){
        bubu.turnLeft();
        assertEquals(NORTH, bubu.getCurrentDirection());

        bubu.turnLeft();
        assertSame(WEST, bubu.getCurrentDirection());
    }

    @Test
    public void whenFacingWest_turtleCanTurnLeftTest(){
        bubu.turnLeft();
        bubu.turnLeft();

        assertEquals(WEST, bubu.getCurrentDirection());

        bubu.turnLeft();
        assertSame(SOUTH, bubu.getCurrentDirection());
    }

    @Test
    public void whenFacingSouth_turtleCanTurnLeftTest(){
        bubu.turnLeft();
        bubu.turnLeft();
        bubu.turnLeft();

        assertEquals(SOUTH, bubu.getCurrentDirection());

        bubu.turnLeft();
        assertSame(EAST, bubu.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardFacingEast(){
        assertSame(EAST, bubu.getCurrentDirection());
        bubu.move(5, sc);
        bubu.move(5, sc);

        assertEquals(new Position(0,10), bubu.getCurrentPosition());
    }

//    @Test
//    public void turtleCanMoveForwardFacingSouth(){
//        bubu.turnRight();
//        assertSame(SOUTH, bubu.getCurrentDirection());
//        bubu.move(5);
//        bubu.move(5);
//
//        assertEquals(new Position(0,10), bubu.getCurrentPosition());
//    }

    @Test
    public void whenPenIsDown_turtleCanWriteWhileMovingTest(){
        assertSame(EAST, bubu.getCurrentDirection());
        bubu.penDown();
        int currentColumn = bubu.getCurrentPosition().getColumn();
        int currentRow = bubu.getCurrentPosition().getRow();
        bubu.move(5,sc);

        assertEquals(new Position(0,5), bubu.getCurrentPosition());
        int[][] floor = sc.getFloor();
        for (int i = currentColumn; i < currentColumn+5; i++) {
            assertEquals(1,floor[currentRow][i]);
        }
    }
}
