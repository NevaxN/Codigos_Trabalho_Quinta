import java.util.concurrent.*;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedItem implements Delayed {
    private String name;
    private long startTime;

    public DelayedItem(String name, long delayInSeconds) {
        this.name = name;
        this.startTime = System.currentTimeMillis() + delayInSeconds * 1000;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }

    public String getName() {
        return name;
    }
}

public class DelayQueueExample {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedItem> queue = new DelayQueue<>();

        queue.put(new DelayedItem("Task 1", 3)); // Disponível após 3 segundos
        queue.put(new DelayedItem("Task 2", 1)); // Após 1 segundo
        queue.put(new DelayedItem("Task 3", 5)); // Após 5 segundos

        while (!queue.isEmpty()) {
            DelayedItem item = queue.take(); // Bloqueia até o item estar pronto
            System.out.println("Processing: " + item.getName());
        }
    }
}