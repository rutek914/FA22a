
public class AlaMaKota {

    static String ala = "ala ma kota";

    public static void main(String[] args) {

        System.out.println("\n\n" + ala + "\n\n");

        char[] tablicaZnakow = ala.toCharArray();
        int dlugosc = tablicaZnakow.length;
        char[] drugi = new char[dlugosc];

        for (int i = 0; i < dlugosc; i++) {

            drugi[i] = tablicaZnakow[dlugosc - 1 - i];

        }

        String odwroconyTekst = new String(drugi);
        System.out.println(odwroconyTekst);

    }

}