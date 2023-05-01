package Szkola.Nogard.Schritt3;

public class BefehlFactory {
    private static final String[] RICHTUNGSLISTE = { "norden", "westen", "osten", "sueden" };

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
                    for (int i = 0; i < RICHTUNGSLISTE.length; ++i) {
                        if (richtungswort.equals(RICHTUNGSLISTE[i])) {
                            return new Befehl("go", richtungswort);
                        } else if (i >= RICHTUNGSLISTE.length) {
                            throw new BefehlUnbekanntException("wrong Richtung my dear");
                        }
                    }
                } else {
                    throw new BefehlUnbekanntException("go where?????");
                }

            default:
                throw new BefehlUnbekanntException("I dont know what you mean brev");
        }

    }

}
