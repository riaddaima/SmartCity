package devices;
import java.util.concurrent.atomic.AtomicInteger;

import smartBuilding.Apartment;
import smartStreet.SmartStreet;


public class SensorNodesCollection {
	private static final AtomicInteger count = new AtomicInteger(0); // Auto-increment of SensorNode ID;
  
  public static void addTemperatureSensor(Object obj) {
    int min = 0, max = 40;
    int value = (int) Math.floor(Math.random()*(max-min+1)+min);
    TemperatureSensor temperatureSensor = new TemperatureSensor(count.incrementAndGet(), value);
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
    MotionSensor motionSensor = new MotionSensor(count.incrementAndGet(), value);
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
    HumiditySensor humiditySensor = new HumiditySensor(count.incrementAndGet(), value);
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
    return new SmartMeter(count.incrementAndGet(), value);
  }
}
