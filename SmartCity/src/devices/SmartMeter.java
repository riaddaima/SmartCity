package devices;

public class SmartMeter extends SensorNodes {
  private int value;

  public SmartMeter(int ID, int value) {
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
    return String.format("\n\t[Smart Meter]: %d W", getValue());
  }

}
