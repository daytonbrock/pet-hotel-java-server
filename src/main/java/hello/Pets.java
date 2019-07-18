package hello;

public class Pets {

    private int id;
    private String name;
    private String breed;
    private String color;
    private Boolean checked_in;
    private int owner_id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Boolean getChecked() {
        return this.checked_in;
    }

    public void setChecked(Boolean checked_in){
        this.checked_in = checked_in;
    }

    public int getOwnerId() {
        return this.owner_id;
    }

    public void setOwnerId(int owner_id){
        this.owner_id = owner_id;
    }

    public Pets() {}

    public Pets(int id, String name, String breed, String color, Boolean checked_in, int owner_id) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.checked_in = checked_in;
        this.owner_id = owner_id;
    }

}