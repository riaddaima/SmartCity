package smartStreet;
import java.util.*;

import devices.SensorNodes;
import smartBuilding.*;

public class SmartStreet {
  private int ID;
  private String name;
  public Map<Integer, SmartBuilding> smartBuildings;
  public GeneralControlRoom generalControlRoom;
  public ArrayList<SensorNodes> sensorNodes;

  public SmartStreet(int ID, String name) {
    this.ID = ID;
    this.name = name;
    this.smartBuildings = new HashMap<Integer, SmartBuilding>();
    this.generalControlRoom = new GeneralControlRoom();
		this.sensorNodes = new ArrayList<SensorNodes>();
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


  @Override
  public String toString() {
    String result = "";
    result = result.concat(String.format("[Smart Street] %s.", getName()));
    return result;
  }
}