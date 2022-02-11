package hwweek4;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.SetDesiredSpeed(65.0);
        Truck truck1 = new Truck(4);
        truck1.SetDesiredSpeed(55.0);
        Truck truck2 = new Truck(8);
        truck2.SetDesiredSpeed(50.0);
        ISimOutput simOutput = new MetricOutput();
        //ISimOutput simOutput = new ImperialOutput();

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(car);
        vehicles.add(truck1);
        vehicles.add(truck2);

        for (int i = 0; i < 11; i++) {

            for (Vehicle v:vehicles) {
                v.UpdateSpeed(1);
                String s = v.getClass().toString();
                System.out.println(s + " speed:" + String.format(" %.2f", simOutput.GetSpeed(v)) + " kmh");
                //System.out.println(s + " speed:" + String.format(" %.2f", simOutput.GetSpeed(v)) + " mph");
            }
        }

    }
}
