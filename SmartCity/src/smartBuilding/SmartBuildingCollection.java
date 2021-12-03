package smartBuilding;
import java.util.concurrent.atomic.AtomicInteger;

import devices.NetworkGatewayCollection;
import smartStreet.SmartStreet;


public class SmartBuildingCollection {
	private static final AtomicInteger count = new AtomicInteger(0); // Auto-increment of Building ID;

  public static void addBuilding(SmartStreet smartStreet, String type, String location, int numResidents) {
    SmartBuilding smartBuilding = new SmartBuilding(count.incrementAndGet(), type, location, numResidents);
    smartBuilding.controlRoom = new ControlRoom(count.incrementAndGet());
    NetworkGatewayCollection.addNetworkGateway(smartBuilding.controlRoom);
    smartStreet.smartBuildings.put(smartBuilding.getID(), smartBuilding);
    smartStreet.generalControlRoom.setNumBuildings(smartStreet.smartBuildings.size());
  }
}
