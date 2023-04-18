package Szkola.Nogard.Schritt2;

public class BefehlFactory {

    public static void createBefehl(String input) {
        String[] befehl = input.trim().split(" ");
        if (input == null || input.isEmpty()) {
            try {
                throw new BefehlUnbekanntException("empty input!");
            } catch (BefehlUnbekanntException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
