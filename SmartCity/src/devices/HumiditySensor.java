package devices;

public class HumiditySensor {
  private int value;


  public HumiditySensor() {
    int min = 20, max = 60;
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
    return String.format("\n\t[Humidity Sensor]: %d%%", getValue());
  }


}
