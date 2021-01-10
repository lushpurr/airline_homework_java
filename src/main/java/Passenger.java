public class Passenger {
    private String name;
    private int numBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numBags, Flight flight){
        this.name = name;
        this.numBags = numBags;
        this.flight = flight;
        this.seatNumber = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumBags() {
        return numBags;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int seatRandomizer(){
        int numSeats = passenger.flight.planeCapacity();
        System.out.println(numSeats);
    }
}
