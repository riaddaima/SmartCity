package smartBuilding;
import java.util.concurrent.atomic.AtomicInteger;
import smartStreet.SmartStreet;

public class ApartmentCollection {
	private static final AtomicInteger count = new AtomicInteger(0); // Auto-increment of Building ID;
  
  public static void addApartement(SmartStreet smartStreet, int buildingID, int floorID) {
    Apartment apartment = new Apartment(count.incrementAndGet());
    smartStreet.smartBuildings.get(buildingID).floors.get(floorID).apartments.put(apartment.getID(), apartment);
  }
}
