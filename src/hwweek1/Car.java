package hwweek1;

public class Car {

    //Fields(Attributes)
    private double currentSpeed;
    private String currentDirection;
    private String currentLocation;

    //Methods
    public void accelerate(double toSpeed) {}
    public void decelerate(double toSpeed) {}
    public void Turn(String direction, double degrees) {}

    //Constructors
    public Car(double currentSpeed, String currentDirection, String currentLocation) {
        currentSpeed = currentSpeed;
        currentDirection = currentDirection;
        currentLocation = currentLocation;
    }

    public Car(){}

    //Setter Methods
    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    //Getter Methods
    public double getCurrentSpeed() { return currentSpeed; }

    public String getCurrentDirection() { return currentDirection; }

    public String getCurrentLocation() { return currentLocation; }
}
