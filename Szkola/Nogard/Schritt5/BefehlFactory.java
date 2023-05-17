package Szkola.Nogard.Schritt5;

public class BefehlFactory {
    // private static final String[] RICHTUNGSLISTE = { "north", "west", "east",
    // "south" };

    public static Befehl createBefehl(String input) throws BefehlUnbekanntException {
        String[] befehl = input.trim().split(" ");
        if (input == null || input.isEmpty()) {
            throw new BefehlUnbekanntException("empty input!");
        }
        String befehlswort = befehl[0].toLowerCase();
        switch (befehlswort) {
            case "quit":
                return new Befehl("quit");
            case "help":
                return new Befehl("help");
            case "go":
                if (befehl.length == 2) {
                    String richtungswort = befehl[1].toLowerCase();
                    for (Richtungen r : Richtungen.values()) {
                        if (r.name().equalsIgnoreCase(richtungswort)) {
                            return new Befehl(befehlswort, richtungswort);
                        }
                    }
                }
            default:
                throw new BefehlUnbekanntException("I dont know what you mean brev");
        }

    }

}
