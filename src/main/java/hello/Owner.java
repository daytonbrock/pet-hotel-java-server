package hello;

public class Owner{
  private int id;
  private String name;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Default Constructor. Need one as the base, even though its empty.
  public Owner() {
  }

 // Overloaded Constructor -- takes args.
  public Owner(int id, String name) {
    this.id = id;
    this.name = name;
  }
}