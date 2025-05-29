import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueExample {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();

        Thread producer = new Thread(() -> {
            try {
                System.out.println("Producer: Waiting to put...");
                queue.put("Message");
                System.out.println("Producer: Message sent!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simula atraso
                System.out.println("Consumer: Receiving message...");
                String msg = queue.take();
                System.out.println("Consumer: Received -> " + msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}