package hwweek2and3;

public class Car extends Vehicle {

    protected void Accelerate(int secondsDelta) {
        SetCurrentSpeed(GetCurrentSpeed() + Constants.AccRate * secondsDelta * Constants.MpsToMph);
    }

    protected void Decelerate(int secondsDelta) {
        SetCurrentSpeed(GetCurrentSpeed() - Constants.DecRate * secondsDelta * Constants.MpsToMph);
    }

}
