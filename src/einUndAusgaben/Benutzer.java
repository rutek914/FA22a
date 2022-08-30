package einUndAusgaben;

import java.util.Scanner;

public class Benutzer {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Enter first name: ");
        String firstN = reader.nextLine();
        System.out.println("Enter last name");
        String lastN = reader.nextLine();

        System.out.println("Hallo " + firstN + ' ' + lastN + '!');

    }
}
