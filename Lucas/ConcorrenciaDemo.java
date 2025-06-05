import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class ConcorrenciaDemo {

    public static void main(String[] args) throws InterruptedException {
        // 1. AtomicIntegerArray — Contador de kills por jogador
        System.out.println("🟢 AtomicIntegerArray - Contador de Kills:");
        AtomicIntegerArray kills = new AtomicIntegerArray(3);
        kills.incrementAndGet(0); // Jogador 0 fez uma kill
        kills.incrementAndGet(1);
        kills.incrementAndGet(1); // Jogador 1 fez duas kills
        for (int i = 0; i < 3; i++) {
            System.out.println("Jogador " + i + ": " + kills.get(i) + " kills");
        }

        // 2. ArrayBlockingQueue — Fila limitada de comandos
        System.out.println("\n🟡 ArrayBlockingQueue - Fila de Comandos:");
        ArrayBlockingQueue<String> commandQueue = new ArrayBlockingQueue<>(2);
        commandQueue.put("Andar");
        commandQueue.put("Atacar");
        System.out.println("Comando 1: " + commandQueue.take());
        System.out.println("Comando 2: " + commandQueue.take());

        // 3. LinkedBlockingQueue — Fila de tarefas de renderização
        System.out.println("\n🔵 LinkedBlockingQueue - Renderização:");
        LinkedBlockingQueue<String> renderQueue = new LinkedBlockingQueue<>();
        renderQueue.offer("Renderizar jogador");
        renderQueue.offer("Renderizar inimigo");
        System.out.println("Tarefa: " + renderQueue.take());
        System.out.println("Tarefa: " + renderQueue.take());

        // 4. ConcurrentLinkedDeque — Histórico de ações
        System.out.println("\n🟣 ConcurrentLinkedDeque - Histórico de Ações:");
        ConcurrentLinkedDeque<String> historico = new ConcurrentLinkedDeque<>();
        historico.addFirst("Movimentar");
        historico.addFirst("Atacar");
        System.out.println("Desfazer: " + historico.pollFirst());
        System.out.println("Desfazer: " + historico.pollFirst());
    }
}