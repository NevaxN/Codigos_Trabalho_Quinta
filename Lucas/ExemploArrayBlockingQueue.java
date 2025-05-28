import java.util.concurrent.ArrayBlockingQueue;

public class ExemploArrayBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

        queue.put("Elemento 1");
        queue.put("Elemento 2");
        
        new Thread(() -> {
            try {
                queue.put("Elemento 3");
                System.out.println("Elemento 3 inserido");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        Thread.sleep(1000);
        queue.take();
    }
}
