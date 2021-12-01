package smartStreet;
import java.util.*;
import smartBuilding.*;

public class SmartStreet {
  private int ID;
  private String name;
  public Map<Integer, SmartBuilding> smartBuildings;

  public SmartStreet(int ID, String name) {
    this.ID = ID;
    this.name = name;
    smartBuildings = new HashMap<Integer, SmartBuilding>();
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

}