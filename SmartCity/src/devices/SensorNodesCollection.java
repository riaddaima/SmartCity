package devices;

import smartBuilding.Apartment;
import smartStreet.SmartStreet;


public class SensorNodesCollection {
  
  public static void addTemperatureSensor(Object obj) {
    int min = 0, max = 40;
    int value = (int) Math.floor(Math.random()*(max-min+1)+min);
    TemperatureSensor temperatureSensor = new TemperatureSensor(value);
    if (obj instanceof SmartStreet) {
      SmartStreet smartStreet = (SmartStreet) obj;
      smartStreet.sensorNodes.add(temperatureSensor);
    }
    else if (obj instanceof Apartment) {
      Apartment apartment = (Apartment) obj;
      apartment.sensorNodes.add(temperatureSensor);
    }
    else if (obj instanceof NetworkGateway) {
      NetworkGateway networkGateway = (NetworkGateway) obj;
      networkGateway.sensorNodes.add(temperatureSensor);
    }
    else {
      // Handle Exception
      System.out.println("Invalid instance.");
    }
  }

  public static void addMotionSensor(Object obj) {
    int min = 0, max = 10;
    int value = (int) Math.floor(Math.random()*(max-min+1)+min);
    MotionSensor motionSensor = new MotionSensor(value);
    if (obj instanceof SmartStreet) {
      SmartStreet smartStreet = (SmartStreet) obj;
      smartStreet.sensorNodes.add(motionSensor);
    }
    else if (obj instanceof Apartment) {
      Apartment apartment = (Apartment) obj;
      apartment.sensorNodes.add(motionSensor);
    }
    else if (obj instanceof NetworkGateway) {
      NetworkGateway networkGateway = (NetworkGateway) obj;
      networkGateway.sensorNodes.add(motionSensor);
    }
    else {
      // Handle Exception
      System.out.println("Invalid instance.");
    }
  }

  public static void addHumiditySensor(Object obj) {
    int min = 20, max = 60;
    int value = (int) Math.floor(Math.random()*(max-min+1)+min);
    HumiditySensor humiditySensor = new HumiditySensor(value);
    if (obj instanceof SmartStreet) {
      SmartStreet smartStreet = (SmartStreet) obj;
      smartStreet.sensorNodes.add(humiditySensor);
    }
    else if (obj instanceof Apartment) {
      Apartment apartment = (Apartment) obj;
      apartment.sensorNodes.add(humiditySensor);
    }
    else if (obj instanceof NetworkGateway) {
      NetworkGateway networkGateway = (NetworkGateway) obj;
      networkGateway.sensorNodes.add(humiditySensor);
    }
    else {
      // Handle Exception
      System.out.println("Invalid instance.");
    }
  }

  public static SmartMeter addSmartMeter() {
    int min = 0, max = 500;
    int value = (int) Math.floor(Math.random()*(max-min+1)+min);
    return new SmartMeter(value);
  }
}
