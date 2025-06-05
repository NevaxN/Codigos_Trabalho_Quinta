import java.util.concurrent.atomic.AtomicLongArray;

public class UniqueIdGenerator {
    private final AtomicLongArray regionCounters;

    public UniqueIdGenerator(int numRegions) {
        regionCounters = new AtomicLongArray(numRegions);
    }

    public long getNextId(int region) {
        return regionCounters.incrementAndGet(region);
    }
}