package smartBuilding;
import java.util.Map;
import java.util.HashMap;
import devices.NetworkGateway;

public class ControlRoom {

  public Map<Integer, Apartment> sensorNodes;
  public NetworkGateway networkGateway;

  public ControlRoom() {
		this.sensorNodes = new HashMap<Integer, Apartment>();
    this.networkGateway = new NetworkGateway();
  }

}
