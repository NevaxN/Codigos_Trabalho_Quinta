import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeEx {
    public static void main(String[] args) {
        BlockingDeque<String> deque = new LinkedBlockingDeque<>(2);

        // Produtor
        new Thread(() -> {
            try {
                deque.putFirst("Frente 1");
                System.out.println("Inserido na frente: Frente 1");
                deque.putLast("Trás 1");
                System.out.println("Inserido no fim: Trás 1");
                deque.putFirst("Frente 2"); // Bloqueia até espaço
                System.out.println("Inserido na frente: Frente 2");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        // Consumidor
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Removido do fim: " + deque.takeLast());
                Thread.sleep(2000);
                System.out.println("Removido da frente: " + deque.takeFirst());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}
