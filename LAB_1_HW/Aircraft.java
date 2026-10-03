
public class Aircraft{

    enum FlightStatus {
        IN_AIR,
        ON_GROUND
    }

    private double weight;
    private double maxSpeed;
    private double maxHeight;

    private FlightStatus status = FlightStatus.ON_GROUND;
    private double speed;

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public double getMaxHeight(){
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight){
        this.maxHeight = maxHeight;
    }

    public FlightStatus getStatus(){
        return status;
    }

    public double getSpeed(){
        return speed;
    }
    public void fly(){
        if (status != FlightStatus.IN_AIR){
            this.status = FlightStatus.IN_AIR;
            
        }
        
        else{
            System.out.println("The aircraft is already airborne");
        }
        
    }

    public void land(){
        if (status != FlightStatus.ON_GROUND){
            this.status = FlightStatus.ON_GROUND;
            this.speed = 0;
        }
        
        else{
            System.out.println("The aircraft is already on the ground.");
        }
    }

    public void changeSpeed(double newSpeed){
        if (status == FlightStatus.IN_AIR){
            if ((newSpeed <= maxSpeed) && (newSpeed > 0)){
                this.speed = newSpeed;
            }
            else{
                System.out.println("speed can't exceed max_speed");
            }
        }

        else{
            System.out.println("aircraft on ground");

        }
    }
}
