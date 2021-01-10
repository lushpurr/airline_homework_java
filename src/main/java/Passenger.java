public class Passenger {
    private String name;
    private int numBags;
    private Flight flight;

    public Passenger(String name, int numBags, Flight flight){
        this.name = name;
        this.numBags = numBags;
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public int getNumBags() {
        return numBags;
    }
}
