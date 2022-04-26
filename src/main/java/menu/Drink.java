package menu;

public class Drink extends MenuItem {

    public Drink(String description, double price, String allergens){
        super(description, price, allergens);
    }


    @Override
    public MenuItem getOrderForTwo(){
        return null;
    }

    @Override
    public MenuItem getOrderForTwo(String customDescription, double customPrice){
        return null;
    }
}
