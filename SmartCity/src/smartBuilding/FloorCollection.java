package smartBuilding;
import java.util.concurrent.atomic.AtomicInteger;
import smartStreet.SmartStreet;
import java.util.*;

public class FloorCollection {
	private static final AtomicInteger count = new AtomicInteger(0); // Auto-increment of Building ID;

  public static void addFloor(SmartStreet smartStreet, int buildingID, int floorNum) {
    Floor floor = new Floor(count.incrementAndGet(), floorNum);
    smartStreet.smartBuildings.get(buildingID).floors.put(floor.getID(), floor);
  }
}
