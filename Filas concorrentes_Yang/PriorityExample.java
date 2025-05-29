import java.util.concurrent.PriorityBlockingQueue;

public class PriorityExample {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

        // Adicionando elementos
        queue.add(30);
        queue.add(10);
        queue.add(20);

        // Removendo elementos na ordem de prioridade (menor valor primeiro)
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
