import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Frente");
        deque.addLast("Trás");

        System.out.println("Removido da frente: " + deque.removeFirst());
        System.out.println("Removido do fim: " + deque.removeLast());
    }
}
