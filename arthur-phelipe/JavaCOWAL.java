import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class JavaCOWAL {
    public static void main(String[] args) {
        // ArrayList Example
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        try {
            // Iterating and modifying an ArrayList using an Iterator
            Iterator<Integer> arrayListIterator = arrayList.iterator();
            while (arrayListIterator.hasNext()) {
                Integer num = arrayListIterator.next();
                System.out.println(num);
                if (num == 2) {
                    // This will throw a ConcurrentModificationException in ArrayList
                    arrayList.add(4); // Concurrent modification exception!
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Caught ConcurrentModificationException in ArrayList!");
        }

        // CopyOnWriteArrayList Example
        List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.add(2);
        copyOnWriteArrayList.add(3);

        // Iterating and modifying a CopyOnWriteArrayList using an Iterator
        Iterator<Integer> copyOnWriteArrayListIterator = copyOnWriteArrayList.iterator();
        while (copyOnWriteArrayListIterator.hasNext()) {
            Integer num = copyOnWriteArrayListIterator.next();
            System.out.println(num);
            if (num == 2) {
                // This modification is allowed in CopyOnWriteArrayList
                copyOnWriteArrayList.add(4); // No ConcurrentModificationException!
            }
        }
    }
}
