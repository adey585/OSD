package hwweek2;

public abstract class StaticRoadItem extends RoadItem {

    void method() {
        System.out.println("Implementing method from RoadItem Class");
        commonMethod();
    }

    String signs = "Be cognizant of street signs";
    String fourWays = "Look out all four corners";
    int maxSpeed = 120;
    String rightAway = "Proceed with caution";

}
