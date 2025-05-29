import java.util.concurrent.ConcurrentLinkedQueue;

public class ExemploQueue {
    private final ConcurrentLinkedQueue<String> fila = new ConcurrentLinkedQueue<>();

    public void enfileirar(String item) {
        fila.add(item);
    }

    public String desenfileirar() {
        return fila.poll();
    }

    public static void main(String[] args) {
        ExemploQueue exemplo = new ExemploQueue();
        
        exemplo.enfileirar("Item 1");
        exemplo.enfileirar("Item 2");
        
        System.out.println("Desenfileirado: " + exemplo.desenfileirar());
        System.out.println("Desenfileirado: " + exemplo.desenfileirar());
    }
}
