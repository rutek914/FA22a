package Szkola.Nogard.Schritt2;

public class BefehlUnbekanntException extends Exception {
    private String message;

    public BefehlUnbekanntException(String mes) {
        super();
        message = mes;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
