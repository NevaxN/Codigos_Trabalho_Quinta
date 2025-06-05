import java.util.concurrent.ConcurrentLinkedDeque;

public class ActionHistory {
    private final ConcurrentLinkedDeque<String> history = new ConcurrentLinkedDeque<>();

    public void addAction(String action) {
        history.addFirst(action); // Ação mais recente na frente
    }

    public String undoLast() {
        return history.pollFirst(); // Remove e retorna a última ação
    }

    public void redo(String action) {
        history.addFirst(action); // Reinsere ação
    }
}