import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane;
    Plane plane2;
    Passenger passenger;
    FlightTicket ticket;
    Flight flight;
    Flight flight2;

    @Before
    public void before() {
        airport = new Airport("ArmandoTola");
        plane = new Plane(PlaneType.AirbusA34, "Austral");
        plane2 = new Plane(PlaneType.Boeing777, "EasyJet");
        passenger = new Passenger("German");
        flight = new Flight(plane.getType(), 4, "London");
        flight2 = new Flight(plane2.getType(), 5, "Glasgow");
        ticket = new FlightTicket(flight, passenger);
    }

    @Test
    public void hasAirCode() {
        assertEquals("ArmandoTola", airport.getAirCode());
    }

    @Test
    public void canAddPlaneToHangar() {
        airport.addPlane(plane);
        assertEquals(1, airport.hangarCount());
    }

    @Test
    public void canChoosePlane() {
        airport.addPlane(plane);
        airport.getPlane(PlaneType.AirbusA34);
        assertEquals(PlaneType.AirbusA34, plane.getType());
    }

    @Test
    public void canCreateFlight() {
        airport.addPlane(plane);
        airport.addPlane(plane2);
        airport.newFlight(PlaneType.AirbusA34, 1, "Buenos Aires");
        airport.newFlight(PlaneType.Boeing777, 2, "London");
        assertEquals(2, airport.flightsCount());
//        System.out.println(airport.getFlights());
    }

    @Test
    public void canSellTicket() {
        airport.sellTicket(flight, passenger);
        assertEquals(1, airport.ticketsCount());
    }

    @Test
    public void ticketsSoldPerFlight() {
        airport.sellTicket(flight, passenger);
        airport.sellTicket(flight, passenger);
        //1 too many shouldnt add. Plane is full.
        airport.sellTicket(flight, passenger);

        airport.sellTicket(flight2, passenger);
        airport.sellTicket(flight2, passenger);
        airport.sellTicket(flight2, passenger);
        airport.sellTicket(flight2, passenger);
        //1 too many, shouldnt add. Plane is full.
        airport.sellTicket(flight2, passenger);
        airport.sellTicket(flight2, passenger);
        airport.sellTicket(flight2, passenger);
        airport.sellTicket(flight2, passenger);
        assertEquals(6, airport.ticketsCount());
        assertEquals(4, airport.ticketsPerFlight(5));
    }
}
