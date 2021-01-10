import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, Date departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public int planeCapacity(){
        return this.plane.getCapacity();
    }


    public void addPassengerIfSpace(Passenger passenger) {
        if (this.passengerCount() < this.planeCapacity()){
            this.addPassenger(passenger);
        }
    }


    public String getFlightNumber() {
        return flightNumber;
    }
}
