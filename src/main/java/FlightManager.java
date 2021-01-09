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
}
