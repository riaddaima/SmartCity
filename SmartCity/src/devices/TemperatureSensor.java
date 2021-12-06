package devices;

public class TemperatureSensor {
  private int value;

  public TemperatureSensor() {
    int min = 0, max = 40;
    int value = (int) Math.floor(Math.random()*(max-min+1)+min);
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
