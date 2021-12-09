package smartStreet;
import devices.*;

public class SmartStreetSensorNodes extends SensorNodes {
  
  private String smartMeter;

  public SmartStreetSensorNodes() {
    super();
    int min = 0, max = 500;
    int value = (int) Math.floor(Math.random()*(max-min+1)+min);
    this.smartMeter = String.format("%d W", value);
  }


  public String getSmartMeter() {
    return this.smartMeter;
  }

  public void setSmartMeter(String smartMeter) {
    this.smartMeter = smartMeter;
  }
}
