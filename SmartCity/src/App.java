import smartStreet.SmartStreet;
import smartStreet.SmartStreetCollection;
import smartBuilding.SmartBuildingCollection;
import smartBuilding.ApartmentCollection;

import java.util.Map;
import java.util.HashMap;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;



public class App extends Application {

  static Map<Integer, SmartStreet> smartStreets = new HashMap<Integer, SmartStreet>();

  public static void main(String[] args) {
    launch();
    seed();
  }
  
  @Override
  public void start(Stage stage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("./UI/fxml/login.fxml"));
  
      Scene scene = new Scene(root);
      
      stage.setTitle("Smart City");
      stage.setScene(scene);
      stage.show();
  }

  public static void seed() {
    // ---- SEEDERS ---- //
    
    SmartStreet smartStreet = SmartStreetCollection.smartStreets.get(1);

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

