import java.util.concurrent.atomic.AtomicLong;

public class ExemploAtomic {
    private AtomicLong contador = new AtomicLong(0);

    public void incrementar() {
        contador.incrementAndGet();
    }

    public long getValor() {
        return contador.get();
    }

    public static void main(String[] args) {
        ExemploAtomic exemplo = new ExemploAtomic();

        exemplo.incrementar();
        exemplo.incrementar();
        exemplo.incrementar();

        System.out.println("Valor do contador: " + exemplo.getValor());
    }
}
