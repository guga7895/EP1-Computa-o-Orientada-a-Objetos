package EP1_COO_FINAL_PACKAGE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Player {
    private final String name;
    private Color pieceColor;
    private Card[] cards;

    /**
     * Construtor que define informações básicas do jogador
     *
     * @param name       Nome do jogador
     * @param pieceColor Cor das peças do jogador
     * @param cards      Cartas na mão do jogador
     */
    public Player(String name, Color pieceColor, Card[] cards) {
        this.name = name;
        this.pieceColor = pieceColor;
        this.cards = cards;
    }

    /**
     * Construtor que define informações básicas do jogador
     *
     * @param name       Nome do jogador
     * @param pieceColor Cor das peças do jogador
     * @param card1      A primeira carta na mão do jogador
     * @param card2      A segunda carta na mão do jogador
     */
    public Player(String name, Color pieceColor, Card card1, Card card2) {
        this.name = name;
        this.pieceColor = pieceColor;
        this.cards = new Card[2];//checst se sta na mesa.
        this.cards[0] = card1;
        this.cards[1] = card2;
    }

    /**
     * Método que devolve o nome do jogador(a)
     *
     * @return String com o nome do jogador(a)
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método que devolve a cor das peças do jogador
     *
     * @return Enum Color com a cor das peças do jogador
     */
    public Color getPieceColor() {
        return this.pieceColor;
    }

    /**
     * Método que devolve as cartas da mão do jogador
     *
     * @return Booleano true para caso seja um mestre e false caso contrário
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Método que troca uma carta da mão por outra carta (idealmente da mesa)
     *
     * @param oldCard A carta que será substituída
     * @param newCard A carta que irá substituir
     * @throws InvalidCardException Caso a carta não esteja na mão do jogador e/ou na mesa
     */
    protected void swapCard(Card oldCard, Card newCard) throws InvalidCardException {
        Card[] cartasNaMao = this.getCards();
        ArrayList<Card> ListaCartasNaMao = new ArrayList<>(cartasNaMao.length);
        Collections.addAll(ListaCartasNaMao, cartasNaMao);
        if (!(ListaCartasNaMao.contains(oldCard))) {
            throw new InvalidCardException("Carta não pode ser trocada: Carta não encontrada na mão do jogador");
        } else {
            ListaCartasNaMao.remove(oldCard);
            ListaCartasNaMao.add(newCard);
            cartasNaMao = ListaCartasNaMao.toArray(cartasNaMao);
            Card temp = new Card(cartasNaMao[0].getName(),cartasNaMao[0].getColor(),cartasNaMao[0].getPositions());
            cartasNaMao[0] = cartasNaMao[1];
            cartasNaMao[1] = temp;
            this.cards = cartasNaMao;
        }
    }
}
