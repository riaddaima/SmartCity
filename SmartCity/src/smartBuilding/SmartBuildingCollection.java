package smartBuilding;
import java.util.concurrent.atomic.AtomicInteger;
import smartStreet.SmartStreet;


public class SmartBuildingCollection {
	private static final AtomicInteger count = new AtomicInteger(0); // Auto-increment of Building ID;

  public static void addBuilding(SmartStreet smartStreet, String type, String location, int numResidents) {
    SmartBuilding smartBuilding = new SmartBuilding(count.incrementAndGet(), type, location, numResidents);
    smartStreet.smartBuildings.put(smartBuilding.getID(), smartBuilding);
  }

  // testing purpose: Initializing Buildings because we don't have SmartStreets implementation yet;
  // public SmartBuildingCollection() {
    // SmartBuildings = new ArrayList<>();
    // SmartBuildings.add(new SmartBuilding("Residential", "Smart Street Location", 10));
    // SmartBuildings.add(new SmartBuilding("Business", "Smart Street Location", 5));
    // SmartBuildings = new HashMap<Integer, SmartBuilding>();
    // SmartBuildings.put(count.incrementAndGet(), new SmartBuilding(count.get(), "Residential", "Smart Street Location", 10));
    // SmartBuildings.put(count.incrementAndGet(), new SmartBuilding(count.get(), "Business", "Smart Street Location", 5));
  // }
}
