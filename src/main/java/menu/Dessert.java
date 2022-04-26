package menu;

public class Dessert extends MenuItem {
    public Dessert(String description, double price, String allergens){
        super(description, price, allergens);
    }

    @Override
    public MenuItem getOrderForTwo(){
        String descriptionTwoSpoons = this.getDescription() + " (two spoons)";
        Dessert dessertForTwo = new Dessert(descriptionTwoSpoons, price, getAllergens());
        return dessertForTwo;
    }

    @Override
    public MenuItem getOrderForTwo(String customDescription, double customPrice){
        Dessert customDessert = new Dessert(customDescription, customPrice, getAllergens());
        return customDessert;
    }

}
