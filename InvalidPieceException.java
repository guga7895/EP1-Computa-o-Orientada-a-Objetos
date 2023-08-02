package EP1_COO_FINAL_PACKAGE;

public class InvalidPieceException extends OnitamaGameException {
    /**
     * Construtor que recebe uma mensagem e repassa para a superclasse
     * @param message A mensagem descrevendo o motivo do problema
     */
    public InvalidPieceException(String message) {
        super(message);
    }
}
