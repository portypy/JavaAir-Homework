package airline;

public class CabinCrewMember {
    private String name;
    private CabinCrewMemberType cabinCrewMemberType;

    public CabinCrewMember(String name, CabinCrewMemberType cabinCrewMemberType){
        this.name = name;
        this.cabinCrewMemberType = cabinCrewMemberType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CabinCrewMemberType getCabinCrewMemberType() {
        return cabinCrewMemberType;
    }
    public String messageToPassengers(){
        return "Smoking is not allowed on any JavaAir flight";
    }
}
