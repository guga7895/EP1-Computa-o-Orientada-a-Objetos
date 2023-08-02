package EP1_COO_FINAL_PACKAGE;


import org.junit.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class CardTest {

    Position[] pos = new Position[]{new Position(0,1)};
    Card carta = new Card("CartaTeste", Color.RED, pos);

    @Test
    public void getName() {
        assertEquals("CartaTeste",carta.getName());
    }

    @Test
    public void getColor() {
        assertEquals(Color.RED,carta.getColor());
    }

    @Test
    public void getPositions(){
        assertEquals(pos, carta.getPositions());
    }


    @Test
    public void testCreateCards() {

        Card Tiger = new Card("Tiger", Color.BLUE, new Position[]{new Position(-2,0),new Position(1,0)});

        Card Frog = new Card("Frog", Color.RED, new Position[]{new Position(0,-2),new Position(-1,-1),new Position(1,1)});

        Card Crab = new Card("Crab", Color.BLUE, new Position[]{new Position(0,-2),new Position(-1,0),new Position(0,2)});

        Card Goose = new Card("Goose", Color.BLUE, new Position[]{new Position(-1,-1),new Position(0,-1),new Position(0,1),new Position(1,1)});

        Card Dragon = new Card("Dragon", Color.RED, new Position[]{new Position(-1,-2),new Position(1,-1), new Position(1,1), new Position(-1,2)});

        Card Rabbit = new Card("Rabbit", Color.BLUE, new Position[]{new Position(1,-1),new Position(-1,1), new Position(0,2)});

        Card Elephant = new Card("Elephant", Color.RED, new Position[]{new Position(-1,-1),new Position(0,-1),new Position(-1,1),new Position(0,1)});

        Card Rooster = new Card("Rooster", Color.RED, new Position[]{new Position(0,-1),new Position(1,-1),new Position(0,1),new Position(-1,1)});

        Card[] cartas = {Tiger, Frog, Crab, Goose, Dragon, Rabbit, Elephant, Rooster};

        List<Card> cartasList = new ArrayList<>(8);
        Collections.addAll(cartasList, cartas);
        Collections.shuffle(cartasList);
        List<Card> cartasBaralho = cartasList.subList(1,6);
        Card[] cartasFinal = new Card[5];
        cartasFinal = cartasBaralho.toArray(cartasFinal);

        Card[] cartasTeste = Card.createCards();
        assertEquals(5, cartasTeste.length);
        for(Card e : cartasTeste){
            assertNotNull(e);
        }
    }
}