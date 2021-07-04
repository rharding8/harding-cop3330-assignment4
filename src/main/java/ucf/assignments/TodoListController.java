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

public class TodoListController {
  @FXML
  public ListView<ItemList> listOfLists;
  @FXML
  public Button addListButton;
  @FXML
  public Button editListButton;
  @FXML
  public Button removeListButton;
  @FXML
  public TextField titleField;
  @FXML
  public Button saveListsButton;
  @FXML
  public Button loadListButton;
  @FXML
  public TextField saveListField;
  @FXML
  public TextField loadListField;

  ObservableList<ItemList> list = FXCollections.observableArrayList();

  @FXML
  public void addListClicked(ActionEvent actionEvent) throws IOException {
    // Add new ItemList with title given in titleField to list
    // Set listOfLists to list
  }

  @FXML
  public void editListClicked(ActionEvent actionEvent) throws IOException {
    // Use SingleList.fxml to create a new window
    // Instantiate the controller
    // Set the list in that controller to the list chosen
    // Open the selected ItemList object in that window
  }

  @FXML
  public void removeListClicked(ActionEvent actionEvent) {
    // Remove the ItemList from list
    // Refresh the listOfLists
  }

  @FXML
  public void saveListsClicked(ActionEvent actionEvent) {
  }

  @FXML
  public void loadListClicked(ActionEvent actionEvent) {
  }
}
