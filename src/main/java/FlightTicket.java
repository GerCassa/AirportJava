public class FlightTicket {

    private int price;
    private Flight flight;
    private Passenger passenger;

    public FlightTicket(int price, Flight flight, Passenger passenger) {
        this.price = price;
        this.flight = flight;
        this.passenger = passenger;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public int getPrice() {
        return price;
    }

    public Flight getFlight() {
        return flight;
    }

}
