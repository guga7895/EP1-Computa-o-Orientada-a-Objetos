package EP1_COO_FINAL_PACKAGE;

import org.junit.*;
import static org.junit.Assert.*;


public class SpotTest {
    Position pos = new Position(1,0);
    Piece pieceTest =  new Piece(Color.BLUE,false);
    Spot spotTeste = new Spot(pieceTest, pos,Color.BLUE);


    @Test
    public void testSpotConstructor(){
        spotTeste = new Spot(pieceTest,pos);
        assertEquals(pieceTest, spotTeste.getPiece());
        assertEquals(pos, spotTeste.getPosition());
    }

    @Test
    public void testSpotConstructor2(){
        spotTeste = new Spot(pos);
        assertEquals(pos, spotTeste.getPosition());
    }

    @Test
    public void getPosition() {
        assertEquals(pos,spotTeste.getPosition());
    }


    @Test
    public void getPiece() {
        assertEquals(pieceTest,spotTeste.getPiece());
    }

    @Test
    public void getColor() {
        assertEquals(Color.BLUE, spotTeste.getColor());
    }

    @Test
    public void occupySpot() {
        spotTeste.occupySpot(new Piece(Color.RED,false));
        assertEquals(Color.RED, spotTeste.getColor());
        assertThrows(IllegalMovementException.class, () -> spotTeste.occupySpot(new Piece(Color.RED,false)));
    }

    @Test
    public void releaseSpot() {
        spotTeste.releaseSpot();
        assertNull(spotTeste.getPiece());
        assertSame(spotTeste.getColor(), Color.NONE);
    }
}