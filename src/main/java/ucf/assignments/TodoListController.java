/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Ryan Harding
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

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
  @FXML
  public Button updateTitleButton;

  ObservableList<ItemList> list = FXCollections.observableArrayList();

  @FXML
  public void addListClicked(ActionEvent actionEvent) {
    // Call addList()
    // Call refresh()
  }

  @FXML
  public void editListClicked(ActionEvent actionEvent) {
    // Create a new scene with SingleList.fxml
    // Instantiate SingleListController (SLC)
    // Call initList in SLC using the selected ItemList
    // Show SLC with the title of the window being the title of the ItemList
  }

  @FXML
  public void removeListClicked(ActionEvent actionEvent) {
    // Call removeList with the ItemList selected in listOfLists
    // refresh()
  }

  @FXML
  public void saveListsClicked(ActionEvent actionEvent) {
    // Call saveAllLists() in TodoListIO using the path in saveListField and list
  }

  @FXML
  public void loadListClicked(ActionEvent actionEvent) {
    // If path in loadListField leads to folder
      // Set list equal to the return value of loadMultipleLists() in TodoListIO
    // Else
      // Add return value of loadList() in TodoListIO to list
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

  @FXML
  public void updateTitleClicked(ActionEvent actionEvent) {
    // Call updateTitle using selected ItemList from listOfLists
    // Call refresh()
  }

  public void updateTitle(ItemList i) {
    // Set title in i to text in titleField
  }
}
