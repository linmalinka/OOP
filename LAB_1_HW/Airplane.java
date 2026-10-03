
public class Airplane extends AirVehicle {

    enum AutopilotModes {
        ON,
        OFF
    }

    private String type;
    private String flightNumber;
    private String manufacturer;

    private AutopilotModes autopilot = AutopilotModes.OFF;
    private boolean doorsOpen = false;
    private boolean luggageCompartmentOpen = false;


    public String getType() {
        return type;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String newFlightNumber) {
        this.flightNumber = newFlightNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String newManufacturer) {
        this.manufacturer = newManufacturer;
    }


    public void setAutopilotMode(AutopilotModes newMode) {
        if (getStatus() == FlightStatus.IN_AIR) {
            this.autopilot = newMode;
            System.out.println("Autopilot: " + newMode);
        }
        else {
            System.out.println("Autopilot can be changed only in the air");
        }
    }


    public void openDoors() {
        if (getStatus() == FlightStatus.ON_GROUND) {
            doorsOpen = true;
            System.out.println("Airplane doors are open");
        }
        else {
            System.out.println("Doors can be opened only on the ground");
        }
    }



    public void openLuggageCompartment(boolean luggageOpenMode) {
        if (getStatus() == FlightStatus.ON_GROUND) {
            luggageCompartmentOpen = luggageOpenMode;

            if (luggageCompartmentOpen) {
                System.out.println("Luggage compartment is open");
            }
            else {
                System.out.println("Luggage compartment is closed");
            }
        }
        else {
            System.out.println(
                "Luggage compartment can be opened only on the ground"
            );
        }
    }
}
