package passenger;

public class Passenger {
    private String name;
    private int nrOfBags;
    private Boolean flight;
    private int seatNumber;

    public Passenger(String name, int nrOfBags, Boolean flight) {
        this.name = name;
        this.nrOfBags = nrOfBags;
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrOfBags() {
        return nrOfBags;
    }

    public void setNrOfBags(int nrOfBags) {
        this.nrOfBags = nrOfBags;
    }

    public Boolean getFlight() {
        return flight;
    }

    public void setFlight(Boolean flight) {
        this.flight = flight;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
