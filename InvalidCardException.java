package EP1_COO_FINAL_PACKAGE;

public class InvalidCardException extends OnitamaGameException {
    /**
     * Construtor que recebe uma mensagem e repassa para a superclasse
     * @param message A mensagem descrevendo o motivo do problema
     */
    public InvalidCardException(String message) {
        super(message);
    }
}
