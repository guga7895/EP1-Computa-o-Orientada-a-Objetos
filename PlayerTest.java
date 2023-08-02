package EP1_COO_FINAL_PACKAGE;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class PlayerTest {
    Card card1 = new Card("card1",Color.RED,new Position[]{new Position(1,0)});
    Card card2 = new Card("card2",Color.RED,new Position[]{new Position(2,1)});
    Card card3 = new Card("card3",Color.BLUE,new Position[]{new Position(0,-2)});
    Card[] cardsTest = {card1,card2};
    Player player1 = new Player("name",Color.BLUE, cardsTest);
    Player player2 = new Player("name2", Color.RED,card1,card2);

    @Test
    public void getName() {
        assertEquals("name", player1.getName());
        assertEquals("name2", player2.getName());
    }

    @Test
    public void getPieceColor() {
        assertEquals(Color.BLUE, player1.getPieceColor());
        assertEquals(Color.RED, player2.getPieceColor());
    }

    @Test
    public void getCards() {
        assertEquals(card1, player1.getCards()[0]);
        assertEquals(card2, player1.getCards()[1]);
        assertEquals(cardsTest, player1.getCards());

    }

    @Test
    public void swapCardIfNotPossible() {
        assertThrows(InvalidCardException.class, () -> player1.swapCard(card3,card1));
    }

    @Test
    public void swapCardIfPossible() {
        player1.swapCard(card1,card3);
        assertEquals(player1.getCards()[0], card3);
    }
}