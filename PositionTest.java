package EP1_COO_FINAL_PACKAGE;

import org.junit.*;

import static org.junit.Assert.assertEquals;


public class PositionTest {

    @Test
    public void getRow() {
        Position posTest = new Position(1,0);
        assertEquals(1,posTest.getRow());
    }

    @Test
    public void getCol() {
        Position posTest = new Position(1,0);
        assertEquals(0,posTest.getCol());
    }
}