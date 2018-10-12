public class Flight {

    private PlaneType plane;
    private int flightNumber;
    private String destination;

    public Flight(PlaneType plane, int flightNumber, String destination) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }


    public PlaneType getPlane() {
        return plane;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }
}
