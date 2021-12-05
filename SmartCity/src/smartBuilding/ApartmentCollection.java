package smartBuilding;
import java.util.concurrent.atomic.AtomicInteger;
import smartStreet.SmartStreet;
import devices.ApplianceType;
import devices.Appliance;

public class ApartmentCollection {
	private static final AtomicInteger count = new AtomicInteger(0); // Auto-increment of Apartment ID;
  
  public static void addApartement(SmartStreet smartStreet, int buildingID, int floorID) {
    Floor floor = smartStreet.smartBuildings.get(buildingID).floors.get(floorID);
    Apartment apartment = new Apartment(count.incrementAndGet());
    
    for (ApplianceType apt : ApplianceType.values()) {
      Appliance appliance = new Appliance(apt);
      apartment.appliances.put(appliance.getType(), appliance);
    }
    floor.apartments.put(apartment.getID(), apartment);
    floor.setNumApartments(floor.apartments.size());
    smartStreet.smartBuildings.get(buildingID).controlRoom.networkGateway.sensorNodes.put(apartment.getID(), apartment.sensorNode); // Appending sensorNode to network gateway whenever an apartment is added.
  }
}
