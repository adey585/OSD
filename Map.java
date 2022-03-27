package hwweek6;
import java.util.*;

public class Map {
    private List<Road> roads;

    public Map() {
        roads = new List<Road>();
    }

    public void AddRoad(Road road) {
        roads.add(road);
    }

    public void Print(IPrintDriver pd, Object o) {
        for(Road road : roads) {
            road.Print(pd, o);
        }
    }
}

// ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();