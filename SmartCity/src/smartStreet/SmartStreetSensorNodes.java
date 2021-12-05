package smartStreet;
import devices.*;

public class SmartStreetSensorNodes {
  public Microcontroller microController;
  public TemperatureSensor temperatureSensor;
  public SmartMeter smartMeter;

  public SmartStreetSensorNodes() {
    this.microController = new Microcontroller();
    this.temperatureSensor = new TemperatureSensor();
    this.smartMeter = new SmartMeter();
  }
}
