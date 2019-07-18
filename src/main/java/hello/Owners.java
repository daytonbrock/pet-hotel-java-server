package hello;

public class Owners {

  private int id;
  private String name;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return this.name;
  }

  public void setTitle(String name) {
    this.name = name;
  }

  // public String getAuthor() {
  //   return this.author;
  // }

  // public void setAuthor(String author) {
  //   this.author = author;
  // }

  // public String getPublished() {
  //   return this.published;
  // }

  // public void setPublished(String published) {
  //   this.published = published;
  // }

  public Owners() {}

  public Owners(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
  
}