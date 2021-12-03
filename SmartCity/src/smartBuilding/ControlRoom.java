package smartBuilding;

import devices.NetworkGateway;

public class ControlRoom {
  private int ID;
  public NetworkGateway networkGateway;

  public ControlRoom(int ID) {
    this.ID = ID;
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
    result = result.concat("\t[ControlRoom]");
    result = result.concat(this.networkGateway.toString());
    return result;
  }

}
