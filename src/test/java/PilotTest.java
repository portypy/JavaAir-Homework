import airline.Pilot;
import airline.PilotType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Bob", PilotType.CAPTAIN, "007");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(PilotType.CAPTAIN, pilot.getPilotType());
    }

    @Test
    public void hasLicence() {
        assertEquals("007", pilot.getLicenceNumber());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Ladies and Gentlemen, This Is Your Captain Speaking.", pilot.messageToPassengers());
    }
}
