package devices;
import java.util.*;

public class NetworkGateway {

  public Map<Integer, SensorNodes> sensorNodes;
  public CommunicationModule communicationModule;
  public Microcontroller microController;

  public NetworkGateway() {
		this.sensorNodes = new HashMap<Integer, SensorNodes>();
    this.communicationModule = new CommunicationModule();
    this.microController = new Microcontroller();
  }

  @Override
  public String toString() {
    String result = "[NetworkGateway]\n";
    for (Map.Entry<Integer, SensorNodes> sensorNode : sensorNodes.entrySet()) {
      result = result.concat(String.format("\t[Apartment-%d]\t\t\t\t%s\n", sensorNode.getKey(), sensorNode.getValue()));
    }
    return result;
  }
}
