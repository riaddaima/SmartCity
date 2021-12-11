package UI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

import users.*;

public class loginController {

  @FXML
  private TextField username;

  @FXML
  private TextField password;

  @FXML
  public void loginHandler(ActionEvent e) throws IOException {
    try {
      User user = UserCollection.authenticate(username.getText(), password.getText());
      if (user instanceof GeneralAdmin) {
        ((Stage)((Node)e.getSource()).getScene().getWindow()).hide();           
        showAdminDashboard((GeneralAdmin) user);
      } else if (user instanceof Resident) {

      }
    } catch (InvalidCredentialsException error) {
      Alert alert = new Alert(AlertType.ERROR, error.getMessage(), ButtonType.OK);
      alert.showAndWait();
    }
  }

  public void showAdminDashboard(GeneralAdmin generalAdmin) throws IOException {
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("./fxml/DashboardAdmin.fxml"));

      Parent root = (Parent) loader.load();
      AdminDashboardController adc = loader.getController();
      adc.setGeneralAdmin(generalAdmin);

      Scene scene = new Scene(root);
      Stage stage = new Stage();
  
      stage.setTitle("Smart City");
      stage.setScene(scene);
      stage.show();
    } catch (IOException e) {
      throw e;
    }
  }
}
