
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Airplane airplane = new Airplane();

        // Настраиваем самолет
        airplane.setWeight(50000);
        airplane.setMaxSpeed(988);
        airplane.setMaxHeight(12500);
        airplane.setType("Passenger");
        airplane.setFlightNumber("MH370");
        airplane.setManufacturer("Boeing");

        ArrayList<String> crew = new ArrayList<>();
        airplane.getCrew().add("Pylot: Ivan");
        airplane.getCrew().add("Co-pylot: Vanya");

        System.out.println("=== AIRPLANE ===");
        System.out.println("Type: " + airplane.getType());
        System.out.println("Flight number: " + airplane.getFlightNumber());
        System.out.println("Manufacturer: " + airplane.getManufacturer());
        System.out.println("Weight: " + airplane.getWeight());
        System.out.println("Max speed: " + airplane.getMaxSpeed());
        System.out.println("Max height: " + airplane.getMaxHeight());
        System.out.println("Crew: " + airplane.getCrew());


        System.out.println("\n=== FLIGHT ===");

        airplane.fly();

        airplane.setCrew(crew);

        airplane.changeSpeed(500);
        airplane.changeHeight(8000);
        airplane.changeDirection(
            AirVehicle.FlightDirections.WEST
        );

        airplane.setAutopilotMode(
            Airplane.AutopilotModes.ON
        );

        airplane.contactTheDispatcher();
        airplane.openDoors(true);

        System.out.println("\n=== LAND ===");

        airplane.land();

        airplane.openDoors(true);
        airplane.openLuggageCompartment(true);
    }
}
