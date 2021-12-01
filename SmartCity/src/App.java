import smartStreet.*;
import smartBuilding.SmartBuildingCollection;
import smartBuilding.FloorCollection;
import smartBuilding.ApartmentCollection;

import java.util.*;


public class App {

  public static void main(String[] args) {
    Map<Integer, SmartStreet> smartStreets = new HashMap<Integer, SmartStreet>();
    seed(smartStreets);
  }

  public static void seed(Map<Integer, SmartStreet> smartStreets) {
    // ---- SEEDERS ---- //
    int count = 0;
    smartStreets.put(++count, new SmartStreet(count, "My Smart Street 1"));
    smartStreets.put(++count, new SmartStreet(count, "My Smart Street 2"));

    SmartStreet smartStreet = smartStreets.get(1);

      // 1 Building
    SmartBuildingCollection.addBuilding(smartStreet, "Business", "Smart Building Location", 10);

      // 3 Floors
    FloorCollection.addFloor(smartStreet, 1, 0);
    FloorCollection.addFloor(smartStreet, 1, 1);
    FloorCollection.addFloor(smartStreet, 1, 2);

      // 2 apartements in each floor
    ApartmentCollection.addApartement(smartStreet, 1, 1);
    ApartmentCollection.addApartement(smartStreet, 1, 1);

    ApartmentCollection.addApartement(smartStreet, 1, 2);
    ApartmentCollection.addApartement(smartStreet, 1, 2);

    ApartmentCollection.addApartement(smartStreet, 1, 3);
    ApartmentCollection.addApartement(smartStreet, 1, 3);

    // Testing if everything works by printing apartement.
    System.out.println(smartStreet.smartBuildings.get(1).floors.get(1).apartments.get(1));

    // ---- SEEDERS ---- //
  }
}

