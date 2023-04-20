package JAVA_Testy.Queue;

public class IQDemo {

}

class FixedQueue implements IcharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println("--Kolejka pelna");
            return;
        }
        q[putloc++] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println("-- kolejka pusta");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class CircularQueue implements IcharQ {
    private char[] q;
    private int putloc, getloc;

    public CircularQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println("-- Kolejka pelna.");
            return;
        }
        q[putloc++] = ch;
        if (putloc == q.length)
            putloc = 0;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println("-- kolejka pusta");
            return (char) 0;
        }
        char ch = q[getloc++];
        if (getloc == q.length)
            getloc = 0;
        return ch;
    }

}
