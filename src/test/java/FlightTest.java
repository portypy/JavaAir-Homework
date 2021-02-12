import airline.*;
import flight.DestinationType;
import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;

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
        passengers.add(passenger1);
//        passengers.add(passenger2);
        flight = new Flight(deckCrew, cabinCrew, passengers, plane,
                "FE123", DestinationType.EDI, DestinationType.BRR, "12:10");
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
        assertEquals(2, flight.getPassengersNumber());
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
        assertEquals(DestinationType.EDI, flight.getDepartureAirport());
    }
    @Test
    public void hasDestination(){
        assertEquals(DestinationType.BRR, flight.getDestination());
    }
    @Test
    public void hasDeptartureTime(){
        assertEquals("12:10", flight.getDepartureTime());
    }


}
