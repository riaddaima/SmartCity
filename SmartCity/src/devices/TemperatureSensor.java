package devices;

public class TemperatureSensor extends SensorNodes {
  private int value;

  public TemperatureSensor(int value) {
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
    return String.format("\n\t[Temperature Sensor]: %d °C", getValue());
  }

}
