package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
  private String title;
  private ObservableList<Item> items;

  public ItemList(String title) {
    this.title = title;
    items = FXCollections.observableArrayList();
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ObservableList<Item> getItems() {
    return items;
  }

  public void addItem(Item i) {
    items.add(i);
  }
}
