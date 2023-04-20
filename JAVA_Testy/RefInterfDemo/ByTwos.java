package JAVA_Testy.RefInterfDemo;

public class ByTwos implements SeriesInterface {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class SeriesDemo {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        SeriesInterface ob;

        for (int i = 0; i < 5; ++i) {
            ob = twoOb;
            System.out.println("Nächster Wert der Sequenz ByTwos:" + ob.getNext());

            System.out.println("Nächster Wert der Sequenz " + twoOb.getNext());
        }
    }
}