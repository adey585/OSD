package hwweek5;

public class ImperialGUI extends GUI {

    public double GetSpeed(Vehicle v) {
        return (v.GetCurrentSpeed() * Constants.MpsToMph);
    }

    public void SetSpeedLimit(Vehicle v, double s) {
        v.SetDesiredSpeed(s/Constants.MpsToMph);
    }
}
