package ucf.assignments;

public class Item {
  private String description;
  private String date;
  private boolean completion;

  public Item(String description, String date, boolean completion) {
    this.description = description;
    this.date = date;
    this.completion = completion;
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

  public boolean isComplete() {
    return completion;
  }

  public void setCompletion(boolean completion) {
    this.completion = completion;
  }

  @Override
  public String toString() {
    return "This is where the added string will go in final code!";
  }
}
