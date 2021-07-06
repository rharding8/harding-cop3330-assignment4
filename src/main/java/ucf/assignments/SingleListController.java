/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Ryan Harding
 */

package ucf.assignments;

import javafx.collections.ObservableList;
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
  public Button sortButton;
  @FXML
  public Button addButton;
  @FXML
  public TextField dateField;
  @FXML
  public TextField descriptionField;
  @FXML
  public CheckBox completeBox;
  @FXML
  public Button saveButton;
  @FXML
  public Button updateButton;
  @FXML
  public Button removeButton;
  @FXML
  public Button backButton;
  @FXML
  public ListView<Item> itemDisplay;
  @FXML
  public Button dateSortButton;

  // ItemList to be given from TodoListController
  ItemList itemList;
  // ObservableList to store a sorted version of the list in
  ObservableList<Item> sortedList;

  @FXML
  public void backButtonClicked(ActionEvent actionEvent) {
    // Set stage to TodoList.fxml
    // Show stage
    // Close SingleList
  }

  @FXML
  public void addButtonClicked(ActionEvent actionEvent) {
    // Call addToList()
    // Call refresh()
  }

  @FXML
  public void removeButtonClicked(ActionEvent actionEvent) {
    // Call removeFromList() using selection from itemDisplay
    // Call refresh()
  }

  @FXML
  public void saveButtonClicked(ActionEvent actionEvent) {
    // Call saveList in TodoListIO using path from pathField and itemList
  }

  @FXML
  public void updateButtonClicked(ActionEvent actionEvent) {
    // Call updateItem() using selection from itemDisplay
    // Call refresh()
  }

  public void addToList() {
    // Bind completeBox to boolean value
    // Add new Item to items in itemList using the fields entered and boolean value
  }

  public void removeFromList(Item i) {
    // Remove i from "items" in itemList
  }

  public void updateItem(Item i) {
    // Bind completeBox to boolean value
    // Edit i using the fields entered and boolean value
  }

  public void initList(ItemList iL) {
    // Set itemList to iL
  }

  @FXML
  public void refresh() {
    // Set description and date fields to "null"
    // Set completeBox to false
    // Set the items in itemDisplay equal to items in itemList
  }

  @FXML
  public void sortButtonClicked(ActionEvent actionEvent) {
    // Call sortItemList()
    // Call refresh()
    // Set items in itemDisplay equal to sortedList
  }

  public void sortItemList() {
    // If itemDisplay is already showing sortedList
      // Set sortedList equal to the original list, un-sorting it
      // Return
    // Bind completeBox to boolean value
    // Set sortedList equal to return value of itemList.sortList() using the boolean value
  }

  public void dateSortClicked(ActionEvent actionEvent) {
    // Call dateSort()
    // Call refresh()
    // Set items in display equal to sortedList
  }

  public void dateSort() {
    // If itemDisplay is already showing sortedList
      // Set sortedList equal to the original list, un-sorting it
      // Return
    // Set sortedList equal to return value of itemList.sortByDate()
  }
}
