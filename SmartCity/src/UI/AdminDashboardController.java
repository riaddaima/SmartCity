package UI;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.control.cell.PropertyValueFactory;

import smartStreet.SmartStreet;
import smartStreet.SmartStreetCollection;
import users.GeneralAdmin;

public class AdminDashboardController implements Initializable {

  @FXML
  private Label welcomeLabel;

  @FXML
  private TableView<SmartStreet> smartStreetsTable;

  @FXML
  private TableColumn<SmartStreet, Integer> IDCol;

  @FXML
  private TableColumn<SmartStreet, String> NameCol;

  @FXML
  private TextField StreetNameText;

  @FXML
  private Button ViewButton;

  ObservableList<SmartStreet> data = FXCollections.observableArrayList();
  SmartStreet selectedStreet;
  GeneralAdmin generalAdmin;

  @Override
  public void initialize(URL location, ResourceBundle resources) {

    seedTable();

    smartStreetsTable.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<SmartStreet>() {
      @Override
      public void changed(ObservableValue<? extends SmartStreet> observable,SmartStreet oldValue, SmartStreet newValue){
          if (newValue != null) {
            ViewButton.setDisable(false);
            selectedStreet = newValue;
          }
      }
    });

    IDCol.setCellValueFactory(
      new PropertyValueFactory<SmartStreet,Integer>("ID")
    );
    NameCol.setCellValueFactory(
        new PropertyValueFactory<SmartStreet,String>("name")
    );
    smartStreetsTable.setItems(data);
  }

  public void seedTable() {
    for (SmartStreet smartStreet : SmartStreetCollection.smartStreets.values()) {
      data.add(smartStreet);
    }
  }

  @FXML
  public void addToTable(ActionEvent e) {
    SmartStreet smartStreet = this.generalAdmin.addStreet(StreetNameText.getText());
    data.add(smartStreet);
    StreetNameText.setText("");
  }

  @FXML
  public void viewStreet(ActionEvent e) {
    System.out.println(selectedStreet);
  }

  public void setGeneralAdmin(GeneralAdmin generalAdmin) {
    this.generalAdmin = generalAdmin;
    welcomeLabel.setText(welcomeLabel.getText() + generalAdmin.getFullName());
  }

}
