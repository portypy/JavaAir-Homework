package airline;

public class Pilot {
    private String name;
    private PilotType pilotType;
    private String licenceNumber;

    public Pilot(String name, PilotType pilotType, String licenceNumber) {
        this.name = name;
        this.pilotType = pilotType;
        this.licenceNumber = licenceNumber;
    }

    public String getName() {
        return name;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public PilotType getPilotType() {
        return pilotType;
    }
}
