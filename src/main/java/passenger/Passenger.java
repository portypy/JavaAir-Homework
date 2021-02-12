package passenger;

public class Passenger {
    private String name;
    private int nrOfBags;

    public Passenger(String name, int nrOfBags) {
        this.name = name;
        this.nrOfBags = nrOfBags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrOfBags() {
        return nrOfBags;
    }

    public void setNrOfBags(int nrOfBags) {
        this.nrOfBags = nrOfBags;
    }
}
