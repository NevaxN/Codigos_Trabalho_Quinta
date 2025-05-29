import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeExample {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();

        // Inserindo elementos nas duas extremidades
        deque.addFirst("First");
        deque.addLast("Last");
        deque.add("Middle");

        System.out.println("Removed from front: " + deque.takeFirst());
        System.out.println("Removed from back: " + deque.takeLast());
        System.out.println("Removed from front: " + deque.takeFirst());
    }
}
