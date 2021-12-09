import smartStreet.*;
import smartBuilding.SmartBuildingCollection;
import smartBuilding.ApartmentCollection;

import java.util.*;

public class App {

  static Map<Integer, SmartStreet> smartStreets = new HashMap<Integer, SmartStreet>();
  public static void main(String[] args) {
    seed(smartStreets);
  }

  public static void seed(Map<Integer, SmartStreet> smartStreets) {
    // ---- SEEDERS ---- //
    
    int count = 0;
    smartStreets.put(++count, new SmartStreet(count, "My Smart Street 1"));
    smartStreets.put(++count, new SmartStreet(count, "My Smart Street 2"));

    SmartStreet smartStreet = smartStreets.get(1);

      // 1 Building
    SmartBuildingCollection.addBuilding(smartStreet, "Business", 10);

      // 2 apartements in each floor
    ApartmentCollection.addApartement(smartStreet, 1);
    ApartmentCollection.addApartement(smartStreet, 1);

    ApartmentCollection.addApartement(smartStreet, 1);
    ApartmentCollection.addApartement(smartStreet, 1);

    ApartmentCollection.addApartement(smartStreet, 1);
    ApartmentCollection.addApartement(smartStreet, 1);
    
    // ---- SEEDERS ---- //
  }
}

