package devices;

public class MotionSensor {
  private int value;

  public MotionSensor() {
    int min = 0, max = 10;
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
    return String.format("\n\t[Motion Sensor]: range %dm", getValue());
  }

}
