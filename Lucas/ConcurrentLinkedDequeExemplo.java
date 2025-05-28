import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeExemplo {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();

        deque.addFirst("Elemento 1");
        deque.addLast("Elemento 2");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
    }
}
