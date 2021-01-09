import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    Passenger passenger7;
    Passenger passenger8;


    @Before
    public void setUp() {
        passenger1 = new Passenger("Gavin", 1);
        passenger2 = new Passenger("Caroline", 1);
        passenger3 = new Passenger("Linda", 1);
        passenger4 = new Passenger("John", 1);
        passenger5 = new Passenger("Nadia", 1);
        passenger6 = new Passenger("Rikki", 1);
        passenger7 = new Passenger("Gregor", 1);
        passenger8 = new Passenger("Laura", 1);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Gavin", passenger1.getName());
    }

    @Test
    public void canGetNumBags(){
        assertEquals(1, passenger1.getNumBags());
    }
}
