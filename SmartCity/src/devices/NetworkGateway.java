package devices;
public class NetworkGateway {

  public String communicationModule;
  public String microController;

  public NetworkGateway() {
    setCommunicationModule("ESP8266 IoT");
    setMicroController("Arduino");
  }


  public String getCommunicationModule() {
    return this.communicationModule;
  }

  public void setCommunicationModule(String communicationModule) {
    this.communicationModule = communicationModule;
  }

  public String getMicroController() {
    return this.microController;
  }

  public void setMicroController(String microController) {
    this.microController = microController;
  }

}
