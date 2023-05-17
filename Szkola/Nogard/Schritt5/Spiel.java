package Szkola.Nogard.Schritt5;

import java.util.Scanner;

/**
 * Dies ist die Hauptklasse der Anwendung "Die Welt von Nogard".
 * 
 * "Die Welt von Nogard" ist ein sehr einfaches, textbasiertes Adventure-Game,
 * in dem sich ein Spieler durch Nogard bewegen kann.
 * 
 * Das Spiel sollte auf jeden Fall ausgebaut werden, damit es interessanter
 * wird!
 * 
 * Zum Spielen muss an einer Instanz dieser Klasse die Methode "spielen()"
 * aufgerufen werden.
 * 
 * Diese Klasse erzeugt und initialisiert alle Objekte der Anwendung:
 * - Sie legt alle Bereiche an. Anschlie�end startet das Spiel.
 * - Sie wertet die Befehle aus und sorgt f�r ihre Ausf�hrung.
 */
public class Spiel {
	private Bereich aktiverBereich;

	/**
	 * Die Hauptmethode zum Spielen.
	 * L�uft bis zum Ende des Spiels in einer Schleife.
	 */

	public Spiel() {
		erzeugeDorf();
		ausgebenStartText();
	}

	public void spielen() throws BefehlUnbekanntException {

		// Befehle einlesen und auswerten.
		Scanner scannerZeile = new Scanner(System.in);
		boolean end = false;
		while (!end) {
			// Eingabeaufforderung anzeigen.
			System.out.print("> ");
			// Befehlszeile lesen.
			String input = scannerZeile.nextLine();
			// Befehl interpretieren.
			Befehl befehl = BefehlFactory.createBefehl(input);
			end = ausfuehrenBefehl(befehl);

		}
		ausgebenEndText();
	}

	private boolean ausfuehrenBefehl(Befehl befehl) {
		boolean end = false;
		// Abbruch bei fehlender Eingabe.

		// Auswerten des Befehls.
		if (befehl.getBefehl().equals("go")) {
			wechselBereich(befehl);
			end = false;
		} else if (befehl.getBefehl().equals("help")) {
			ausgebenHilfeText();
			end = false;
		} else if (befehl.getBefehl().equals("quit")) {
			end = true;
		} else {
			ausgebenFehlerBefehl();
			end = false;
		}
		return end;

	}

	private void ausgebenHilfeText() {
		System.out.println("Du irrst in Nogard herum.");
		System.out.println("Dir stehen folgende Befehle zur Verfügung:");
		System.out.println("\tgo");
		System.out.println("\tquit");
		System.out.println("\thelp");
	}

	private void ausgebenEndText() {
		// Endbildschirm ausgeben.
		System.out.println("Danke fuer dieses Spiel. Auf Wiedersehen.");
	}

	private void ausgebenStartText() {
		// Begrüßungsbildschirm ausgeben.
		System.out.println("Willkommen in Nogard!");
		System.out.println("Entdecke die Welt von Nogard. Doch Vorsicht, überall lauern Gefahren!");
		System.out.println("Wenn du Hilfe benötigst, tippe 'help'.");
		System.out.println();
		System.out.println(aktiverBereich.getInfo());
	}

	private void erzeugeDorf() {
		// Die Bereiche erzeugen.
		Bereich friedhof = new Bereich("auf einem Friedhof, umgeben von dunklen Tannen");
		Bereich wald = new Bereich("im dunklen Stadtwald von Nogard");
		Bereich taverne = new Bereich("in der Taverne, mit zwielichtigen Gestalten an der Theke");
		Bereich hexenhaus = new Bereich("im finsteren Hexenhaus");
		Bereich rathaus = new Bereich("im Rathaus von Nogard");
		Bereich hoehle = new Bereich("in der Höhle unter dem Wald");
		Bereich weinkeller = new Bereich("im Weinkeller unter der Taverne");
		Bereich kräuterkeller = new Bereich("im Kräuterkeller unter dem Hexenhaus");

		// Die Nachbarschaften festlegen.
		friedhof.setNachbar(Richtungen.SOUTH, hexenhaus); // (null, null, hexenhaus, null);

		wald.setNachbar(Richtungen.NORTH, hexenhaus);
		wald.setNachbar(Richtungen.EAST, taverne);
		wald.setNachbar(Richtungen.DOWN, hoehle); // (hexenhaus, taverne, null, null);

		taverne.setNachbar(Richtungen.NORTH, rathaus);
		taverne.setNachbar(Richtungen.WEST, wald);
		taverne.setNachbar(Richtungen.DOWN, weinkeller); // (rathaus, null, null, wald); north east sud west

		hexenhaus.setNachbar(Richtungen.NORTH, friedhof);
		hexenhaus.setNachbar(Richtungen.EAST, rathaus);
		hexenhaus.setNachbar(Richtungen.SOUTH, wald);
		hexenhaus.setNachbar(Richtungen.DOWN, kräuterkeller); // (friedhof, rathaus, wald, null);

		rathaus.setNachbar(Richtungen.SOUTH, taverne);
		rathaus.setNachbar(Richtungen.WEST, hexenhaus);

		hoehle.setNachbar(Richtungen.UP, wald);
		kräuterkeller.setNachbar(Richtungen.UP, hexenhaus);
		weinkeller.setNachbar(Richtungen.UP, taverne);

		// Das Spielt startet im Wald.
		aktiverBereich = wald;
	}

	private void ausgebenFehlerBefehl() {
		System.out.println("Ich weiss nicht, was Du meinst ...");
	}

	private void wechselBereich(Befehl befehl) {

		System.out.println("Wohin moechtest Du gehen?");

		Richtungen richtung = Richtungen.valueOf(befehl.getBefehlszusatz().toUpperCase());
		Bereich neuerBereich = aktiverBereich.getNachbar(richtung);

		// Auswertung der gefundenen Bereichs.
		if (neuerBereich == null) {
			System.out.println("Dort geht es nicht weiter.");
		} else {
			aktiverBereich = neuerBereich;
			System.out.println(aktiverBereich.getInfo());
		}

	}
}
