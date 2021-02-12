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
}
