package airline;

public abstract class JavaAirEmployee {
    protected String name;

    protected JavaAirEmployee(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    };
}
