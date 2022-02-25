package hwweek5;

public class MetricGUI extends GUI {

    public double GetSpeed(Vehicle v) {
        return (v.GetCurrentSpeed() * Constants.MpsToKph);
    }

    public void SetSpeedLimit(Vehicle v, double s) {
        v.SetDesiredSpeed(s/Constants.MpsToKph);
    }

}

