package hwweek2and3;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.SetDesiredSpeed(65.0);
        Truck truck1 = new Truck(4);
        truck1.SetDesiredSpeed(55.0);
        Truck truck2 = new Truck(8);
        truck2.SetDesiredSpeed(50.0);

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(car);
        vehicles.add(truck1);
        vehicles.add(truck2);

        for (int i = 0; i < 11; i++) {

            for (Vehicle v:vehicles) {
                v.UpdateSpeed(1);
                String s = v.getClass().toString();
                //ConsSole.writeLine("{0} speed: {1:F} mph", s, v.GetCurrentSpeed());
                //System.out.println(s + "speed:" + v.GetCurrentSpeed() + " mph");
                System.out.println(s + " speed:" + String.format(" %.2f", v.GetCurrentSpeed()) + " mph");
            }
        }

    }

}
