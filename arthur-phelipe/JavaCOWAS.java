import java.util.concurrent.CopyOnWriteArraySet;

public class JavaCOWAS {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        // Thread to modify the set
        Thread writer = new Thread(() -> {
            set.add(4);
            System.out.println("Writer added 4");
        });

        // Thread to iterate the set
        Thread reader = new Thread(() -> {
            for (Integer value : set) {
                System.out.println("Reader: " + value);
                try {
                    Thread.sleep(100); // Simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        writer.start();
        reader.start();
    }
}