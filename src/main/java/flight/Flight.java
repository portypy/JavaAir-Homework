package flight;

import airline.CabinCrewMember;
import airline.Pilot;
import airline.Plane;
import passenger.Passenger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Flight {

    private ArrayList<Pilot> deckCrew;
    private ArrayList<CabinCrewMember>cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private DestinationType departureAirport;
    private DestinationType destination;
    private LocalDateTime departureTime;
    private int seats;

    public Flight(ArrayList<Pilot> deckCrew, ArrayList<CabinCrewMember> cabinCrew, ArrayList<Passenger> passengers,
                  Plane plane, String flightNumber, DestinationType departureAirport, DestinationType destination, LocalDateTime departureTime) {
        this.deckCrew = deckCrew;
        this.cabinCrew = cabinCrew;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destination = destination;
        this.departureTime = departureTime;
        this.seats = plane.getCapacity();

    }

    public int getDeckCrewSize() {
        return this.deckCrew.size();
    }

    public int getCabinCrewSize() {
        return this.cabinCrew.size();
    }

    public int getPassengersNumber() {
        return this.passengers.size();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public DestinationType getDepartureAirportName() {
        return this.departureAirport;
    }

    public DestinationType getDestination() {
        return this.destination;
    }

    public LocalDateTime getDepartureTime() {
        return this.departureTime;
    }

    public int getNumberOfSeats() {
        return this.seats;
    }

    public int getNumberOfEmptySeats() {
        return this.getNumberOfSeats() - this.getPassengersNumber();
    }

    public void bookPassenger(Passenger passenger) {
        if (this.getNumberOfEmptySeats() > 0){
            this.passengers.add(passenger);
            passenger.setFlight(true);
            int randomSeatNr = ThreadLocalRandom.current().nextInt(1, this.plane.getCapacity()+1);
                for (int i = 1; i < this.passengers.size(); i++)
                    if (randomSeatNr == passengers.get(i-1).getSeatNumber()) {
                        randomSeatNr = ThreadLocalRandom.current().nextInt(1, this.plane.getCapacity()+1);
                        i = 0;
                    }


            passenger.setSeatNumber(randomSeatNr);
        }
    }
}
