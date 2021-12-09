package smartStreet;
import java.util.Map;
import java.util.HashMap;
import smartBuilding.SmartBuilding;

public class SmartStreet {
  private int ID;
  private String name;
  public Map<Integer, SmartBuilding> smartBuildings;
  public GeneralControlRoom generalControlRoom;
  private SmartStreetSensorNodes sensorNode;

  public SmartStreet(int ID, String name) {
    this.ID = ID;
    this.name = name;
    this.smartBuildings = new HashMap<Integer, SmartBuilding>();
    this.generalControlRoom = new GeneralControlRoom();
		this.sensorNode = new SmartStreetSensorNodes();
  }

  public int getID() {
    return this.ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SmartStreetSensorNodes getSensorNode() {
    return this.sensorNode;
  }

  public void setSensorNode(SmartStreetSensorNodes sensorNode) {
    this.sensorNode = sensorNode;
  }

}