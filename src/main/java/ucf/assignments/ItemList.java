/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Ryan Harding
 */

package ucf.assignments;

import javafx.collections.ObservableList;


public class ItemList {
  private String title;
  private ObservableList<Item> items;

  public ItemList(String title) {
    // Set this.title to given title
    // Initialize items as an observableArrayList
  }

  public String getTitle() {
    // Return title
    return "";
  }

  public void setTitle(String title) {
    // Set this.title to given title
  }

  public ObservableList<Item> getItems() {
    // Return items
    return null;
  }

  public void addItem(Item i) {
    // Add i to items
  }

  public ObservableList<Item> sortList(boolean completion) {
    // Create new ObservableList
    // for every Item in items
      // if Item.isComplete() is equal to completion
        // add Item to new list
    // Return new List
    return null;
  }

  public ObservableList<Item> sortByDate() {
    // Create new ObservableList and set equal to items
    // Sort the new list by the "date" string of each item in ascending order
    // Return new list
    return null;
  }
}
