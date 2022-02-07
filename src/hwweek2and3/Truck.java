package hwweek2and3;

public class Truck extends Vehicle {

    private int loadWeight;      // in tons

    public Truck(int weight) {
        loadWeight = weight;
    }

    protected void Accelerate(int secondsDelta) {
        if (loadWeight <= 5)
            SetCurrentSpeed(GetCurrentSpeed() + Constants.AccRateEmpty * secondsDelta * Constants.MpsToMph);
        else
            SetCurrentSpeed(GetCurrentSpeed() + Constants.AccRateFull * secondsDelta * Constants.MpsToMph);
    }

    protected void Decelerate(int secondsDelta) {
        if (loadWeight <= 5)
            SetCurrentSpeed(GetCurrentSpeed() - Constants.DecRateEmpty * secondsDelta * Constants.MpsToMph);
        else
            SetCurrentSpeed(GetCurrentSpeed() - Constants.DecRateFull * secondsDelta * Constants.MpsToMph);
    }

}

