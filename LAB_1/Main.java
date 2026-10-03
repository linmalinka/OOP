
public class Main {
    public static void main(String[] args) {

        Airplane airplane = new Airplane();

        // Настраиваем самолет
        airplane.setWeight(50000);
        airplane.setMaxSpeed(900);
        airplane.setMaxHeight(12000);
        airplane.setType("Passenger");
        airplane.setFlightNumber("SU123");
        airplane.setManufacturer("Boeing");

        System.out.println("=== AIRPLANE ===");
        System.out.println("Type: " + airplane.getType());
        System.out.println("Flight number: " + airplane.getFlightNumber());
        System.out.println("Manufacturer: " + airplane.getManufacturer());
        System.out.println("Weight: " + airplane.getWeight());
        System.out.println("Max speed: " + airplane.getMaxSpeed());
        System.out.println("Max height: " + airplane.getMaxHeight());

        System.out.println("\n=== FLIGHT ===");

        airplane.fly();

        airplane.changeSpeed(500);
        airplane.changeHeight(8000);
        airplane.changeDirection(
            AirVehicle.FlightDirections.EAST
        );

        airplane.setAutopilotMode(
            Airplane.AutopilotModes.ON
        );

        airplane.contactTheDispatcher();

        System.out.println("\n=== LANDING ===");

        airplane.land();

        airplane.openDoors();
        airplane.openLuggageCompartment(false);
    }
}
