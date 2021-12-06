package smartBuilding;

import devices.NetworkGateway;

public class ControlRoom {
  public NetworkGateway networkGateway;

  public ControlRoom() {
    this.networkGateway = new NetworkGateway();
  }

  @Override
  public String toString() {
    String result = "";
    result = result.concat("[ControlRoom]\n");
    result = result.concat(this.networkGateway.toString());
    return result;
  }

}
