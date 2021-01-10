import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class FlightTest {
    Flight flight;
    Flight flight1;

    Date date.String;
    Date date1;

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
        passenger1 = new Passenger("Gavin", 1, null);
        passenger2 = new Passenger("Caroline", 1, null);
        passenger3 = new Passenger("Linda", 1, null);
        passenger4 = new Passenger("John", 1, null);
        passenger5 = new Passenger("Nadia", 1, null);
        passenger6 = new Passenger("Rikki", 1, null);
        passenger7 = new Passenger("Gregor", 1, null);
        passenger8 = new Passenger("Laura", 1, null);

        smallPlane = new Plane(PlaneType.BOEING747);
        largePlane = new Plane(PlaneType.AIRBUSA380);


        date = new Date(2021, Calendar.MAY,05, 06,30, 00);
        date1 = new Date(2019,Calendar.JUNE,10, 14, 45, 00);

        flight = new Flight(smallPlane, "BA122", "Lis", "GLA", date);
        flight1 = new Flight(largePlane, "BA356", "TOK", "GLA", date1 );


    }



    @Test
    public void canReturnPlaneCapacity(){
        assertEquals(3, flight.planeCapacity());
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

    @Test
    public void canConvertStringDateToLongDate(){

    }





}
