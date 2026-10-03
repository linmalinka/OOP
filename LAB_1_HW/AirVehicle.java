
import java.util.ArrayList;

public class AirVehicle extends Aircraft{
    enum FlightPrinciple{
        AEROSTATIC,
        AERODYNAMIC
    }
    enum FlightDirections{
        NORTH,
        SOUTH,
        WEST,
        EAST,
        NORTHWEST, 
        NORTHEAST,
        SOUTHWEST,
        SOUTHEAST
    }
    private ArrayList<String> crew = new ArrayList<>();

    private FlightPrinciple principle;
    private FlightDirections direction = FlightDirections.NORTH;
    private String purpose;

    private double height;
    

    public ArrayList<String> getCrew(){
        return crew;
    }

    public void setCrew(ArrayList<String> newCrew ){
        this.crew = newCrew;
    }

    public FlightPrinciple getPrinciple(){
        return principle;
    }

    public void setPrinciple(FlightPrinciple newPrinciple){
        this.principle = newPrinciple;
    }

    public String getPurpose(){
        return purpose;
    }

    public void setPurpose(String newPurpose){
        this.purpose = newPurpose;
    }    

    public double getHeight(){
        return height;
    }
    
    public void changeHeight(double height){
        if (getStatus() == FlightStatus.IN_AIR){
            if (height <= getMaxHeight() && height > 0){
                this.height = height;
            }
            else{
            System.out.println("height must be between 0 and max_height");
            }
        }

        else{
            System.out.println("air vehicle on ground");

        }
    }

public void changeDirection(FlightDirections newDirection){
    if (getStatus() == FlightStatus.IN_AIR){
        if (direction != newDirection){
            this.direction = newDirection;
            System.out.println("Direction: " + newDirection);
        }
        else{
            System.out.println("Air vehicle is already flying in this direction");
        }
    }
    else{
        System.out.println("Air vehicle on ground");
    }
}

    public void contactTheDispatcher(){
        System.out.printf("Air vehicle move on %s with speed %s km/h on heigh %s km%n", direction, getSpeed(), getHeight());
    }
}