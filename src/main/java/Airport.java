import sun.security.krb5.internal.Ticket;

import java.util.ArrayList;

public class Airport {

    private String airCode;
    private ArrayList<Plane> hangar;
    private ArrayList<Flight> flights;
    private ArrayList<FlightTicket> ticketsSold;

    public Airport(String airCode) {
        this.airCode = airCode;
        this.hangar = new ArrayList<>();
        this.flights = new ArrayList<>();
        this.ticketsSold = new ArrayList<>();

    }

    public String getAirCode() {
        return airCode;
    }

    public int hangarCount() {
        return hangar.size();
    }

    public void addPlane(Plane plane) {
        hangar.add(plane);
    }

    public int flightsCount() {
        return flights.size();
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public Plane getPlane(PlaneType planeType) {
        for (Plane plane : hangar) {
            if (planeType == plane.getType())
                return plane;
        }
        System.out.println("No planes for the flight");
        return null;

    }

    public void newFlight(PlaneType planeType, int fNumber, String destination) {
        if (getPlane(planeType).getType() == planeType) {
        Flight newFlight = new Flight(planeType, fNumber ,destination);
        flights.add(newFlight);}
    }

    public Flight getFlight(String destination) {
        for (Flight flight : flights) {
            if (destination == flight.getDestination())
                return flight;
        }
        System.out.println("There are no flights going there");
        return null;
    }


    public int ticketsCount() {
        return ticketsSold.size();
    }

    public void sellTicket(Flight flight, Passenger passenger){
        if (flight.getPlane().getValue() > ticketsPerFlight(flight.getFlightNumber())) {
            FlightTicket newTicket = new FlightTicket(flight, passenger);
            ticketsSold.add(newTicket);
        }
    }

    public int ticketsPerFlight(int flightNumber) {
        String flightDest = null;
        ArrayList thisFlight = new ArrayList<>();
        for (FlightTicket tik : ticketsSold) {
            if (tik.getFlight().getFlightNumber() == flightNumber) {
                flightDest = tik.getFlight().getDestination();
                thisFlight.add(tik);
            }
        }
//        System.out.printf("There are %s passenger(s) going to %s" , thisFlight.size(), flightDest);
        return thisFlight.size();
    }
}
