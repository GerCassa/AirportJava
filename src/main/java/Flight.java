public class Flight {

    private PlaneType planeType;
    private int flightNumber;
    private String destination;

    public Flight(PlaneType planeType, int flightNumber, String destination) {
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }


    public PlaneType getPlane() {
        return planeType;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }
}
