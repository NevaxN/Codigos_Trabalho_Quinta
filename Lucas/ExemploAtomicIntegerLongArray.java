import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;

public class ExemploAtomicIntegerLongArray {
    public static void main(String[] args) {
        AtomicIntegerArray atomicIntArray = new AtomicIntegerArray(5);
        AtomicLongArray longAtomicArray = new AtomicLongArray(5);

        atomicIntArray.set(0, 10);
        atomicIntArray.incrementAndGet(0);

        longAtomicArray.set(0, 10);
        longAtomicArray.incrementAndGet(0);

        System.out.println("Valor no índice 0 (AtomicIntegerArray): " + atomicIntArray.get(0));
        System.out.println("Valor no índice 0 (AtomicLongArray): " + longAtomicArray.get(0));
    }
}