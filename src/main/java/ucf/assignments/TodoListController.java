package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

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
  public void addListClicked(ActionEvent actionEvent) {
    // Call addList()
    // Call refresh()
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
    // Call removeList with the ItemList selected in listOfLists
    // refresh()
  }

  @FXML
  public void saveListsClicked(ActionEvent actionEvent) {
  }

  @FXML
  public void loadListClicked(ActionEvent actionEvent) {
  }

  public void addList() {
    // Add new ItemList with title given in titleField to list
  }

  public void removeList(ItemList i) {
    // Remove the element i from list
  }

  public void refresh() {
    // Set all fields to null
    // Set listOfLists' items to list
  }
}
