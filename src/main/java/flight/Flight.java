package flight;

import airline.CabinCrewMember;
import airline.Pilot;
import airline.Plane;
import airline.PlaneType;
import passenger.Passenger;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> deckCrew;
    private ArrayList<CabinCrewMember>cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private DestinationType departureAirport;
    private DestinationType destination;
    private String departureTime;
    private int emptySeats;

    public Flight(ArrayList<Pilot> deckCrew, ArrayList<CabinCrewMember> cabinCrew, ArrayList<Passenger> passengers,
                  Plane plane, String flightNumber, DestinationType departureAirport, DestinationType destination, String departureTime) {
        this.deckCrew = deckCrew;
        this.cabinCrew = cabinCrew;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destination = destination;
        this.departureTime = departureTime;
        this.emptySeats = plane.getCapacity();

    }

    public int getDeckCrewSize() {
        return deckCrew.size();
    }

    public int getCabinCrewSize() {
        return cabinCrew.size();
    }

    public int getPassengersNumber() {
        return passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public DestinationType getDepartureAirport() {
        return departureAirport;
    }

    public DestinationType getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getEmptySeats() {
        return emptySeats;
    }
}
