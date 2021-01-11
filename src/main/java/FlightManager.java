import java.util.ArrayList;

public class FlightManager {
    private Flight flight;
    private double reservedBaggageWeight;

    public FlightManager(Flight flight) {

        this.flight = flight;
        this.reservedBaggageWeight = flight.getPlane().getWeight() / 2;


    }


    public int getWeightOfPassengerBaggage(Passenger passenger) {
        return passenger.getNumBags() * 30;
    }


    public void bookPassenger(Passenger passenger) {
        if (flight.remainingSeats() > 0) {
            this.flight.addPassenger(passenger);
            passenger.setFlight(this.flight);
        }
    }


    public int getTotalBaggageWeight(ArrayList<Passenger> passengers) {
        int totalBaggageWeight = 0;

        for (Passenger passenger : passengers) {
            totalBaggageWeight += getWeightOfPassengerBaggage(passenger);

        }

        return totalBaggageWeight;
    }

    public double getRemainingBaggageWeight(ArrayList<Passenger> passengers) {
        return reservedBaggageWeight - getTotalBaggageWeight(passengers);
    }

    public ArrayList<Passenger> sortPassengers() {
        Flight flight = this.flight;
        ArrayList<Passenger> passengers = flight.getPassengers();
        ArrayList<Passenger> sortedPassengers = new ArrayList<Passenger>(passengers.size());
        for (int i = 0; i < passengers.size(); i++) {
            for (int nextIndex = 1; nextIndex < passengers.size(); nextIndex++) {
                Passenger firstPassenger = passengers.get(i);
                Passenger secondPassenger = passengers.get(nextIndex);
                if (!sortedPassengers.contains(firstPassenger)) {
                    sortedPassengers.add(firstPassenger);
                }
                if (!sortedPassengers.contains(secondPassenger)) {
                    sortedPassengers.add(secondPassenger);
                }
                if (firstPassenger.getSeatNumber() > secondPassenger.getSeatNumber()) {
                    sortedPassengers.set(i, secondPassenger);
                    sortedPassengers.set(nextIndex, firstPassenger);
                }
            }
        }
        return sortedPassengers;
    }

    public Passenger getPassenger(int seatNumber) {
        ArrayList<Passenger> sortedPassengers = this.sortPassengers();
        Passenger passenger = this.binarySearch(sortedPassengers, seatNumber);
        return passenger;
    }

    private Passenger binarySearch(ArrayList<Passenger> passengers, int seat){
        if (passengers.size() == 0){
            return null;
        }

        int midIndex = passengers.size() / 2;
        Passenger passenger = passengers.get(midIndex);

        if (passenger.getSeatNumber() == seat){
            return passenger;
        }

        ArrayList<Passenger> shortList;
        if (seat > passenger.getSeatNumber()){
            shortList = new ArrayList<Passenger>(passengers.subList(midIndex + 1, passengers.size()));
        } else {
            shortList = new ArrayList<Passenger>(passengers.subList(0, midIndex));
        }
        return binarySearch(shortList, seat);
    }
}
