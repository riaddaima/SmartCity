package devices;
import java.util.*;

public class NetworkGateway {

  private int ID;
  public ArrayList<SensorNodes> sensorNodes;

  public NetworkGateway(int ID, int communicationModuleID, int microControllerID) {
    this.ID = ID;
		this.sensorNodes = new ArrayList<SensorNodes>();
    this.sensorNodes.add(new CommunicationModule());
    this.sensorNodes.add(new Microcontroller());
  }

  public int getID() {
    return this.ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }
  
  @Override
  public String toString() {
    String result = "";
    for (SensorNodes sensorNode : sensorNodes) {
      result = result.concat(sensorNode.toString());
    }
    return result;
  }
}
