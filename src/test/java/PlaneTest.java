import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AirbusA34, "Austral");
        passenger = new Passenger("German");
    }

    @Test
    public void hasAType() {
        assertEquals(PlaneType.AirbusA34, plane.getType());
    }

    @Test
    public void hasAirline() {
        assertEquals("Austral", plane.getAirline());
    }

    @Test
    public void hasCapacity(){
        assertEquals(295, plane.getCapacity());
    }

    @Test
    public void canAddPassengers() {
        plane.addPassenger(passenger);
        assertEquals(1, plane.passengerCount());
    }
}
