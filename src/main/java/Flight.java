import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;
    private ArrayList<Integer> seatNumbers;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, Date departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.seatNumbers = generateSeatNumbers();

    }

    private ArrayList<Integer> generateSeatNumbers(){
        ArrayList<Integer> seatNumbers = new ArrayList<Integer>();
        for(int i = 1; i <= this.planeCapacity(); i++){
            seatNumbers.add(i);
        }
        return seatNumbers;
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

    public void allocateSeatNumber(Passenger passenger){
        Random random = new Random();
        int randomIndex = random.nextInt(this.seatNumbers.size());
        Integer seatNumber = this.seatNumbers.remove(randomIndex);
        passenger.setSeatNumber(seatNumber);
    }


    public String getFlightNumber() {
        return flightNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public ArrayList<Integer> getSeatNumbers() {
        return seatNumbers;
    }

    public int remainingSeats() { return this.plane.getCapacity() - passengerCount(); }


}
