package airline;

public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getCapacity(){
        return planeType.getCapacity();
    }
    public int getWeight(){
        return planeType.getTotalWeight();
    }
}