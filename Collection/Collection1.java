import java.util.*;

class Collection1 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Hello");
        l1.add("World");
        l1.add("Java");

        Iterator<String> it = l1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Hello, Collection1!");
    }
}
