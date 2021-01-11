import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    Passenger passenger1;
    Passenger passenger2;
    Plane smallPlane;
    Plane largePlane;
    Flight flight;
    FlightManager flightManager;


    @Before
    public void setUp(){
        passenger1 = new Passenger("Gavin", 1);
        passenger2 = new Passenger("Caroline", 1);
        smallPlane = new Plane(PlaneType.BOEING747);
        largePlane = new Plane(PlaneType.AIRBUSA380);
        flight = new Flight(smallPlane, "BA122", "Lis", "GLA", null );
        flightManager = new FlightManager(flight);

    }


//    calculate how much baggage weight is booked by passengers of a flight
    @Test
    public void canGetWeightOfSinglePassengersBaggage(){
        assertEquals(30, flightManager.getWeightOfPassengerBaggage(passenger1));
    }

    @Test
    public void canGetTotalWeightOfPassengersBaggage(){
        flight.addPassengerIfSpace(passenger1);
        flight.addPassengerIfSpace(passenger2);
        assertEquals(60, flightManager.getTotalBaggageWeight(flight.getPassengers()));
    }

//    calculate how much overall weight reserved for baggage remains for a flight
    @Test
    public void canGetRemainingBaggageWeight(){
        flight.addPassengerIfSpace(passenger1);
        flight.addPassengerIfSpace(passenger2);
        assertEquals(30, flightManager.getRemainingBaggageWeight(flight.getPassengers()), 0.01);
    }

    // sort passengers

    @Test
    public void canSortPassengers(){
        flightManager.bookPassenger(passenger1);
        flightManager.bookPassenger(passenger2);
        passenger1.setSeatNumber(2);
        passenger2.setSeatNumber(1);
        ArrayList<Passenger> sortedPassengers = flightManager.sortPassengers();
        Passenger firstPassengerInArray = sortedPassengers.get(0);
        assertEquals(passenger2, firstPassengerInArray);
    }
}
