import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Elemento 1");
        fila.add("Elemento 2");
        fila.add("Elemento 3");

        System.out.println("Removido: " + fila.poll());
        System.out.println("Proximo: " + fila.peek());
    }
}
