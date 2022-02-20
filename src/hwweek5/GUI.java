package hwweek5;

public abstract class GUI implements ISimInput, ISimOutput {

    public abstract double GetSpeed(Vehicle v);
    public abstract void SetSpeedLimit(Vehicle v, double speed);

}
