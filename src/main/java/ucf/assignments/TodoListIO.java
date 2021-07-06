/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Ryan Harding
 */

package ucf.assignments;

import javafx.collections.ObservableList;

public class TodoListIO {
  public static void saveList(ItemList list, String path) {
    // Convert list into Json code
    // Save as Json file to file given by path
  }

  public static void saveAllLists(ObservableList<ItemList> lists, String path) {
    // for (all ItemLists' in lists)
      // call saveList() using the ItemList and appending the title of said list and ".json" after path
  }

  public static ItemList loadList(String path) {
    // Convert Json file given back into an ItemList
    // Return ItemList
    return null;
  }
}
