import java.util.concurrent.atomic.AtomicBoolean;

public class JavaAtomicBoolean {

    private static AtomicBoolean lock = new AtomicBoolean(false);

    public static void main(String[] args) {

        Runnable task = () -> {

            if (lock.compareAndSet(false, true)) {

                try {

                    System.out.println(Thread.currentThread().getName() + "acquired the lock.");

                // Critical section of code
                } finally {

                    lock.set(false); // Release the lock

                    System.out.println(Thread.currentThread().getName() + "released the lock.");

                }

            } else {

                System.out.println(Thread.currentThread().getName() + "could not acquire the lock.");

            }

        };

        Thread t1 = new Thread(task);

        Thread t2 = new Thread(task);

        t1.start();

        t2.start();

    }   

}
