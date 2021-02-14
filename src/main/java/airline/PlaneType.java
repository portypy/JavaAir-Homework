package airline;

public enum PlaneType {
    CESSNA(14,10000),
    BOMBARDIER(19,42000),
    GULFSTREAM(21, 41200),
    HONDA(5, 4800);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
