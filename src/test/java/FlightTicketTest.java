import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTicketTest {

    FlightTicket ticket;
    Flight flight;
    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Vicky");
        flight = new Flight(PlaneType.AirbusA34, 10, "Glasgow");
        ticket = new FlightTicket(flight, passenger);
    }

    @Test
    public void hasPassengerName() {
        assertEquals("Vicky", passenger.getName());
    }

    @Test
    public void ticketHasFlightNumber() {
        assertEquals(10, flight.getFlightNumber());
    }

//    @Test
//    public void hasPrice() {
//        assertEquals(5, ticket.getPrice());
//    }
}
