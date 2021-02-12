import airline.*;
import flight.DestinationType;
import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Pilot pilot;
    Pilot pilot1;
    CabinCrewMember cabinCrewMember;
    CabinCrewMember cabinCrewMember1;
    Passenger passenger;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        plane = new Plane(PlaneType.HONDA);
        pilot = new Pilot("Bob", PilotType.CAPTAIN, "007");
        pilot1 = new Pilot("Rob", PilotType.FIRST_OFFICER, "021");
        ArrayList<Pilot> deckCrew = new ArrayList<>();
        deckCrew.add(pilot);
        deckCrew.add(pilot1);
        cabinCrewMember = new CabinCrewMember("Gloria", CabinCrewMemberType.PURSER);
        cabinCrewMember1 = new CabinCrewMember("Ann", CabinCrewMemberType.FLIGHT_ATTENDANT);
        ArrayList<CabinCrewMember> cabinCrew = new ArrayList<>();
        cabinCrew.add(cabinCrewMember);
        cabinCrew.add(cabinCrewMember1);
        passenger = new Passenger("Lars", 2);
        passenger1 = new Passenger("Herman", 1);
        passenger2 = new Passenger("Borg", 0);
        ArrayList<Passenger>passengers = new ArrayList<>();
        passengers.add(passenger);
        flight = new Flight(deckCrew, cabinCrew, passengers, plane, "FE123", DestinationType.EDI, DestinationType.BRR, LocalDateTime.of(2021, 5, 21, 15, 33));
    }

    @Test
    public void hasPilots(){
        assertEquals(2, flight.getDeckCrewSize());
    }
    @Test
    public void hasCabinCrew(){
        assertEquals(2, flight.getCabinCrewSize());
    }
    @Test
    public void hasPassengers(){
        assertEquals(1, flight.getPassengersNumber());
    }
    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }
    @Test
    public void hasFlightNum(){
        assertEquals("FE123", flight.getFlightNumber());
    }
    @Test
    public void hasDepartureAirport(){
        assertEquals(DestinationType.EDI, flight.getDepartureAirportName());
    }
    @Test
    public void hasDestination(){
        assertEquals(DestinationType.BRR, flight.getDestination());
    }
    @Test
    public void hasDepartureTime(){
        assertEquals(LocalDateTime.of(2021, 5, 21, 15, 33), flight.getDepartureTime());
    }
    @Test
    public void hasSeats(){
        assertEquals(2, flight.getNumberOfSeats());
    }
    @Test
    public void canCheckEmptySeats(){
        assertEquals(1, flight.getNumberOfEmptySeats());
    }
    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(0, flight.getNumberOfEmptySeats());
        assertEquals(2, flight.getPassengersNumber());
    }

    @Test
    public void cantBookToManyPassengers() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(0,flight.getNumberOfEmptySeats());
        assertEquals(2,flight.getPassengersNumber());
    }

}
