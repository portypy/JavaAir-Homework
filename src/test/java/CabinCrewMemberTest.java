import airline.CabinCrewMember;
import airline.CabinCrewMemberType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Gloria", CabinCrewMemberType.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Gloria", cabinCrewMember.getName());
    }

    @Test
    public void canChangeName() {
        cabinCrewMember.setName("Deltalina");
        assertEquals("Deltalina", cabinCrewMember.getName());
    }

    @Test
    public void hasMemberType() {
        assertEquals(CabinCrewMemberType.FLIGHT_ATTENDANT, cabinCrewMember.getCabinCrewMemberType());
    }
    @Test
    public void canRelayMessage(){
        assertEquals("Smoking is not allowed on any JavaAir flight", cabinCrewMember.messageToPassengers());
    }
}
