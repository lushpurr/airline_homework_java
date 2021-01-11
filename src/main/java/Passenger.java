public class Passenger {
    private String name;
    private int numBags;
    private Flight flight;
    private Integer seatNumber;

    public Passenger(String name, int numBags){
        this.name = name;
        this.numBags = numBags;
        this.flight = null;
        this.seatNumber = null;
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


    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber){this.seatNumber = seatNumber;}
}
