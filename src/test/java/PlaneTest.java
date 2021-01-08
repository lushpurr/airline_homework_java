import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane smallPlane;
    Plane largePlane;

    @Before
    public void setUp(){
        smallPlane = new Plane(PlaneType.BOEING747);
        largePlane = new Plane(PlaneType.AIRBUSA380);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING747, smallPlane.getType());
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(3, smallPlane.getCapacity());
    }

    @Test
    public void canGetPlaneWeight(){
        assertEquals(90, smallPlane.getWeight(), 0.01);
    }

    @Test
    public void canGetAvailableBaggageWeight(){
        assertEquals(45.0, smallPlane.getBaggageWeight(), 0.01);
    }

}
