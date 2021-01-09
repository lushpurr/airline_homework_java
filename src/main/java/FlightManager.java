import java.util.ArrayList;

public class FlightManager {
    private Plane plane;

    public FlightManager(Plane plane){

        this.plane = plane;


    }


    public int getPlaneCapacity() {
        return plane.getCapacity();
    }



    public double getPassengerBaggageReserve() {
        return plane.getBaggageWeight()/plane.getCapacity();
    }


    public int getWeightOfPassengerBaggage(Passenger passenger) {
        return passenger.getNumBags()*30;
    }

    public int getTotalBaggageWeight(ArrayList<Passenger> passengers) {
        int totalBaggageWeight = 0;

        for(Passenger passenger :passengers){
            totalBaggageWeight += getWeightOfPassengerBaggage(passenger);

        }

        return totalBaggageWeight;
    }

    public double getRemainingBaggageWeight(ArrayList<Passenger> passengers) {
        return plane.getBaggageWeight() - getTotalBaggageWeight(passengers);
    }
}
