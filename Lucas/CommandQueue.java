import java.util.concurrent.ArrayBlockingQueue;

public class CommandQueue {
    private final ArrayBlockingQueue<String> commands = new ArrayBlockingQueue<>(10); // Limite de 10 comandos

    public void addCommand(String command) throws InterruptedException {
        commands.put(command); // Bloqueia se a fila estiver cheia
    }

    public String getNextCommand() throws InterruptedException {
        return commands.take(); // Bloqueia se a fila estiver vazia
    }
}
