package smartBuilding;
import java.util.concurrent.atomic.AtomicInteger;
import smartStreet.SmartStreet;

public class ApartmentCollection {
	private static final AtomicInteger count = new AtomicInteger(0); // Auto-increment of Building ID;
  
  public static void addApartement(SmartStreet smartStreet, int buildingID, int floorID) {
    Apartment apartment = new Apartment(count.incrementAndGet());
    Floor floor = smartStreet.smartBuildings.get(buildingID).floors.get(floorID);
    floor.apartments.put(apartment.getID(), apartment);
    floor.setNumApartments(floor.apartments.size());
  }
}
