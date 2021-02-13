import airline.*;
import flight.DestinationType;
import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Plane plane;
    Pilot pilot;
    Pilot pilot1;
    CabinCrewMember cabinCrewMember;
    CabinCrewMember cabinCrewMember1;
    Passenger passenger;
    Passenger passenger1;
    Passenger passenger2;
    FlightManager flightManager;
    @Before
    public void before(){
        plane = new Plane(PlaneType.CESSNA);
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
        passengers.add(passenger2);
        flight = new Flight(deckCrew, cabinCrew, passengers, plane, "FE123", DestinationType.EDI, DestinationType.BRR, LocalDateTime.of(2021, 5, 21, 15, 33));
        flightManager = new FlightManager("Bart");
    }
    @Test
    public void hasName(){
        assertEquals("Bart", flightManager.getName());
    }

    @Test
    public void canCalculateWeightOfBaggagePerPassenger() {
        assertEquals(277, flightManager.calculateBaggageWeightPerPassenger(flight));
    }
    @Test
    public void canCalculateHowMuchBaggageIsBooked() {
        assertEquals(831, flightManager.calculateHowMuchBaggageIsBooked(flight));
    }
    @Test
    public void canCalculateHowMuchWeightRemains() {
        assertEquals(4169, flightManager.calculateHowMuchWeightRemains(flight));
    }
}
