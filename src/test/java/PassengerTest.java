import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Bob",2, false);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", passenger.getName());
    }

    @Test
    public void hasLuggage() {
        assertEquals(2, passenger.getNrOfBags());
    }

    @Test
    public void canChangeName() {
        passenger.setName("Rob");
        assertEquals("Rob", passenger.getName());
    }

    @Test
    public void canChangeNrOfBags() {
        passenger.setNrOfBags(1);
        assertEquals(1, passenger.getNrOfBags());
    }

    @Test
    public void hasFlightProperty() {
        assertEquals(false, passenger.getFlight());
    }

    @Test
    public void canChangeFlightProperty() {
        passenger.setFlight(true);
        assertEquals(true, passenger.getFlight());
    }
}
