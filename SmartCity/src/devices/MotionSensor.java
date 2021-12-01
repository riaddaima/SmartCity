package devices;

public class MotionSensor extends SensorNodes {
  private int value;


  public MotionSensor(int ID, int value) {
    super(ID);
    this.value = value;
  }


  public int getValue() {
    return this.value;
  }

  public void setValue(int value) {
    this.value = value;
  }


  @Override
  public String toString() {
    return "{" +
      " value='" + getValue() + "'" +
      "}";
  }

}
