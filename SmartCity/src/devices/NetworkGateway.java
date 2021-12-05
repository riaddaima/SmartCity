package devices;
import java.util.*;

public class NetworkGateway {

  private int ID;
  public Map<Integer, SensorNodes> sensorNodes;
  public CommunicationModule communicationModule;
  public Microcontroller microController;

  public NetworkGateway(int ID) {
    this.ID = ID;
		this.sensorNodes = new HashMap<Integer, SensorNodes>();
    this.communicationModule = new CommunicationModule();
    this.microController = new Microcontroller();
  }

  public int getID() {
    return this.ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }
  
  @Override
  public String toString() {
    String result = "[NetworkGateway]\n";
    for (Map.Entry<Integer, SensorNodes> sensorNode : sensorNodes.entrySet()) {
      result = result.concat(String.format("[Apartment-%d]\n\t%s\n", sensorNode.getKey(), sensorNode.getValue()));
    }
    return result;
  }
}
