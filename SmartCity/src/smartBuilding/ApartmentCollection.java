package smartBuilding;
import java.util.concurrent.atomic.AtomicInteger;
import smartStreet.SmartStreet;
public class ApartmentCollection {
	private static final AtomicInteger count = new AtomicInteger(0); // Auto-increment of Apartment ID;
  
  public static void addApartement(SmartStreet smartStreet, int buildingID) {
    Apartment apartment = new Apartment(count.incrementAndGet());
    smartStreet.smartBuildings.get(buildingID).controlRoom.sensorNodes.put(apartment.getID(), apartment); // Appending sensorNode to network gateway whenever an apartment is added.
  }
}
