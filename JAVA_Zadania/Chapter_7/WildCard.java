import java.util.ArrayList;
import java.util.List;

public class WildCard {

    public static void main(String[] args) {

        List<Integer> listInt = new ArrayList<>();
        listInt.add(3);
        listInt.add(8);
        printList(listInt);

        System.out.println("\n");

        List<String> listString = new ArrayList<>();
        listString.add("gruszka");
        listString.add("truskawka");
        printList(listString);

    }

    private static <T> void printList(List<T> myList) {
        System.out.println(myList);
    }
}
