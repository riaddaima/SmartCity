package smartBuilding;

public class ControlRoom {
  private String ID;

  public ControlRoom(String ID) {
    this.ID = ID;
  }

  public String getID() {
    return this.ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }


  @Override
  public String toString() {
    return "{" +
      " ID='" + getID() + "'" +
      "}";
  }

}
