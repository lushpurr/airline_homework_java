import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlightTest {
    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    Passenger passenger7;
    Passenger passenger8;


    Plane smallPlane;
    Plane largePlane;

    @Before
    public void setUp(){
        passenger1 = new Passenger("Gavin", 1);
        passenger2 = new Passenger("Caroline", 1);
        passenger3 = new Passenger("Linda", 1);
        passenger4 = new Passenger("John", 1);
        passenger5 = new Passenger("Nadia", 1);
        passenger6 = new Passenger("Rikki", 1);
        passenger7 = new Passenger("Gregor", 1);
        passenger8 = new Passenger("Laura", 1);

        smallPlane = new Plane(PlaneType.BOEING747);
        largePlane = new Plane(PlaneType.AIRBUSA380);

        flight = new Flight(smallPlane, "BA356", "TOK", "GLA", "20.00" );


    }

    @Test
    public void canReturnPlaneCapacity(){
        assertEquals(3, smallPlane.getCapacity());
    }

    @Test
    public void canAddPassengerToPassengerList(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertTrue(flight.getPassengers().contains(passenger1));
        assertEquals(2, flight.getPassengers().size());
    }

    @Test
    public void checkNumberOfGuestsOnFlight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(2, flight.passengerCount());

    }

    @Test
    public void canPassengersFitOnPlane(){

    }





}
