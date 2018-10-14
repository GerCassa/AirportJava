import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AirbusA34, "Austral");
        flight = new Flight(PlaneType.AirbusA34, 1, "Buenos Aires");
    }

    @Test
    public void hasPlane() {
        assertEquals(PlaneType.AirbusA34, flight.getPlane());
    }

    @Test
    public void getFlightNumber() {
        assertEquals(1, flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Buenos Aires", flight.getDestination());
    }

}
