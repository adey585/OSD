package hwweek2;

public abstract class RoadItem {

    void commonMethod() {
        System.out.println("This is common method for all subclasses");
    }

    abstract void method();

}
