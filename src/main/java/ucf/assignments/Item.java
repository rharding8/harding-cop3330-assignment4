package ucf.assignments;

public class Item {
  private String description;
  private String date;
  private boolean completeness;

  public Item(String description, String date, boolean completeness) {
    this.description = description;
    this.date = date;
    this.completeness = completeness;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public boolean isCompleteness() {
    return completeness;
  }

  public void setCompleteness(boolean completeness) {
    this.completeness = completeness;
  }

  @Override
  public String toString() {
    return "This is where the added string will go in final code!";
  }
}
