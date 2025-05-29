import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueEx {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> fila = new ArrayBlockingQueue<>(2);

        // Produtor
        new Thread(() -> {
            try {
                fila.put("Item 1");
                System.out.println("Inserido: Item 1");
                fila.put("Item 2");
                System.out.println("Inserido: Item 2");
                fila.put("Item 3");
                System.out.println("Inserido: Item 3");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        // Consumidor
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Removido: " + fila.take());
                Thread.sleep(2000);
                System.out.println("Removido: " + fila.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}
