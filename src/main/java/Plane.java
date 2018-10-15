import java.util.ArrayList;

public class Plane {

    private PlaneType type;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType type, String airline) {
        this.type = type;
        this.airline = airline;
        this.passengers = new ArrayList<>();

    }

    public PlaneType getType() {
        return type;
    }

    public int getCapacity() {
        return type.getValue();
    }

    public String getAirline() {
        return airline;
    }


    public int passengerCount() {
        return passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public PlaneType getPlaneType() {
        return type;
    }
}
