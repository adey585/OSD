package hwweek2;
import java.io.Console;
import java.util.*;
import java.lang.*;

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
                Console.writeLine("{0} speed: {1:F} mph", s, v.GetCurrentSpeed());
            }
        }

    }

}
