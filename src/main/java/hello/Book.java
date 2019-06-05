package hello;

public class Book {

  private int id;
  private String title;
  private String author;
  private String published;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPublished() {
    return this.published;
  }

  public void setPublished(String published) {
    this.published = published;
  }

  public Book() {}

  public Book(int id, String title, String author, String name, String published) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.published = published;

  }
  
  
}