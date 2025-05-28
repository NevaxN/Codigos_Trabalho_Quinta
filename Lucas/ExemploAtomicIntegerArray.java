import java.util.concurrent.atomic.AtomicIntegerArray;

public class ExemploAtomicIntegerArray {
    public static void main(String[] args) {
        AtomicIntegerArray atomicArray = new AtomicIntegerArray(5);

        atomicArray.set(0, 10);
        atomicArray.incrementAndGet(0);

        System.out.println("Valor no índice 0: " + atomicArray.get(0));
    }
}