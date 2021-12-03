package devices;
import java.util.*;

public class NetworkGateway {

  public ArrayList<SensorNodes> sensorNodes;

  public NetworkGateway() {
		this.sensorNodes = new ArrayList<SensorNodes>();
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
