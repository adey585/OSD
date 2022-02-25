package hwweek5;
import java.util.*;

public class Main {

    public static void main(String[ ] args) {
        GUI gui;
        gui = null;
        char choice = ' ';
        double enterSpeedLimit = 0;

        Scanner sc = new Scanner(System.in);

        if(choice != 'I' && choice != 'M') {

            System.out.print("Enter 'I' for imperial or 'M' for metric: ");
            choice = sc.next().charAt(0);

            if(choice == 'I') {
                gui = new ImperialGUI();

            } else if(choice =='M') {
                gui = new MetricGUI();

            } else
                System.out.println("Incorrect Input!");
        }

        System.out.print("Enter speed limit: ");
        enterSpeedLimit = sc.nextDouble();

        Car car = new Car();
        gui.SetSpeedLimit(car, enterSpeedLimit);
        Truck truck1 = new Truck(4);
        gui.SetSpeedLimit(truck1, enterSpeedLimit);
        Truck truck2 = new Truck(8);
        gui.SetSpeedLimit(truck2, enterSpeedLimit);

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(car);
        vehicles.add(truck1);
        vehicles.add(truck2);

        for (int i = 0; i < 11; i++) {

            for (Vehicle v : vehicles) {
                v.UpdateSpeed(1);
                String s = v.getClass().toString();
                System.out.println(s + " speed:" + String.format(" %.2f", gui.GetSpeed(v)));
            }
        }
    }
}

