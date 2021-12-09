package smartBuilding;
import devices.SensorNodes;

public class ApartmentSensorNode extends SensorNodes {

  private String humiditySensor;
  private String communicationModule;
  private boolean motionSensor;

  public ApartmentSensorNode() {
    super();
    int min = 0, max = 500;
    int value = (int) Math.floor(Math.random()*(max-min+1)+min);
    this.humiditySensor = String.format("%d %", value);
    setCommunicationModule("ESP8266 IoT");
    setMotionSensor(false);
  }

  public String getCommunicationModule() {
    return this.communicationModule;
  }

  public void setCommunicationModule(String communicationModule) {
    this.communicationModule = communicationModule;
  }

  public boolean isMotionSensor() {
    return this.motionSensor;
  }

  public boolean getMotionSensor() {
    return this.motionSensor;
  }

  public void setMotionSensor(boolean motionSensor) {
    this.motionSensor = motionSensor;
  }

  public String getHumiditySensor() {
    return this.humiditySensor;
  }

  public void setHumiditySensor(String humiditySensor) {
    this.humiditySensor = humiditySensor;
  }

}