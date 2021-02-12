import airline.Plane;
import airline.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.GULFSTREAM);
    }
    @Test
    public void hasType(){
        assertEquals(PlaneType.GULFSTREAM, plane.getPlaneType());
    }
    @Test
    public void hasCapacity(){
        assertEquals(21, plane.getCapacity());
    }
    @Test
    public void canCheckWeight(){
        assertEquals(41200, plane.getWeight());
    }
}
