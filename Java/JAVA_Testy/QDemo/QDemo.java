class Queue {
    char[] q;
    int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" -- Kolejka pelna.");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println("-- kolejka pusta.");
            return (char) 0;
        }
        return q[getloc++];
    }

    public static void main(String args[]) {
        String str1 = "to jest string 1";
        String str2 = str1;
        String str3 = "to jest string 1";

        if (str1.equals(str2)) {
            System.out.println("str1 und str2 are same with equals.");
        }
        if (str1 == str2) {
            System.out.println("referencje str1 und str2 sa same with ==");
        }
        if (str1.equals(str3)) {
            System.out.println("str1 und str3 are same with equals");
        }
        if (str1 == str3) {
            System.out.println("referencje str1 und str3 are same with ==");
        }
    }
}