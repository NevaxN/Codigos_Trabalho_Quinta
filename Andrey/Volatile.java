public class Volatile {
    private volatile boolean f;

    public void run() {
        while (!f) {
            // Busy-wait
        }
        System.out.println("Ativado");
    }

    public void set() {
        f = true;
    }

    public static void main(String[] args) throws InterruptedException {
        Volatile v = new Volatile();
        new Thread(v::run).start();
        Thread.sleep(1000);
        v.set();
    }
}
