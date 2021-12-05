package devices;

public class SmartMeter {
  private int value;

  public SmartMeter() {
    int min = 0, max = 500;
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
    return String.format("\n\t[Smart Meter]: %d W", getValue());
  }

}
