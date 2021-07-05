package ucf.assignments;

import javafx.collections.ObservableList;

public class TodoListIO {
  public void saveList(ItemList list, String path) {
    // Convert list into Json code
    // Save as Json file to file given by path
  }

  public void saveAllLists(ObservableList<ItemList> lists, String path) {
    // for (all ItemLists' in lists)
      // call saveList() using the ItemList and appending the title of said list and ".json" after path
  }

  public ItemList loadList(String path) {
    // Convert Json file given back into an ItemList
    // Return ItemList
    return null;
  }
}
