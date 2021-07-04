package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class SingleListController {

  // All given FXML Fields:

  @FXML
  public TextField pathField;
  @FXML
  Button addButton;
  @FXML
  TextField dateField;
  @FXML
  TextField descriptionField;
  @FXML
  CheckBox completeBox;
  @FXML
  public Button saveButton;
  @FXML
  public Button editButton;
  @FXML
  Button removeButton;
  @FXML
  Button backButton;
  @FXML
  ListView<Item> itemDisplay;

  // ItemList to be given from TodoListController
  ItemList itemList;

  @FXML
  public void backButtonClicked(ActionEvent actionEvent) {
    // Set the scene to TodoList
    // Show scene
    // (OPTIONAL!!!) Return itemList back to TodoListController to ensure saved progress
  }

  @FXML
  public void addButtonClicked(ActionEvent actionEvent) {
    // call addToList()
    // refresh fields
  }

  @FXML
  public void removeButtonClicked(ActionEvent actionEvent) {
    // call removeFromList() using selection from itemDisplay
    // refresh fields
  }

  @FXML
  public void saveButtonClicked(ActionEvent actionEvent) {
    // LAST THING TO DO!!
  }

  @FXML
  public void editButtonClicked(ActionEvent actionEvent) {
    // call updateItem() using selection from itemDisplay
    // refresh fields
  }

  public void addToList() {
    // Bind the complete checkbox to a boolean value
    // Add new Item to the list "items" in itemList using the fields entered and boolean value
  }

  public void removeFromList(Item i) {
    // Remove i from "items" in itemList
  }

  public void updateItem(Item i) {
    // Bind the complete checkbox to a boolean value
    // Use the setter methods of Item in i to set the values to the fields entered and boolean value
  }

  public void initList(ItemList iL) {
    // Set itemList to iL
  }

  @FXML
  public void refresh() {
    // set description and date fields to "null"
    // set complete checkbox to indeterminate
    // set the items in itemDisplay equal to "items" in itemList
  }
}
