public enum PlaneType {

    BOEING747(3, 180),
    AIRBUSA380(5, 300);


    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, double totalWeight){

        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }


    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
