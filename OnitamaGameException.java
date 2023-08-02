package EP1_COO_FINAL_PACKAGE;

public class OnitamaGameException extends RuntimeException {
    /**
     * Construtor que recebe uma mensagem e repassa para a superclasse
     * @param message A mensagem descrevendo o motivo do problema
     */
    public OnitamaGameException(String message) {
        super(message);
    }
}
