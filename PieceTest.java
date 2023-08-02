package EP1_COO_FINAL_PACKAGE;




import org.junit.*;

import static org.junit.Assert.*;

public class PieceTest {
    Piece pieceTest = new Piece(Color.RED,false);

    @Test
    public void getColor(){
        assertEquals(Color.RED, pieceTest.getColor());
        assertNotSame(Color.NONE, pieceTest.getColor());
    }

    @Test
    public void testIsMaster() {
        assertFalse(pieceTest.isMaster());
    }
}