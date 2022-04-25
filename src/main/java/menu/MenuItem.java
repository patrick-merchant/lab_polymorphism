package menu;

public abstract class MenuItem {
    private String description;
    public double price;
    private String allergens;

    MenuItem(String description, double price, String allergens){
        this.description = description;
        this.price = price;
        this.allergens = allergens;
    }

    public double getPrice(){
        return this.price;
    }



}
