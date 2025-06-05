import java.util.concurrent.atomic.AtomicIntegerArray;

public class KillTracker {
    private final AtomicIntegerArray kills;

    public KillTracker(int numPlayers) {
        kills = new AtomicIntegerArray(numPlayers);
    }

    public void addKill(int playerId) {
        kills.incrementAndGet(playerId);
    }

    public int getKills(int playerId) {
        return kills.get(playerId);
    }
}