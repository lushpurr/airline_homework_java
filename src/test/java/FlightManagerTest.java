import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;
    Plane smallPlane;
    Plane largePlane;

    @Before
    public void setUp(){
        smallPlane = new Plane(PlaneType.BOEING747);
        largePlane = new Plane(PlaneType.AIRBUSA380);
        flightManager = new FlightManager(smallPlane);

    }

    @Test
    public void canGetCapacity(){
        assertEquals(3, flightManager.getPlaneCapacity());
    }
//    calculate how much baggage weight should be reserved for each passenger for a flight

    @Test
    public void canGetBaggageWeightReservedPerPassenger(){
        assertEquals(30.0, flightManager.getPassengerBaggageReserve(), 0.01);
    }

//    calculate how much baggage weight is booked by passengers of a flight


//    calculate how much overall weight reserved for baggage remains for a flight

}
