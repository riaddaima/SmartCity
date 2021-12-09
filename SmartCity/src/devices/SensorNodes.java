package devices;

public class SensorNodes {

  private String temperatureSensor;
  private String microController;

  public SensorNodes() {
    int min = 0, max = 40;
    int value = (int) Math.floor(Math.random()*(max-min+1)+min);
    this.temperatureSensor = String.format("%d °C", value);
    setMicroController("Arduino");
  }


  public String getTemperatureSensor() {
    return this.temperatureSensor;
  }

  public void setTemperatureSensor(String temperatureSensor) {
    this.temperatureSensor = temperatureSensor;
  }

  public String getMicroController() {
    return this.microController;
  }

  public void setMicroController(String microController) {
    this.microController = microController;
  }
}
