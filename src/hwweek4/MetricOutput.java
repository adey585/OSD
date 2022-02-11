package hwweek4;

public class MetricOutput implements ISimOutput {

    public double GetSpeed(Vehicle v) {
        return v.GetCurrentSpeed() * 1.6;
    }
}
