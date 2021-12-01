import smartStreet.*;
import smartBuilding.SmartBuildingCollection;
import smartBuilding.FloorCollection;
import smartBuilding.ApartmentCollection;

public class App {
  public static void main(String[] args) {
    // // ---- SEEDERS ---- //

    SmartStreet smartStreet = new SmartStreet(0, "My Smart Street");

    // 1 Building
    SmartBuildingCollection.addBuilding(smartStreet, "Business", "Smart Building Location", 10);

    // 3 Floors
    FloorCollection.addFloor(smartStreet, 0, 0);
    FloorCollection.addFloor(smartStreet, 0, 1);
    FloorCollection.addFloor(smartStreet, 0, 2);

    // 2 apartements in each floor
    ApartmentCollection.addApartement(smartStreet, 0, 0);
    ApartmentCollection.addApartement(smartStreet, 0, 1);

    ApartmentCollection.addApartement(smartStreet, 1, 2);
    ApartmentCollection.addApartement(smartStreet, 1, 3);

    ApartmentCollection.addApartement(smartStreet, 2, 4);
    ApartmentCollection.addApartement(smartStreet, 2, 5);

    System.out.println(smartStreet.smartBuildings.get(0).floors.get(0).apartments.get(0));
    // // ---- SEEDERS ---- //
  }
}

