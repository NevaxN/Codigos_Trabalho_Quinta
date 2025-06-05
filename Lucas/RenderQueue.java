import java.util.concurrent.LinkedBlockingQueue;

public class RenderQueue {
    private final LinkedBlockingQueue<RenderTask> queue = new LinkedBlockingQueue<>();

    public void submit(RenderTask task) {
        queue.offer(task); // Não bloqueia, adiciona se puder
    }

    public RenderTask getNextTask() throws InterruptedException {
        return queue.take(); // Espera até haver uma tarefa
    }
}

class RenderTask {
    String spriteId;
    int x, y;
    // ...
}