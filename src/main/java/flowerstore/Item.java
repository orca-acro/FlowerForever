package flowerstore;


public abstract class Item {
    public String description = "Item description";
    public abstract double getPrice();
    public String getDescription() {
        return this.description;
    }

}