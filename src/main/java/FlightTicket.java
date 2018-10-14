public class FlightTicket {

//    private int price;
    private Flight flight;
    private Passenger passenger;

    public FlightTicket(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger = passenger;
//        this.price = price;
    }

    public Passenger getPassenger() {
        return passenger;
    }

//    public int getPrice() {
//        return price;
//    }

    public Flight getFlight() {
        return flight;
    }

}
