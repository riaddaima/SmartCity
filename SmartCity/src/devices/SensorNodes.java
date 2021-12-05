package devices;

public class SensorNodes {

  public MotionSensor motionSensor;
  public TemperatureSensor temperatureSensor;
  public Microcontroller microcontroller;
  public CommunicationModule communicationModule;
  public HumiditySensor humiditySensor;

  public SensorNodes() {
    this.motionSensor = new MotionSensor();
    this.temperatureSensor = new TemperatureSensor();
    this.humiditySensor = new HumiditySensor();
    this.microcontroller = new Microcontroller();
    this.communicationModule = new CommunicationModule();
  }

  @Override
  public String toString() {
    String result = "";
    result = result.concat(motionSensor.toString());
    result = result.concat(temperatureSensor.toString());
    result = result.concat(microcontroller.toString());
    result = result.concat(communicationModule.toString());
    result = result.concat(humiditySensor.toString());
    return result;
  }
}
