import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExemplo {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();

        queue.put("Elemento A");
        queue.put("Elemento B");

        System.out.println(queue.take());
        System.out.println(queue.take());
    }
}
