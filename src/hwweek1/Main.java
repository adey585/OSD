package hwweek1;

public class Main {

    public static void main(String[] args) {

        Car c = new Car();
        c.setCurrentSpeed(90);
        System.out.println("The current speed is: " + c.getCurrentSpeed());

        Truck t = new Truck();
        t.setLoadWeight(1252.91);
        System.out.println("The load weight is: " + t.getLoadWeight());
    }
}
