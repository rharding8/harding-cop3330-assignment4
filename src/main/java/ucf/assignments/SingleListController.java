package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SingleListController {
  @FXML
  Button addButton;
  @FXML
  TextField dateField;
  @FXML
  TextField descriptionField;
  @FXML
  Button backButton;
  @FXML
  ListView<Item> itemList;

  ObservableList<Item> list = FXCollections.observableArrayList();
  boolean completeFlag = false;

  public void backButtonClicked(ActionEvent actionEvent) throws IOException {
    // Use TodoList.fxml as the parent for a new scene
    // Create a new window
    // Set the created scene into new window and show window
  }

  @FXML
  public void addButtonClicked(ActionEvent actionEvent) {
    // Add new Item to "list" using the fields entered
    // Set items in itemList to list
    // refresh fields
  }
}
