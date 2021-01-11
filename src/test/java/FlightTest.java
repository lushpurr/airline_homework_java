import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class FlightTest {
    Flight flight;
    Flight flight1;

    Date date;
    Date date1;

    Passenger passenger;
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
        passenger = new Passenger("Colin", 2);

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


        date = new GregorianCalendar(2021, Calendar.JUNE, 10, 10,30).getTime();
        date1 = new GregorianCalendar(2021, Calendar.MAY, 5, 15,30).getTime();

        flight = new Flight(smallPlane, "BA122", "Lis", "GLA", date);
        flight1 = new Flight(largePlane, "BA356", "TOK", "GLA", date1 );


    }



    @Test
    public void canReturnPlaneCapacity(){
        assertEquals(3, flight.planeCapacity());
    }


    @Test
    public void canGenerateSeatNumbers(){
        assertEquals(3, flight.getSeatNumbers().size());
    }

    @Test
    public void canAllocateSeatNumbers(){
        flight.allocateSeatNumber(passenger);
        flight.allocateSeatNumber(passenger1);
        flight.allocateSeatNumber(passenger2);

        assertNotNull(passenger.getSeatNumber());
        assertEquals(0, flight.getSeatNumbers().size());
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
    public void canAddPassenger__smallPlane(){
        flight.addPassengerIfSpace(passenger1);
        flight.addPassengerIfSpace(passenger2);
        assertEquals(2, flight.passengerCount());
    }

    @Test
    public void cantAddPassenger__smallPlane(){
        flight.addPassengerIfSpace(passenger1);
        flight.addPassengerIfSpace(passenger2);
        flight.addPassengerIfSpace(passenger3);
        flight.addPassengerIfSpace(passenger4);
        flight.addPassengerIfSpace(passenger5);
        assertEquals(3, flight.passengerCount());
    }

    @Test
    public void cantAddPassengerIfSpace__largePlane(){
        flight1.addPassengerIfSpace(passenger1);
        flight1.addPassengerIfSpace(passenger2);
        flight1.addPassengerIfSpace(passenger3);
        flight1.addPassengerIfSpace(passenger4);
        flight1.addPassengerIfSpace(passenger5);
        flight1.addPassengerIfSpace(passenger6);
        assertEquals(5, flight1.passengerCount());
    }







}
