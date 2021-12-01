package devices;

public class SensorNodes {
  private int ID;


  public SensorNodes(int ID) {
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
    return "{" +
      " ID='" + getID() + "'" +
      "}";
  }

}
