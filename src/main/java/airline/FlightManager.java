package airline;

import flight.Flight;

public class FlightManager extends JavaAirEmployee {


    public FlightManager(String name) {
        super(name);
    }

    public int calculateBaggageWeightPerPassenger(Flight flight){
       return (flight.getPlane().getWeight() / 2) / (flight.getNumberOfSeats() + flight.getDeckCrewSize() + flight.getCabinCrewSize());
    }

    public int calculateHowMuchBaggageIsBooked(Flight flight) {
        return (flight.getPassengersNumber() * this.calculateBaggageWeightPerPassenger(flight));
    }

    public int calculateHowMuchWeightRemains(Flight flight) {
        return (flight.getPlane().getWeight() / 2) - this.calculateHowMuchBaggageIsBooked(flight);
    }

}
