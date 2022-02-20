package hwweek5;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        GUI gui;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'M' for metric or 'I' for Imperial: ");
        char enter = sc.next().charAt(0);
        System.out.print("Enter speed limit: ");
        double enterSpeedLimit = sc.nextDouble();

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

        if(enter=='I') {
            gui = new ImperialGUI();
            for (int i = 0; i < 11; i++) {

                for (Vehicle v : vehicles) {
                    v.UpdateSpeed(1);
                    String s = v.getClass().toString();
                    System.out.println(s + " speed:" + String.format(" %.2f", gui.GetSpeed(v)) + " MPH");
                }
            }
        } else if(enter=='M') {
            gui = new MetricGUI();
            for (int i = 0; i < 11; i++) {

                for (Vehicle v : vehicles) {
                    v.UpdateSpeed(1);
                    String s = v.getClass().toString();
                    System.out.println(s + " speed:" + String.format(" %.2f", gui.GetSpeed(v)) + " KPH");
                }
            }
        } else {
            System.out.println("Incorrect input!");
        }

    }
}
