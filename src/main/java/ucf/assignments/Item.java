/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Ryan Harding
 */

package ucf.assignments;

public class Item {
  private String description;
  private String date;
  private boolean completion;

  public Item(String description, String date, boolean completion) {
    // Set this.description to given description
    // Set this.date to given date
    // Set this.completion to given completion
  }

  public String getDescription() {
    // Return description
    return "";
  }

  public void setDescription(String description) {
    // Set this.description to given description
  }

  public String getDate() {
    // Return date
    return "";
  }

  public void setDate(String date) {
    // Set this.date to given date
  }

  public boolean isComplete() {
    // Return completion
    return false;
  }

  public void setCompletion(boolean completion) {
    // Set this.completion to given completion
  }

  @Override
  public String toString() {
    // Create new String constructed as:
      // "On [DATE]: [DESCRIPTION]"
    // If completion is true
      // Append "(Complete)" to the String
    // Return the string
    return "";
  }
}
