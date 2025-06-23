import java.util.*;

class Cursors {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        v1.add("Hello");
        v1.add("World");
        v1.add("Java");
        v1.add("Cursors");
        v1.add("Example");
        // Enumeration<String> e = v1.elements();
        // while (e.hasMoreElements()) {
        //     System.out.println(e.nextElement());  // Used for priting the elements of the vector
        // }

        Iterator<String> it = v1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());  // Used for printing the elements of the vector
        }
    }
}